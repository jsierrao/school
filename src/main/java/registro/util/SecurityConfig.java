/*
 * package registro.util;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import registro.serviceImp.UsuarioServiceImp;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig extends
 * WebSecurityConfiguration {
 * 
 * @Autowired private UsuarioServiceImp usuario;
 * 
 * @Autowired private BCryptPasswordEncoder encode;
 * 
 * @Bean public BCryptPasswordEncoder passwordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * protected void configure(AuthenticationManagerBuilder auth)throws Exception {
 * auth.userDetailsService(usuario).passwordEncoder(encode); }
 * 
 * protected void configure(HttpSecurity http)throws Exception {
 * http.authorizeHttpRequests() .anyRequest() .authenticated() .and()
 * .httpBasic();
 * 
 * } }
 */