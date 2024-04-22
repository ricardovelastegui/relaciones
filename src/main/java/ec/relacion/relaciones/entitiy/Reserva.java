package ec.relacion.relaciones.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReserva;


    private String fechaEntrada;
    private String fechaSalida;
    private Double valor;
    private String formaPago;
    
}
