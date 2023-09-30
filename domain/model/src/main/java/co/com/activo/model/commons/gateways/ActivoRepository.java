package co.com.activo.model.commons.gateways;

import co.com.activo.model.commons.Activo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ActivoRepository {
    public Mono<Activo> guardar(Activo activo);
    public Flux<Activo> obtener();
}
