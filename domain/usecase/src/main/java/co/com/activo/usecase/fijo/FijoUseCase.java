package co.com.activo.usecase.fijo;

import co.com.activo.model.activos.muebleria.fijo.Fijo;
import co.com.activo.model.activos.muebleria.fijo.gateways.FijoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class FijoUseCase {
    private final FijoRepository fijoRepository;
    public Flux<Fijo> obtenerFijos() {
        return fijoRepository.obtenerFijos();
    }
}
