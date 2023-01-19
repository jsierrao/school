package registro.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import registro.modelo.Estudiantes;
import registro.response.Response;
import registro.service.EstudianteService;

@RequestMapping(value = "/registroUnico")
@RestController
public class EstudianteController {

	@Autowired
	EstudianteService service;

	
	@GetMapping("/listaPorDocumento")
	public ResponseEntity<Response> listarPorIdentificacion(Integer numDocIdentidad){
		Response rsp = service.listarPorIdentidad(numDocIdentidad);
				return new ResponseEntity<>(rsp,HttpStatus.OK); 
		
		
		
	}

	
	@GetMapping("/listar")
	public ResponseEntity<Response> listaPorEstado(@RequestParam(value = "estado", required = true) String estado) {
		Response rsp = service.listarPorEstado(estado);
		return new ResponseEntity<>(rsp,HttpStatus.OK);
	}
	
	

	@PostMapping("/registro")
	public ResponseEntity<Response> crear(@RequestBody Estudiantes estudiantes) {
		Response rsp = service.crear(estudiantes);
		return new ResponseEntity<>(rsp, HttpStatus.OK);
		

	}

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Response> eliminar(@PathVariable("id") Long id) {
		return service.eliminar(id);

	}

	@PutMapping("/actualizar")
	public ResponseEntity<Response> actualizar(@RequestBody Estudiantes estudiantesNew) {
		return service.actualizar(estudiantesNew);
	}

}
