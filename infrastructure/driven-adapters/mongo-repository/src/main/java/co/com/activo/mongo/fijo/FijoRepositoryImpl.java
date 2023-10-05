package co.com.activo.mongo.fijo;

import co.com.activo.model.activos.muebleria.fijo.Fijo;
import co.com.activo.model.activos.muebleria.fijo.gateways.FijoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@AllArgsConstructor
public class FijoRepositoryImpl implements FijoRepository {
    private final MongoRepositoryFijoAdapter dao;
    @Override
    public Flux<Fijo> obtenerFijos() {
        return dao.findAll();
    }
}
