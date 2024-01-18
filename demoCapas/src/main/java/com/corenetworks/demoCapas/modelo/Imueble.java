package com.corenetworks.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Imueble {
    private String referencia;
    private String rutaFotoPequena;
    private String rutaFotoGrande;
    private String descripcion;

}
