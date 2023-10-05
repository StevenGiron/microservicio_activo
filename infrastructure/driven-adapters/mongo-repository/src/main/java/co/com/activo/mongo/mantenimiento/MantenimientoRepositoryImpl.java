package co.com.activo.mongo.mantenimiento;

import co.com.activo.model.activos.muebleria.mantenimiento.Mantenimiento;
import co.com.activo.model.activos.muebleria.mantenimiento.gateways.MantenimientoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@AllArgsConstructor
public class MantenimientoRepositoryImpl implements MantenimientoRepository {

    private final MongoRepositoryMantenimientoAdapter dao;
    @Override
    public Flux<Mantenimiento> obtenerMantenimientos() {
        return dao.findAll();
    }
}
