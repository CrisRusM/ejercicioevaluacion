package com.salesianostriana.dam.ejercicioevaluacion.controller;

import com.salesianostriana.dam.ejercicioevaluacion.model.BusRouteResponseDto;
import com.salesianostriana.dam.ejercicioevaluacion.model.Ruta;
import com.salesianostriana.dam.ejercicioevaluacion.repository.RutaRepository;
import com.salesianostriana.dam.ejercicioevaluacion.service.RutaService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RutaController {

    private final RutaRepository rutaRepository;
    private final RutaService rutaService;

    @GetMapping("/bus-route")
    public List<BusRouteResponseDto> getAll(){
        List<Ruta> lista=rutaRepository.findAll();
        List<BusRouteResponseDto> listaResponse=new ArrayList<BusRouteResponseDto>();
        lista.forEach(r -> listaResponse.add(rutaService.toDtoResponse(r)) );
        return listaResponse;
    }

    @GetMapping("/bus-route/{id}")
    public BusRouteResponseDto getById(@PathVariable long id){
        Ruta ruta=rutaRepository.findById(id).orElse(null);
        return rutaService.toDtoResponse(ruta);
    }

}
