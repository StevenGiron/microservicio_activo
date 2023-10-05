package co.com.activo.mongo.mantenimiento;


import co.com.activo.mongo.common.MuebleriaData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "mantenimiento")
public class MantenimientoData extends MuebleriaData {
    private String responsableDeMantenimientoId;
}
