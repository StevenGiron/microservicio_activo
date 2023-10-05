package co.com.activo.usecase.mantenimiento;

import co.com.activo.model.activos.muebleria.mantenimiento.Mantenimiento;
import co.com.activo.model.activos.muebleria.mantenimiento.gateways.MantenimientoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class MantenimientoUseCase {
    private final MantenimientoRepository mantenimientoRepository;

    public Flux<Mantenimiento> obtenerMantenimientos() {
        return mantenimientoRepository.obtenerMantenimientos();
    }
}
