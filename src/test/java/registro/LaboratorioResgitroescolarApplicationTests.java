/*
 * package registro;
 * 
 * import static org.junit.jupiter.api.Assertions.assertAll; import static
 * org.junit.jupiter.api.Assertions.assertTrue;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * import registro.modelo.Usuario; import
 * registro.repositorio.UsuarioRepository; import registro.util.SecurityConfig;
 * 
 * @SpringBootTest class LaboratorioResgitroescolarApplicationTests {
 * 
 * @Autowired UsuarioRepository repo;
 * 
 * @Autowired BCryptPasswordEncoder encoder;
 * 
 * @Test void creacionUsuarioTest() { Usuario us = new Usuario(); us.setId(2);
 * us.setUsuario("administrador");
 * us.setContraseña(encoder.encode("Kjkszpj2022"));
 * 
 * Usuario retorno = repo.save(us);
 * 
 * assertTrue(retorno.getContraseña().equalsIgnoreCase(us.getContraseña())); }
 * 
 * }
 */