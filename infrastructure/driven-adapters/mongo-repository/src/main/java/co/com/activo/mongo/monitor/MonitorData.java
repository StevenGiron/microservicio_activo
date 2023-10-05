package co.com.activo.mongo.monitor;

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
@Document(collection = "monitor")
public class MonitorData extends ActivoTecnologicoData {
    public String pulgadas;
}
