package registro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import registro.excepciones.EstadoExcepcion;
import registro.util.ManejoError;

@RestControllerAdvice
@Component
public class ControllerExcepciones {

	@ExceptionHandler(EstadoExcepcion.class)
	public ResponseEntity<ManejoError>errorEstado(RuntimeException ex){
		ManejoError error = ManejoError.builder().code(String.valueOf(HttpStatus.NOT_FOUND))
				.message(ex.getMessage()).build();
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND) ;
	
	}
	
	
	
}
