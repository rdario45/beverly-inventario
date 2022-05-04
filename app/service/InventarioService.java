package service;

import com.google.inject.Inject;
import domain.Compra;
import repository.InventarioRepository;

import java.util.UUID;

public class InventarioService {

    private InventarioRepository repository;

    @Inject
    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    /*
     * used by AgendasController
     * */
    public Compra save(Compra compra) {
        compra.setId(UUID.randomUUID().toString());
        return repository.save(compra);
    }

}
