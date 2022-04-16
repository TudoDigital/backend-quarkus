package com.dynamics.domain.tipopromocao;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "tipopromocao")
public interface TipoPromocaoResource extends PanacheEntityResource<TipoPromocao, Short> {

    @MethodProperties(exposed = false)
    TipoPromocao update(Short aShort, TipoPromocao tipoPromocao);

    @MethodProperties(exposed = false)
    TipoPromocao add(TipoPromocao tipoPromocao);

    @MethodProperties(exposed = false)
    boolean delete(Short aShort);
}
