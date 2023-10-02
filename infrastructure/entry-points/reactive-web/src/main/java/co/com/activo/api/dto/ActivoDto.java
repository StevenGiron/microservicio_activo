package co.com.activo.api.dto;

import co.com.activo.model.common.Activo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class ActivoDto {

    protected String responsableId;
    protected LocalDateTime fechaDeCompra;
    protected Integer numeroDeFactura;
    protected String descripcion;
    protected Activo.Estado estado;

    public Activo toEntity() {
        return Activo.builder()
                .responsableId(responsableId)
                .fechaDeCompra(fechaDeCompra)
                .numeroDeFactura(numeroDeFactura)
                .descripcion(descripcion)
                .estado(estado)
                .build();
    }
}
