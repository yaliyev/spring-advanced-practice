package az.developia.july30.jwt.jwtsessionapplicationrest.util;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import az.developia.july30.jwt.jwtsessionapplicationrest.service.UserService;

@Component
public class JwtRequestFilter {
	//extends OncePerRequestFilter
   @Autowired
   private  UserService userService;
   
   @Autowired
   private  JwtUtil jwtUtil;
   
//   @Override
//   protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,FilterChain chain) {
//	   final String authorizationHeader = request.getHeader("Authorization");
//	   
//	   String username = null;
//	   String jwt = null;
//	   
//	   if(authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//		   jwt = authorizationHeader.substring(7);
//		   username = jwtUtil.extractUsername(jwt);
//	   }
//	   
//	   if(username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//		   UserDetails userDetails = this.userService.loadUserByUsername(username);
//		   
//		   if(jwtUtil.validateToken(jwt, username)) {
//			   UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken 
//			    = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
//			   usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//			   SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//		   }
//	   }
//			   
//   }
   
}
