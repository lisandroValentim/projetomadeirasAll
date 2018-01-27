package com.lbvalentim.projetomadeirasall.service;

import com.lbvalentim.projetomadeirasall.model.Cliente;
import com.lbvalentim.projetomadeirasall.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 *
 * @author LF
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ClienteService extends AbstractCrudService<Cliente> {
    
    @Inject
    private GenericDao<Cliente> dao;

    @Override
    protected GenericDao<Cliente> getDao() {
        return dao;
    }
    
    
}
