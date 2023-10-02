package co.com.activo.model.activos.muebleria.fijo.gateways;

import co.com.activo.model.activos.muebleria.fijo.Fijo;
import reactor.core.publisher.Flux;

public interface FijoRepository {
    public Flux<Fijo> obtenerFijos();
}
