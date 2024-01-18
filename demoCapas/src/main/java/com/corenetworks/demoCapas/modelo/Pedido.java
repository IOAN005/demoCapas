package com.corenetworks.demoCapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    @Value("1")
    private int idPedidos;
    @Value("2024-01-18")
    private LocalDate fechaPedido;
    @Value("Empresa")
    private String formaEnvio;
    @Value("Credito")
    private String formaPago;
    @Value("300")
    private double importe;
}
