package co.com.activo.mongo.licencia;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.abstractos.licencia.gateways.LicenciaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@AllArgsConstructor
public class LicenciaRepositoryImpl implements LicenciaRepository {
    private final MongoRepositoryLicenciaAdapter dao;
    @Override
    public Flux<Licencia> obtenerLicencias() {
        return dao.findAll();
    }
}
