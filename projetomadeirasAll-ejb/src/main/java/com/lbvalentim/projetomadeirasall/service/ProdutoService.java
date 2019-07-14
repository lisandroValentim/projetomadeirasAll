package com.lbvalentim.projetomadeirasall.service;

import com.lbvalentim.projetomadeirasall.model.Produto;
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
public class ProdutoService extends AbstractCrudService<Produto> {
    
    @Inject
    private GenericDao<Produto> dao;

    @Override
    protected GenericDao<Produto> getDao() {
        return dao;
    }    
}
