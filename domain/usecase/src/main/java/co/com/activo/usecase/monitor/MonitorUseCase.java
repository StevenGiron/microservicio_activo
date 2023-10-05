package co.com.activo.usecase.monitor;

import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.model.activos.tecnologicos.monitor.gateways.MonitorRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class MonitorUseCase {
    private final MonitorRepository monitorRepository;
    public Flux<Monitor> obtenerMonitores() {
        return monitorRepository.obtenerMonitores();
    }
}
