package com.example.demoparkapi.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "users")
public class Users implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Long id;

@Column(name= "username", nullable = false, unique = true, length = 100)
 private String username;

@Column(name = "password", nullable = false, length = 200)
 private String password;

@Enumerated(EnumType.STRING)  /// transforma o nome da constante em string no banco de dados
@Column(name = "role", nullable = false, length = 25)
 private Role role;

@Column(name = "create_data")
 ///registra data e hora do momento do insert do registro
 private LocalDateTime crateData;

@Column(name = "modify_data")
 /// registra quando faz a modificação
 private LocalDateTime modifyData;


@Column(name = "make_by")
 /// registra o nome do usuario que fez a operação de insert tabela
 private String makeBy;


@Column(name = "modify_by")
 /// registra o usuario que fez a operação de update na tabela
 private String modifyBy;

 public enum Role{
     ROLE_ADMIN, ROLE_CLIENT
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Users users = (Users) o;
  return Objects.equals(id, users.id);
 }

 @Override
 public int hashCode() {
  return Objects.hash(id);
 }

 @Override
 public String toString() {
  return "Users{" +
          "id=" + id +
          '}';
 }
}
