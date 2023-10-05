package co.com.activo.mongo.fijo;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.muebleria.fijo.Fijo;
import co.com.activo.mongo.helper.AdapterOperations;
import co.com.activo.mongo.licencia.LicenciaData;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryFijoAdapter extends AdapterOperations<Fijo/* change for domain model */, FijoData/* change for adapter model */, String, MongoDBRepositoryFijo>
// implements ModelRepository from domain
{

    public MongoRepositoryFijoAdapter(MongoDBRepositoryFijo repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Fijo.class/* change for domain model */));
    }
}
