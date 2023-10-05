package co.com.activo.usecase.computador;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.model.activos.tecnologicos.computador.gateways.ComputadorRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class ComputadorUseCase {
    private final ComputadorRepository computadorRepository;

    public Flux<Computador> obtenerComputadores() {
        return computadorRepository.obtenerComputadores();
    }
}
