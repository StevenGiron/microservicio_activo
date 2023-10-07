package co.com.activo.api.dto;

import co.com.activo.model.responsable.Responsable;
import lombok.Data;

@Data
public class ResponsableDto {
    private String nombreCompleto;
    private String correoPersonal;
    private EmpresaDto empresa;

}
