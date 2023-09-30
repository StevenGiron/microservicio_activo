package co.com.activo.mongo.activo;

import co.com.activo.model.commons.Activo;
import co.com.activo.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<Activo/* change for domain model */, ActivoData/* change for adapter model */, String, MongoDBRepository>
// implements ModelRepository from domain
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Activo.class/* change for domain model */));
    }
}
