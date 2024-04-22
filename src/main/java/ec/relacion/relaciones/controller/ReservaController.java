package ec.relacion.relaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.relacion.relaciones.entitiy.Reserva;
import ec.relacion.relaciones.service.ReservaService;

@RestController
@RequestMapping("api/v1/reservas")
public class ReservaController {
    
    @Autowired
    private ReservaService serviceR;

    @GetMapping
    public List<Reserva> listarTodo(){
        return  serviceR.getAllReservas();
    }

    //POST
    @PostMapping
    public Reserva crear(@RequestBody Reserva reserva){
        return serviceR.createReserva(reserva);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        serviceR.deleteReservaById(id);
    }
}
