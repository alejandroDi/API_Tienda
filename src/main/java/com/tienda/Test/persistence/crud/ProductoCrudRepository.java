package com.tienda.Test.persistence.crud;

import com.tienda.Test.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAdc(int idCategoria);

    Optional<List<Producto>> finByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);
}
