package com.corenetworks.demoCapas.servicio;

import com.corenetworks.demoCapas.modelo.Factura;
import com.corenetworks.demoCapas.repositorio.IREPOFACTURA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioFactura implements ISERVICIOFACTURA{
    @Autowired
    private IREPOFACTURA capaRepo;
    @Override
    public String insertar(Factura f) {
        return capaRepo.insertar(f);
    }
}
