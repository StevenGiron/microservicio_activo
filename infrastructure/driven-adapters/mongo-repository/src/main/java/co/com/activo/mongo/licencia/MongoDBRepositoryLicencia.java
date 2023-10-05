package co.com.activo.mongo.licencia;

import co.com.activo.mongo.monitor.MonitorData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryLicencia extends ReactiveMongoRepository<LicenciaData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<LicenciaData/* change for adapter model */> {
}
