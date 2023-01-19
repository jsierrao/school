package registro.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import registro.modelo.Estudiantes;

@Getter
@Setter
public class Response {
	
	
	private String code;
	private String message;
	
	@JsonProperty("listado")
	@JsonInclude(value = Include.NON_NULL)
	private List<Estudiantes> estudiantes;
	

}
