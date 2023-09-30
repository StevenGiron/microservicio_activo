package co.com.activo.api.dto;

import co.com.activo.model.common.ActivoTecnologico;

import java.time.LocalDateTime;

public class ActivoTecnologicoDto extends ActivoDto {
    private String marca;
    private String ubicacion;
    private String detalle;
    private LocalDateTime fechaExpiracionGarantia;
    private String detalleDeLaGarantia;

    public ActivoTecnologico toEntity() {
        return ActivoTecnologico.builder()
                .responsableId(responsableId)
                .fechaDeCompra(fechaDeCompra)
                .numeroDeFactura(numeroDeFactura)
                .descripcion(descripcion)
                .estado(estado)
                .marca(marca)
                .ubicacion(ubicacion)
                .detalle(detalle)
                .fechaExpiracionGarantia(fechaExpiracionGarantia)
                .detalleDeLaGarantia(detalleDeLaGarantia)
                .build();
    }
}
