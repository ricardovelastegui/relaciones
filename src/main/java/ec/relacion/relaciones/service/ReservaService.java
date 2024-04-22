package ec.relacion.relaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.relacion.relaciones.Repository.ReservaRepository;
import ec.relacion.relaciones.entitiy.Reserva;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;
    
    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }

    //crear
    public Reserva createReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }
    
    //eliminar
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}
