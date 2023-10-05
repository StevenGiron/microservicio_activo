package co.com.activo.mongo.mantenimiento;

import co.com.activo.mongo.licencia.LicenciaData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface MongoDBRepositoryMantenimiento extends ReactiveMongoRepository<MantenimientoData/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<MantenimientoData/* change for adapter model */> {
}
