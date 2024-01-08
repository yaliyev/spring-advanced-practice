package az.developia.july30.jwt.jwtsessionapplicationrest.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import az.developia.july30.jwt.jwtsessionapplicationrest.model.AuthenticationResponse;
import az.developia.july30.jwt.jwtsessionapplicationrest.service.UserService;
import az.developia.july30.jwt.jwtsessionapplicationrest.util.JwtUtil;

@RestController
public class JwtAuthenticationController {

	
	
//	private AuthenticationManager authenticationManager;
	
//	 public JwtAuthenticationController(AuthenticationManager authenticationManager, UserService userService, JwtUtil jwtUtil) {
//	        this.authenticationManager = authenticationManager;
//	        this.userService = userService;
//	        this.jwtUtil = jwtUtil;
//	    }
	
	private UserService userService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@GetMapping("/test")
	public String testMethod() {
		return "Hello World";
	}
	
	@PostMapping("/generate")
	public ResponseEntity<AuthenticationResponse> generateNewToken(@RequestBody HashMap<String, String> request){
		
		System.out.println(request.get("ordinarytext"));
		final String jwt = jwtUtil.generateToken(request.get("ordinarytext"));
		return new ResponseEntity<>(new AuthenticationResponse(jwt),HttpStatus.OK);
	}
	
	@GetMapping("/validate")
    public ResponseEntity<?> getProtectedResource(@RequestHeader("Authorization") String token) {
        String jwt = ""; 

       
        if (token != null && token.startsWith("Bearer ")) {
            jwt = token.substring(7);
            System.out.println(jwt);
            if (jwtUtil.validateTokenWithSigningKey(jwt)) {
                return ResponseEntity.ok("Access granted to the protected resource!");
            }
        }

       
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid or expired token.");
    }
	
//	@PostMapping("/authenticate")
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest){
//		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
//		
//		UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());
//		
//		String jwt  = jwtUtil.generateToken(userDetails.getUsername());
//		
//		return new ResponseEntity( new AuthenticationResponse(jwt) ,HttpStatus.OK);
//	}
}
