package co.com.activo.usecase.licencia;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.abstractos.licencia.gateways.LicenciaRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class LicenciaUseCase {
    private final LicenciaRepository licenciaRepository;

    public Flux<Licencia> obtenerLicencias() {
        return licenciaRepository.obtenerLicencias();
    }
}
