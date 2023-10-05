package co.com.activo.mongo.monitor;

import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.model.activos.tecnologicos.monitor.gateways.MonitorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@AllArgsConstructor
public class MonitorRepositoryImpl implements MonitorRepository {
    private final MongoRepositoryMonitorAdapter dao;
    @Override
    public Flux<Monitor> obtenerMonitores() {
        return dao.findAll();
    }
}
