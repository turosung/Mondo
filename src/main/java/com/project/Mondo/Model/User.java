package com.project.Mondo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.GenerationType;

import lombok.Data;

import static java.lang.Boolean.TRUE;

@Data
@Entity
@Table(name = "USERS")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String username;
 private String password;
 private boolean enabled;
 private String email;

 @Column(nullable = true, length = 250)
 private String image;

 // Constructors:
 public User() {
  this.enabled = TRUE;
 }

 public User(String username, String password, String email) {
  this.username = username;
  this.email = email;
  this.password = password;
  this.enabled = TRUE;
 }

 public User(String username, String email, String password, boolean enabled) {
  this.username = username;
  this.email = email;
  this.password = password;
  this.enabled = enabled;
 }

 public User(Long id, String username, String email) {
  this.id = id;
  this.username = username;
  this.email = email;
 }

 public User(String username, String email, String password, boolean enabled, String image) {
  this.username = username;
  this.email = email;
  this.password = password;
  this.enabled = enabled;
  this.image = image;
 }

 // Getters and Setters to be used in Controller files by calling them
 public Long getId() {
  return this.id;
 }

 public void setId(Long id) {
  this.id = id;
 }

 public String getUsername() {
  return this.username;
 }

 public String getPassword() {
  return this.password;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public String getImage() {
  return this.image;
 }

 public void setImage(String image) {
  this.image = image;
 }

 public String getEmail() {
  return this.email;
 }

 public void setEmail(String email) {
  this.email = email;
 }
}

