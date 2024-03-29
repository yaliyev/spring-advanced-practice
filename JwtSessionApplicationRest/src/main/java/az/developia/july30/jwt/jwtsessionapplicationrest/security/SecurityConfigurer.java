package az.developia.july30.jwt.jwtsessionapplicationrest.security;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import az.developia.july30.jwt.jwtsessionapplicationrest.service.UserService;
import az.developia.july30.jwt.jwtsessionapplicationrest.util.JwtRequestFilter;

public class SecurityConfigurer{
	
}
//@Configuration
//public class SecurityConfigurer extends WebSecurityConfigurerAdapter{
//
//	
//   private final UserService userService;
//   
//   @Autowired
//   private final JwtRequestFilter jwtRequestFilter;
//   
//   public SecurityConfigurer(UserService userService,JwtRequestFilter jwtRequestFilter) {
//	   this.userService = userService;
//	   this.jwtRequestFilter = jwtRequestFilter;
//   }
//   
//   // attempt 1
////   @Override
////   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////	   auth.userDetailsService(userService);
////   }
////   
////   @Override
////   protected void configure(HttpSecurity http) throws Exception {
////	   http.csrf().disable().
////	     authorizeRequests().antMatchers("/authenticate").permitAll()
////	     .anyRequest().authenticated().and()
////	     .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////	    http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
////   }
////   
//
//   // attempt 2
//   
//   @Override
//   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       auth.userDetailsService(userService);
//   }
//
//   @Override
//   protected void configure(HttpSecurity http) throws Exception {
//               http
//               .authorizeRequests()
//               .antMatchers("/test").permitAll()
//               .antMatchers("/authenticate").permitAll()
//               .anyRequest().authenticated().and()
//               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//       http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
//   }
//
//   
//   @Bean
//   public PasswordEncoder passwordEncoder() {
//	   return NoOpPasswordEncoder.getInstance();
//   }
//   
//   @Override
//   @Bean
//   public AuthenticationManager authenticationManagerBean() throws Exception {
//	   return super.authenticationManagerBean();
//   }
//
//}
