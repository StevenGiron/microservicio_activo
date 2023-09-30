package co.com.activo.usecase.activo;

import co.com.activo.model.commons.Activo;
import co.com.activo.model.commons.gateways.ActivoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@AllArgsConstructor
public class ActivoUseCase {

    private final ActivoRepository activoRepository;

    public Mono<Activo> guardar(Activo activo) {
        return activoRepository.guardar(activo);
    }

    public Flux<Activo> obtener() {
        return activoRepository.obtener();
    }

}
