package co.com.activo.model.activos.abstractos.licencia.gateways;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import reactor.core.publisher.Flux;

public interface LicenciaRepository {
    public Flux<Licencia> obtenerLicencias();
}
