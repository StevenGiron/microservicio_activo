package co.com.activo.model.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class ActivoTecnologico extends Activo {
    protected String marca;
    protected String ubicacion;
    protected String detalle;
    protected String fechaExpiracionGarantia;
    protected String detalleDeLaGarantia;
}
