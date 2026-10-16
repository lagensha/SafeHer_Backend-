package org.government.Authentication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class loginDTO {
    private String  username;
    private String password;
    private String email;
}

