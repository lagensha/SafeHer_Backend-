package org.government.Authentication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin_LoginDTO {
    private Long id;
    private String password;
    private String email;
}
