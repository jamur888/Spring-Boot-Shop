package ru.geekbrains.surf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.surf.entity.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {
}
