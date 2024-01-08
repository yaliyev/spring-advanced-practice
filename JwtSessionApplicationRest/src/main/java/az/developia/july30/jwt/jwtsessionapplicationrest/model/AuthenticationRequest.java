package az.developia.july30.jwt.jwtsessionapplicationrest.model;

import lombok.Data;

@Data
public class AuthenticationRequest {
  private String username;
  private String password;
}
