package ru.geekbrains.surf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.surf.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
