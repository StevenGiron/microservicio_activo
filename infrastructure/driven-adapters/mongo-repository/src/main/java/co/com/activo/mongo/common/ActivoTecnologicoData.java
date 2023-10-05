package co.com.activo.mongo.common;

import co.com.activo.mongo.activo.ActivoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivoTecnologicoData extends ActivoData {
    protected String marca;
    protected String ubicacion;
    protected String detalle;
    protected LocalDateTime fechaExpiracionGarantia;
    protected String detalleDeLaGarantia;
}
