/**
 * @author Yuri Santos
 * @since 30-01-2025
 * @version 1.0
 */
package br.com.flexreserve.flex_reserve.repository;

import br.com.flexreserve.flex_reserve.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}