package co.com.activo.mongo.computador;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryComputadorAdapter extends AdapterOperations<Computador/* change for domain model */, ComputadorData/* change for adapter model */, String, MongoDBRepositoryComputador>
// implements ModelRepository from domain
{

    public MongoRepositoryComputadorAdapter(MongoDBRepositoryComputador repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Computador.class/* change for domain model */));
    }
}
