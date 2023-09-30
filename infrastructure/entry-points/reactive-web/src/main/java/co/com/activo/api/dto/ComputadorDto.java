package co.com.activo.api.dto;

import co.com.activo.model.activos.tecnologicos.computador.Computador;
import co.com.activo.model.common.ActivoTecnologico;
import lombok.Data;

@Data
public class ComputadorDto extends ActivoTecnologico {

    private String procesador;
    private String ram;
    private String discoDuro;

    public Computador toEntity() {
        return Computador.builder()
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
                .procesador(procesador)
                .ram(ram)
                .discoDuro(discoDuro)
                .build();
    }
}
