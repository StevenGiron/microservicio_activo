package co.com.activo.model.activos.tecnologicos.computador;

import co.com.activo.model.commons.ActivoTecnologico;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Computador extends ActivoTecnologico {
    private String procesador;
    private String ram;
    private String discoDuro;

}
