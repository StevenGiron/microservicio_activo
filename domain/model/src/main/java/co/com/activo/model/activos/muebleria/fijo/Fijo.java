package co.com.activo.model.activos.muebleria.fijo;
import co.com.activo.model.common.Muebleria;
import lombok.*;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Fijo extends Muebleria {
}
