package co.com.activo.mongo.common;

import co.com.activo.mongo.activo.ActivoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MuebleriaData extends ActivoData {
    protected String fabricante;
    protected String ubicacion;
    protected Integer cantidad;
    protected String detalle;
}
