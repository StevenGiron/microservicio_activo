package co.com.activo.api.dto;

import co.com.activo.model.common.ActivoTecnologico;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class ActivoTecnologicoDto extends ActivoDto {
    protected String marca;
    protected String ubicacion;
    protected String detalle;
    protected LocalDateTime fechaExpiracionGarantia;
    protected String detalleDeLaGarantia;

}
