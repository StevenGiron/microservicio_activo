package co.com.activo.mongo.computador;

import co.com.activo.mongo.activo.ActivoTecnologicoData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "computador")
public class ComputadorData extends ActivoTecnologicoData {
    private String procesador;
    private String ram;
    private String discoDuro;
}
