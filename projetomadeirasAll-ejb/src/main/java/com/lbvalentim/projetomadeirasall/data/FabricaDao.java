package com.lbvalentim.projetomadeirasall.data;

import java.lang.reflect.ParameterizedType;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class FabricaDao {
    @Produces
    public GenericDAO criar(InjectionPoint injectionPoint){
        ParameterizedType type = (ParameterizedType) injectionPoint.getType();
        Class classe = (Class) type.getActualTypeArguments()[0];
        return new GenericDAO(classe);
    }
    
}
