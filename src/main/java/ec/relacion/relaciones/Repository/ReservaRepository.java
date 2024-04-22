package ec.relacion.relaciones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.relacion.relaciones.entitiy.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    
}
