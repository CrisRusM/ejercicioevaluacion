package com.salesianostriana.dam.ejercicioevaluacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Ruta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String codigo;
    private String origen;
    private String destino;
    private String descripcion;
    private double distancia;
    private int frecuenciaMinutos;

}
