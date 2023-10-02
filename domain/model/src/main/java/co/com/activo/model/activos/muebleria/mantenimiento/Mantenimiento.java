package co.com.activo.model.activos.muebleria.mantenimiento;

import co.com.activo.model.common.Muebleria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Mantenimiento extends Muebleria {
    private String responsableDeMantenimientoId;
}
