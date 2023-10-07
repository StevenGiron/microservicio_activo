package co.com.activo.model.responsable;

import co.com.activo.model.empresa.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class  Responsable {
    private String id;
    private String nombreCompleto;
    private String correoPersonal;
    private Empresa empresa;

}
