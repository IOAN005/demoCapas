package com.corenetworks.demoCapas.repositorio;

import com.corenetworks.demoCapas.modelo.Pedido;
import org.springframework.stereotype.Repository;

@Repository

public class RepoPedidos implements IRepoPedido {

    @Override
    public String insertar(Pedido p) {
        return String.format("Capo repo %s",p.toString());
    }
}
