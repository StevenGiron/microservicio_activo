package co.com.activo.responsable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsableRequest {
    private String nombreCompleto;
    private String correoPersonal;
    private EmpresaRequest empresa;
}
