package org.government.Authentication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    Long id;
    String name;
    String email;
    String phoneNumber;
    String password;
}
