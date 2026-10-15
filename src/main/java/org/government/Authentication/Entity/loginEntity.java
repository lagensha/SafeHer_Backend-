package org.government.Authentication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class loginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private String  username;
     private String password;
     private String email;
}
