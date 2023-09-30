package co.com.activo.api.dto;

import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.model.common.Activo;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MonitorDto extends ActivoDto{
    private String pulgadas;

    public Monitor toEntity() {
        return Monitor.builder()
                .responsableId(responsableId)
                .fechaDeCompra(fechaDeCompra)
                .numeroDeFactura(numeroDeFactura)
                .descripcion(descripcion)
                .estado(estado)
                .pulgadas(pulgadas)
                .build();
    }
}
