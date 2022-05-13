package com.dynamics.resource;

import com.dynamics.domain.CategoriaDomain;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface CategoriaResource extends PanacheEntityResource<CategoriaDomain, Short> {

}
