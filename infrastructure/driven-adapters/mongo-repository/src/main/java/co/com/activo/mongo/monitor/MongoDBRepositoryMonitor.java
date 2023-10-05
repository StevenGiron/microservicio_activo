package co.com.activo.mongo.monitor;

import co.com.activo.mongo.computador.ComputadorData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryMonitor extends ReactiveMongoRepository<MonitorData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<MonitorData/* change for adapter model */> {
}
