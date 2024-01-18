package com.corenetworks.demoCapas.servicio;

import com.corenetworks.demoCapas.modelo.Imueble;
import com.corenetworks.demoCapas.repositorio.IRepoIMUEBLE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ServicioImueble implements ISERVICIOImueble{
    @Autowired
    private IRepoIMUEBLE capoRepo;
    @Override
    public String insertar(Imueble i) {
        return capoRepo.insertar(i);
    }
}
