package registro.serviceImp;

import java.lang.Integer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import registro.excepciones.EstadoExcepcion;
import registro.modelo.Estudiantes;
import registro.repositorio.EstudianteRepository;
import registro.response.Response;
import registro.service.EstudianteService;

@Service
public class EstudianteServiceImp implements EstudianteService {

	@Autowired
	EstudianteRepository repositorio;

	@Override
	public Response listarPorEstado(String estado) {

		List<Estudiantes> queryEstudiantes = null;
		Response rsp = new Response();

		if (estado.toLowerCase().compareToIgnoreCase("activo") == 0
				|| estado.toLowerCase().compareToIgnoreCase("inactivo") == 0) {
			queryEstudiantes = repositorio.buscarPorEstado(estado);
			rsp.setCode(String.valueOf(HttpStatus.OK));
			rsp.setMessage("Listado  generado");
			rsp.setEstudiantes(queryEstudiantes);
			return rsp;
		} else if (!"activo".equals(estado) || !"inactivo".equals(estado)) {
			rsp.setCode(String.valueOf(HttpStatus.NOT_FOUND));
			rsp.setMessage("estado no valido");
			return rsp;
		}

		return rsp;

	}

	@Override
	public Response listarPorIdentidad(Integer numDocIdentidad) {

		List<Estudiantes> query = null ;
		Response rsp = new Response();
		if(numDocIdentidad != null){
		query = repositorio.buscarPorIdentidad(numDocIdentidad);
		rsp.setCode(String.valueOf(HttpStatus.OK));
		rsp.setMessage("documento  encontrado");
		rsp.setEstudiantes(query);
		return rsp;}
		else{
			rsp.setCode(String.valueOf(HttpStatus.BAD_REQUEST));
			rsp.setMessage("formato no valido");
		};
		return rsp;
		

	}

	@Override
	public Response crear(Estudiantes estudiante) {
		Estudiantes stu = repositorio.save(estudiante);
		Response rsp = new Response();
		if (stu.getId() != null) {
			rsp.setCode("200");
			rsp.setMessage("Creado exitosamente");
		}
		return rsp;
	}

	@Override
	public ResponseEntity<Response> eliminar(Long id) {
		Response rsp = new Response();
		if (repositorio.findById(id).isPresent()) {
			repositorio.deleteById(id);
			rsp.setCode("200");
			rsp.setMessage("elimiacion correcta");
		} else {
			rsp.setCode("404");
			rsp.setMessage("estudiante no existe");
			return new ResponseEntity<>(rsp, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(rsp, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Response> actualizar(Estudiantes estudiante) {
		Response rsp = new Response();
		if (repositorio.findById(estudiante.getId()).isPresent()) {
			Estudiantes stuActualizado = new Estudiantes();
			stuActualizado.setNombres(estudiante.getNombres());
			stuActualizado.setApellidos(estudiante.getApellidos());
			stuActualizado.setCurso(estudiante.getCurso());
			stuActualizado.setNumDocIdentidad(estudiante.getNumDocIdentidad());
			stuActualizado.setEstado(estudiante.getEstado());
			repositorio.save(stuActualizado);
			repositorio.delete(estudiante);
			rsp.setCode("200");
			rsp.setMessage("Actualizado correctamente");
		} else {
			rsp.setCode("400");
			rsp.setMessage("Error al actualizar");
			return new ResponseEntity<>(rsp, HttpStatus.BAD_REQUEST);

		}
		return new ResponseEntity<>(rsp, HttpStatus.OK);

	}

}