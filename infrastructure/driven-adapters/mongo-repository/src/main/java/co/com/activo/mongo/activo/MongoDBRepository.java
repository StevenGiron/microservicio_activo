package co.com.activo.mongo.activo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepository extends ReactiveMongoRepository<ActivoData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<ActivoData/* change for adapter model */> {
}
