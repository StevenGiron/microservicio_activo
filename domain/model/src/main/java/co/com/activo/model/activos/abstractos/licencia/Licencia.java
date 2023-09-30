package co.com.activo.model.activos.abstractos.licencia;

import co.com.activo.model.common.Abstracto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Licencia extends Abstracto {
    private String proveedor;
    private LocalDateTime fechaVencimiento;
}
