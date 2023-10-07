package co.com.activo.model.responsable.gateways;

import co.com.activo.model.responsable.Responsable;
import reactor.core.publisher.Mono;

public interface ResponsableRepository {
    public Mono<Responsable> obtenerResponsable(String id);
}
