package net.hamza.glsidensetspringmvc.repository;

import net.hamza.glsidensetspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
