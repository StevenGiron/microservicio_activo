package co.com.activo.api;

import co.com.activo.model.activos.abstractos.licencia.Licencia;
import co.com.activo.model.activos.muebleria.fijo.Fijo;
import co.com.activo.model.activos.muebleria.mantenimiento.Mantenimiento;
import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.usecase.computador.ComputadorUseCase;
import co.com.activo.usecase.fijo.FijoUseCase;
import co.com.activo.usecase.licencia.LicenciaUseCase;
import co.com.activo.usecase.mantenimiento.MantenimientoUseCase;
import co.com.activo.usecase.monitor.MonitorUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class Api {

    private final ComputadorUseCase computadorUseCase;
    private final MonitorUseCase monitorUseCase;
    private final LicenciaUseCase licenciaUseCase;
    private final FijoUseCase fijoUseCase;
    private final MantenimientoUseCase mantenimientoUseCase;

    @GetMapping(value = "/obtenerActivos", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Map<String, Object>>> getActivo() {
        Flux<Computador> computadorFlux = computadorUseCase.obtenerComputadores();
        Flux<Monitor> monitorFlux = monitorUseCase.obtenerMonitores();
        Flux<Fijo> fijoFlux  = fijoUseCase.obtenerFijos();
        Flux<Mantenimiento> mantenimientoFlux  = mantenimientoUseCase.obtenerMantenimientos();
        Flux<Licencia> licenciaFlux  = licenciaUseCase.obtenerLicencias();

        Map<String, Object> response = new HashMap<>();

        return Flux.merge(computadorFlux, monitorFlux, fijoFlux, mantenimientoFlux, licenciaFlux)
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
