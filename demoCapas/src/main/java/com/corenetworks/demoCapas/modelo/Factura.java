package com.corenetworks.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Factura {
    private int idFactura;
    private LocalDate fechaFactura;
    private double importe;


}
