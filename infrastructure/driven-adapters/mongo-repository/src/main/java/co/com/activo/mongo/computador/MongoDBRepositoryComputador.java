package co.com.activo.mongo.computador;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryComputador extends ReactiveMongoRepository<ComputadorData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<ComputadorData/* change for adapter model */> {
}
