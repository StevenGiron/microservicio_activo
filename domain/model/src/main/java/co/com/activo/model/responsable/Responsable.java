package co.com.activo.model.responsable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Responsable {
    private String nombreCompleto;
    private String correoPersonal;
    private String nombreEmpresa;
}
