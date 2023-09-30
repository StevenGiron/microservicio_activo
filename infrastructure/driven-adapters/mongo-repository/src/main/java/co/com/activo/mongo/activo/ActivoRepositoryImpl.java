package co.com.activo.mongo.activo;

import co.com.activo.model.commons.Activo;
import co.com.activo.model.commons.gateways.ActivoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@AllArgsConstructor
public class ActivoRepositoryImpl implements ActivoRepository {

    private final MongoRepositoryAdapter dao;

    @Override
    public Mono<Activo> guardar(Activo activo) {
        return dao.save(activo);
    }

    @Override
    public Flux<Activo> obtener() {
        return dao.findAll();
    }
}
