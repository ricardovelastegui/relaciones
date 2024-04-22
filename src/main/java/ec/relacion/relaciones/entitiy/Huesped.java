package ec.relacion.relaciones.entitiy;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idhuesped;


    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Reserva> reservas = new ArrayList<>();


    
}
