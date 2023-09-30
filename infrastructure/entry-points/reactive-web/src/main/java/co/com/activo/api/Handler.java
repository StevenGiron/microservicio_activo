package co.com.activo.api;

import co.com.activo.api.dto.ActivoDto;
import co.com.activo.model.commons.Activo;
import co.com.activo.usecase.activo.ActivoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class Handler {
    private final ActivoUseCase useCase;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Activo> saveActivo(@RequestBody ActivoDto data) {
        return useCase.guardar(data.toEntity());
    }

    @GetMapping(value = "/obtener", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Map<String, Object>>> getActivo() {
        Map<String, Object> response = new HashMap<>();
        return useCase.obtener()
                .collectList()
                .map(activosList -> {
                    response.put("activos", activosList);
                    return ResponseEntity
                            .ok()
                            .contentType(MediaType.APPLICATION_JSON)
                            .body(response);
                });
    }
}
