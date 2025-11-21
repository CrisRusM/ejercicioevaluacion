package com.salesianostriana.dam.ejercicioevaluacion.service;

import com.salesianostriana.dam.ejercicioevaluacion.model.BusRouteRequestDto;
import com.salesianostriana.dam.ejercicioevaluacion.model.BusRouteResponseDto;
import com.salesianostriana.dam.ejercicioevaluacion.model.Ruta;
import com.salesianostriana.dam.ejercicioevaluacion.repository.RutaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.salesianostriana.dam.ejercicioevaluacion.model.BusRouteRequestDto.toRuta;
import static com.salesianostriana.dam.ejercicioevaluacion.model.BusRouteResponseDto.toResponse;

@Service
@RequiredArgsConstructor
public class RutaService {

    private final RutaRepository rutaRepository;

    public BusRouteResponseDto toDtoResponse(Ruta r){

            return toResponse(r);


    }

    public Ruta RequestToRuta(BusRouteRequestDto r){
        return toRuta(r);
    }


}
