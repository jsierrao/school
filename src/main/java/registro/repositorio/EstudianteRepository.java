package registro.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import registro.modelo.Estudiantes;
import registro.response.Response;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {

	@Query(value = "select * from estudiantes where estado= :estado", nativeQuery = true)
	List<Estudiantes> buscarPorEstado(@Param("estado") String estado);
	
	
	@Query(value ="select * from estudiantes where num_Doc_Identidad = :numDocIdentidad",nativeQuery = true)
	List<Estudiantes>buscarPorIdentidad(@Param("numDocIdentidad") Integer numDocIdentidad);

}
