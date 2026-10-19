package org.government.Authentication.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Login")
public class LoginEntity {
     private String  username;
     private String password;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String email;
}
