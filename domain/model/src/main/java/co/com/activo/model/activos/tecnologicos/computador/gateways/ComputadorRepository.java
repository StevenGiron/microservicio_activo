package co.com.activo.model.activos.tecnologicos.computador.gateways;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import reactor.core.publisher.Mono;

public interface ComputadorRepository {
    public Mono<Computador> guardar(Computador computador);
}
