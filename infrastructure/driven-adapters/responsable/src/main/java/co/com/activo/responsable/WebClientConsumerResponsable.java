package co.com.activo.responsable;

import co.com.activo.model.responsable.Responsable;
import co.com.activo.model.responsable.gateways.ResponsableRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@AllArgsConstructor
public class WebClientConsumerResponsable implements ResponsableRepository {
    private final WebClient webClient;

    @Override
    public Mono<Responsable> obtenerResponsable(String id) {
        return webClient.get()
                .uri("/obtenerEmpleadoPorId/{id}", id)
                .retrieve()
                .bodyToMono(ResponsableRequest.class)
                .map(ResponsableRequest::mapper);
    }
}
