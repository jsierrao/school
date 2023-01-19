package registro.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import registro.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByUsuario(String usuario);

}
