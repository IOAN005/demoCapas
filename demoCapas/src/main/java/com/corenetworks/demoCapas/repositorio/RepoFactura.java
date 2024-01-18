package com.corenetworks.demoCapas.repositorio;

import com.corenetworks.demoCapas.modelo.Factura;
import com.corenetworks.demoCapas.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository

public class RepoFactura implements IREPOFACTURA {
    @Override
    public String insertar(Factura f) {
        return String.format("Capo repo simulando BBDD %s",f.toString());
    }
}
