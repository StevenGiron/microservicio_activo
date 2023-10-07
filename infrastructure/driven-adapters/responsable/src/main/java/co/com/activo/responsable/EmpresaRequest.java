package co.com.activo.responsable;

import co.com.activo.model.empresa.Empresa;
import lombok.Data;

@Data
public class EmpresaRequest {
    private String id;
    private String nombre;
    private String nit;
    private String ubicacion;

    public Empresa mapper() {
        return Empresa.builder()
                .nombre(nombre)
                .ubicacion(ubicacion)
                .build();
    }
}
