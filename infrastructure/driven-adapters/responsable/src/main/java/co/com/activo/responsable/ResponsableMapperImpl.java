package co.com.activo.responsable;

import co.com.activo.model.responsable.Responsable;
import org.springframework.stereotype.Component;

@Component
public class ResponsableMapperImpl implements ResponsableMapper {

    @Override
    public Responsable responsableRequestToResponsable(ResponsableRequest responsableRequest) {

        Responsable responsable = new Responsable();

        responsable.setNombreCompleto(responsableRequest.getNombreCompleto());
        responsable.setCorreoPersonal(responsableRequest.getCorreoPersonal());
        responsable.setNombreEmpresa(responsableRequest.getEmpresa().getNombre());

        return responsable;
    }
}
