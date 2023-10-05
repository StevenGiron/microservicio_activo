package co.com.activo.mongo.fijo;


import co.com.activo.mongo.common.MuebleriaData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "fijo")
//@NoArgsConstructor
//@AllArgsConstructor
public class FijoData extends MuebleriaData {
}
