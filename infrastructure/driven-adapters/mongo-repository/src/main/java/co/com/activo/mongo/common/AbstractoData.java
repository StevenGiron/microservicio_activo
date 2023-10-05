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
public class AbstractoData extends ActivoData {
    protected String url;
}
