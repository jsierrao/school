package registro.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import registro.modelo.Estudiantes;
import registro.response.Response;

public interface EstudianteService {

	public Response listarPorEstado(String estado);

	public Response crear(Estudiantes estudianteDto);

	public ResponseEntity<Response> eliminar(Long id);

	public ResponseEntity<Response> actualizar(Estudiantes estudianteDto);
	
	public Response listarPorIdentidad(Integer numDocIdentidad);

}
