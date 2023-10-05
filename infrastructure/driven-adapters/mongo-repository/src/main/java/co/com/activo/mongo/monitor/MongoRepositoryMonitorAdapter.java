package co.com.activo.mongo.monitor;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.mongo.computador.ComputadorData;
import co.com.activo.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryMonitorAdapter extends AdapterOperations<Monitor/* change for domain model */, MonitorData/* change for adapter model */, String, MongoDBRepositoryMonitor>
// implements ModelRepository from domain
{

    public MongoRepositoryMonitorAdapter(MongoDBRepositoryMonitor repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Monitor.class/* change for domain model */));
    }
}
