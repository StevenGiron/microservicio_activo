package co.com.activo.usecase.responsable;

import co.com.activo.model.responsable.Responsable;
import co.com.activo.model.responsable.gateways.ResponsableRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ResponsableUseCase {
    private final ResponsableRepository responsableRepository;

    public Mono<Responsable> obtenerResponsable(String id) {
        return responsableRepository.obtenerResponsable(id);
    }
}
