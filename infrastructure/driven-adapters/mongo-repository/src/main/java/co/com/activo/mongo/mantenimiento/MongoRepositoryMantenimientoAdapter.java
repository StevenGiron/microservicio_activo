package co.com.activo.mongo.mantenimiento;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.muebleria.mantenimiento.Mantenimiento;
import co.com.activo.mongo.helper.AdapterOperations;
import co.com.activo.mongo.licencia.LicenciaData;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryMantenimientoAdapter extends AdapterOperations<Mantenimiento/* change for domain model */, MantenimientoData/* change for adapter model */, String, MongoDBRepositoryMantenimiento>
// implements ModelRepository from domain
{

    public MongoRepositoryMantenimientoAdapter(MongoDBRepositoryMantenimiento repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Mantenimiento.class/* change for domain model */));
    }
}
