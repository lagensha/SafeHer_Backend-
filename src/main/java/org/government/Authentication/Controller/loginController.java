package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.loginDTO;
import org.government.Authentication.Service.Impl.loginService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/login")
public class loginController {
    final loginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?>loginUser(@RequestBody loginDTO loginDTO){
      try{
          loginService.loginUser(loginDTO);
          return ResponseEntity.ok(Map.of("message","Login successful"));
      }catch (RuntimeException e){
          return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                  .body(Map.of("message",e.getMessage()));
      }
    }
}
