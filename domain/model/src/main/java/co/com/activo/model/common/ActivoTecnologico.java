package co.com.activo.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class ActivoTecnologico extends Activo {
    protected String marca;
    protected String ubicacion;
    protected String detalle;
    protected LocalDateTime fechaExpiracionGarantia;
    protected String detalleDeLaGarantia;
}
