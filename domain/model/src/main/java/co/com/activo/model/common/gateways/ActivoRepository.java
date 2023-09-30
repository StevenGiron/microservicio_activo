package co.com.activo.model.common.gateways;

import co.com.activo.model.common.Activo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ActivoRepository {
    public Mono<Activo> guardar(Activo activo);
    public Flux<Activo> obtener();
}
