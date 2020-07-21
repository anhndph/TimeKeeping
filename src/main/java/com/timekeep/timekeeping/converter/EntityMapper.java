package com.timekeep.timekeeping.converter;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}
