package registro.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
public class ManejoError {
	
	  @JsonProperty(value = "code")
	    @JsonPropertyDescription(value = "Código del error que se presentó en el servicio ")
	    private String code;

	    @JsonProperty(value = "message")
	    @JsonPropertyDescription(value = "Descripción del mensaje de error")
	    private String message;

}
