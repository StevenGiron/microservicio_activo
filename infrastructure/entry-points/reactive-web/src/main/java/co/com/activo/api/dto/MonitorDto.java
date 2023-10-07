package co.com.activo.api.dto;

import co.com.activo.model.activos.tecnologicos.monitor.Monitor;
import co.com.activo.model.common.ActivoTecnologico;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MonitorDto extends ActivoTecnologico {
    private String pulgadas;

    public Monitor toEntity() {
        return Monitor.builder()
                .responsable(responsable)
                .fechaDeCompra(fechaDeCompra)
                .numeroDeFactura(numeroDeFactura)
                .descripcion(descripcion)
                .estado(estado)
                .marca(marca)
                .ubicacion(ubicacion)
                .detalle(detalle)
                .fechaExpiracionGarantia(fechaExpiracionGarantia)
                .detalleDeLaGarantia(detalleDeLaGarantia)
                .pulgadas(pulgadas)
                .build();
    }
}
