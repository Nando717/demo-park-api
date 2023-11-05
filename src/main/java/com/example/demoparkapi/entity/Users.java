package com.example.demoparkapi.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class Users implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "id")
 private Long id;


 private String username;
 private String password;
 private Role role;

 ///registra data e hora do momento do insert do registro
 private LocalDateTime crateData;

 /// registra quando faz a modificação
 private LocalDateTime modifyData;

 /// registra o nome do usuario que fez a operação de insert tabela
 private String makeBy;

 /// registra o usuario que fez a operação de update na tabela
 private String modifyBy;

 public enum Role{
     ROLE_ADMIN, ROLE_CLIENT
 }

}
