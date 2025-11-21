package com.salesianostriana.dam.ejercicioevaluacion.model;

public record BusRouteResponseDto(long id,
                                  String codigo,
        String origen,
        String destino,
        String descripcion,
        double distancia,
        int frecuenciaMinutos) {

    public static BusRouteResponseDto toResponse(Ruta r){
        return new BusRouteResponseDto(r.getId(),
                r.getCodigo(),
                r.getOrigen(),
                r.getDestino(),
                r.getDescripcion(),
                r.getDistancia(),
                r.getFrecuenciaMinutos());
    }

}
