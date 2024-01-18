package com.corenetworks.demoCapas.repositorio;

import com.corenetworks.demoCapas.modelo.Imueble;
import org.springframework.stereotype.Repository;

@Repository

public class RepoImueble implements IRepoIMUEBLE{

    @Override
    public String insertar(Imueble i) {
        return String.format("capo repo %s",i.toString());
    }
}
