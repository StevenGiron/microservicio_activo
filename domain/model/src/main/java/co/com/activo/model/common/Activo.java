package co.com.activo.model.common;

import co.com.activo.model.responsable.Responsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public class Activo {
    public enum Estado {
        OPERATIVO, VENCIDO, DANADO, REPARACION, TRANSPORTE, CONFLICTO, PERDIDO, ACTIVO, INACTIVO;
    }

    protected String id;
    protected Responsable responsable;
    protected LocalDateTime fechaDeCompra;
    protected Integer numeroDeFactura;
    protected String descripcion;
    protected Estado estado;
}
