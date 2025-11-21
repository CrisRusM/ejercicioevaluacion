package com.salesianostriana.dam.ejercicioevaluacion.model;

public record BusRouteRequestDto(
                                    String codigo,
                                 String origen,
                                 String destino,
                                 String descripcion,
                                 double distancia,
                                 int frecuenciaMinutos) {

    public static Ruta toRuta(BusRouteRequestDto request){
        return new Ruta().builder()
                .codigo(request.codigo())
                .origen(request.origen())
                .destino(request.destino())
                .distancia(request.distancia())
                .frecuenciaMinutos(request.frecuenciaMinutos())
                .descripcion(request.descripcion())
                .build();
    }



}
