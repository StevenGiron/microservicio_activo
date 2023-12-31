package co.com.activo.model.activos.tecnologicos.computador;

import co.com.activo.model.common.ActivoTecnologico;
import lombok.*;
import lombok.experimental.SuperBuilder;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Computador extends ActivoTecnologico {
    private String procesador;
    private String ram;
    private String discoDuro;

}
