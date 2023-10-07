package co.com.activo.mongo.activo;

import co.com.activo.model.responsable.Responsable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "activo")
public class ActivoData {
    @Id
    protected String id;
    protected Responsable responsable;
    protected LocalDateTime fechaDeCompra;
    protected Integer numeroDeFactura;
    protected String descripcion;
    protected String estado;
}
