package co.com.activo.model.activos.tecnologicos.monitor.gateways;

import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import reactor.core.publisher.Flux;

public interface MonitorRepository {
    public Flux<Monitor> obtenerMonitores();
}
