package org.government.Authentication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class register {
    int id;
    String name;
    String email;
    int phoneNumber;
    String password;
}
