package co.com.activo.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Muebleria extends Activo {
    protected String fabricante;
    protected String ubicacion;
    protected Integer cantidad;
    protected String detalle;
}
