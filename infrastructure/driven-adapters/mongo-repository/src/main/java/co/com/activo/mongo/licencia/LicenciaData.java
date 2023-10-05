package co.com.activo.mongo.licencia;


import co.com.activo.mongo.common.AbstractoData;
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
@Document(collection = "licencia")
public class LicenciaData extends AbstractoData {
    private String proveedor;
    private LocalDateTime fechaVencimiento;
}
