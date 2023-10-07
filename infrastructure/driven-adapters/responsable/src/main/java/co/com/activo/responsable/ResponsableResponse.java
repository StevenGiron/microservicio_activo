package co.com.activo.responsable;

import co.com.activo.model.responsable.Responsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsableResponse {
    private String nombreCompleto;
    private String correoPersonal;
    private String nombreEmpresa;
}

