package ec.relacion.relaciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.relacion.relaciones.Repository.HuespedRepository;
import ec.relacion.relaciones.entitiy.Huesped;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //mostrar huesped

    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //crear huesped
    public Huesped creatHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }
    
    //eliminar huesped
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }

}
