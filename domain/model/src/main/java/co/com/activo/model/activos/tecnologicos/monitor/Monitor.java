package co.com.activo.model.activos.tecnologicos.monitor;

import co.com.activo.model.commons.ActivoTecnologico;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Monitor extends ActivoTecnologico {
    private String pulgadas;

}
