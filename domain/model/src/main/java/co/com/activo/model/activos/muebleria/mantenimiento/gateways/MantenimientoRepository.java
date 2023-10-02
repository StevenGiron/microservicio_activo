package co.com.activo.model.activos.muebleria.mantenimiento.gateways;

import co.com.activo.model.activos.muebleria.mantenimiento.Mantenimiento;
import reactor.core.publisher.Flux;

public interface MantenimientoRepository {
    public Flux<Mantenimiento> obtenerMantenimientos();
}
