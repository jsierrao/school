package registro.modelo;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
;
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudiantes")
public class Estudiantes {
	 
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "Nombres")
	private String nombres;
	
	
	@Column(name = "Apellidos")
	private String apellidos;
	
	
	@Column(name = "Curso")
	private String curso;
	
	@Column(name ="numDocIdentidad")
	private Integer numDocIdentidad;
	
	@Column(name = "Estado")
	private String estado;
	
	
	
	
	
	
	
	

}
