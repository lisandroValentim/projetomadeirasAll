package com.lbvalentim.projetomadeirasall.api;

import com.lbvalentim.projetomadeirasall.model.Cliente;
import com.lbvalentim.projetomadeirasall.service.AbstractCrudService;
import com.lbvalentim.projetomadeirasall.service.ClienteService;
import javax.inject.Inject;
import javax.ws.rs.Path;

/**
 *
 * @author LF
*/
@Path("clientes")
public class ClienteResource extends AbstractCrudResource<Cliente> {
    @Inject
    private ClienteService service;

    @Override
    protected AbstractCrudService<Cliente> getService() {
        return service;
    }

    
}
