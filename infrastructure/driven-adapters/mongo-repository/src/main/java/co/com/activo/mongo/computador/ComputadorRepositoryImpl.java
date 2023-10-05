package co.com.activo.mongo.computador;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.model.activos.tecnologicos.computador.gateways.ComputadorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@AllArgsConstructor
public class ComputadorRepositoryImpl implements ComputadorRepository {

    private final MongoRepositoryComputadorAdapter dao;
    @Override
    public Flux<Computador> obtenerComputadores() {
        return dao.findAll();
    }
}
