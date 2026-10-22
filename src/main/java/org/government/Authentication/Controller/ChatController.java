package org.government.Authentication.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatController {

    private Long id;
    private  String sender;
    private String content;

}
