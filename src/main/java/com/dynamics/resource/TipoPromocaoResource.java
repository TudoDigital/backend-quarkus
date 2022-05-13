package com.dynamics.resource;

import com.dynamics.domain.TipoPromocaoDomain;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.MethodProperties;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "tipopromocao")
public interface TipoPromocaoResource extends PanacheEntityResource<TipoPromocaoDomain, Short> {

    @MethodProperties(exposed = false)
    TipoPromocaoDomain update(Short aShort, TipoPromocaoDomain tipoPromocao);

    @MethodProperties(exposed = false)
    TipoPromocaoDomain add(TipoPromocaoDomain tipoPromocao);

    @MethodProperties(exposed = false)
    boolean delete(Short aShort);
}
