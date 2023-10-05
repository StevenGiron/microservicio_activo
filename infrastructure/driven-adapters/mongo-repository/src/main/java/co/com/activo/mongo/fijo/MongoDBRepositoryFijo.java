package co.com.activo.mongo.fijo;

import co.com.activo.mongo.licencia.LicenciaData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryFijo extends ReactiveMongoRepository<FijoData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<FijoData/* change for adapter model */> {
}
