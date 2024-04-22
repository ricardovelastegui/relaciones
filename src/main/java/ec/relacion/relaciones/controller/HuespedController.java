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

import ec.relacion.relaciones.entitiy.Huesped;
import ec.relacion.relaciones.service.HuespedService;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {
    
    @Autowired
    private HuespedService huespedService;

    //get

    @GetMapping
    public List<Huesped> listarTodo(){
        return huespedService.getAllHuespedes();
    }

    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped){
        return huespedService.creatHuesped(huesped);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}
