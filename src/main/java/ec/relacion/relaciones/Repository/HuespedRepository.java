package ec.relacion.relaciones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.relacion.relaciones.entitiy.Huesped;

@Repository
public interface HuespedRepository  extends JpaRepository<Huesped, Long>{
    
}
