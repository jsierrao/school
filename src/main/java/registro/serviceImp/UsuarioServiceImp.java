/*
 * package registro.serviceImp;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.GrantedAuthority; import
 * org.springframework.security.core.authority.SimpleGrantedAuthority; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import registro.modelo.Usuario; import
 * registro.repositorio.UsuarioRepository;
 * 
 * @Service public class UsuarioServiceImp {///implements UserDetailsService
 * 
 * 
 * @Autowired UsuarioRepository repo;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { Usuario us = repo.findByUsuario(username);
 * 
 * List<GrantedAuthority>roles = new ArrayList<>(); roles.add(new
 * SimpleGrantedAuthority("ADMIN"));
 * 
 * return new User(us.getUsuario(),us.getContraseña(),roles);
 * 
 * }
 * 
 * 
 * }
 */