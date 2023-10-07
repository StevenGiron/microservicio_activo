package co.com.activo.api.dto;

import co.com.activo.model.common.Activo;
import co.com.activo.model.responsable.Responsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class ActivoDto {

    protected Responsable responsable;
    protected LocalDateTime fechaDeCompra;
    protected Integer numeroDeFactura;
    protected String descripcion;
    protected Activo.Estado estado;

    public Activo toEntity() {
        return Activo.builder()
                .responsable(responsable)
                .fechaDeCompra(fechaDeCompra)
                .numeroDeFactura(numeroDeFactura)
                .descripcion(descripcion)
                .estado(estado)
                .build();
    }
}
