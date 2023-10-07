package co.com.activo.responsable;

import co.com.activo.model.responsable.Responsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsableRequest {
    private String id;
    private String nombreCompleto;
    private String correoPersonal;
    private EmpresaRequest empresa;

    public Responsable mapper() {
        return Responsable.builder()
                .id(id)
                .nombreCompleto(nombreCompleto)
                .correoPersonal(correoPersonal)
                .empresa(empresa.mapper()
                ).build();
    }
}
