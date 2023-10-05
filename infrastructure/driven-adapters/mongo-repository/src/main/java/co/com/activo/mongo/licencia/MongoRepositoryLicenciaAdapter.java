package co.com.activo.mongo.licencia;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.mongo.helper.AdapterOperations;
import co.com.activo.mongo.monitor.MonitorData;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryLicenciaAdapter extends AdapterOperations<Licencia/* change for domain model */, LicenciaData/* change for adapter model */, String, MongoDBRepositoryLicencia>
// implements ModelRepository from domain
{

    public MongoRepositoryLicenciaAdapter(MongoDBRepositoryLicencia repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Licencia.class/* change for domain model */));
    }
}
