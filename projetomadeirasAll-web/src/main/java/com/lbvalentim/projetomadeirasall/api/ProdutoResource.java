package com.lbvalentim.projetomadeirasall.api;

import com.lbvalentim.projetomadeirasall.model.Produto;
import com.lbvalentim.projetomadeirasall.service.AbstractCrudService;
import com.lbvalentim.projetomadeirasall.service.ProdutoService;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author LF
 */
@Path("produtos")
public class ProdutoResource extends AbstractCrudResource<Produto> {
    @Inject
    private ProdutoService service;
    
    @Override
    protected AbstractCrudService<Produto> getService() {
        return service;
    }
    
}
