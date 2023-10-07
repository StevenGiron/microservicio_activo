package co.com.activo.responsable;

import co.com.activo.model.responsable.Responsable;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ResponsableMapper {
    ResponsableMapper mapper = Mappers.getMapper(ResponsableMapper.class);

    @Mapping(source = "empresa.nombre", target = "nombreEmpresa")
    Responsable responsableRequestToResponsable(ResponsableRequest responsableRequest);

}
