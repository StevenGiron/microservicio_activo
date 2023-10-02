package co.com.activo.model.activos.tecnologicos.computador.gateways;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ComputadorRepository {
    public Flux<Computador> obtenerComputadores();

}
