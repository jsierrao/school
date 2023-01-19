package registro.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Usuario {

	
	@Id
	private int id;
	private String usuario;
	private String contraseña;
	
}
