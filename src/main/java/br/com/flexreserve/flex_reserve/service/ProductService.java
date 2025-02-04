/**
 * @author Yuri Santos
 * @since 04-02-2025
 * @version 1.0
 */
package br.com.flexreserve.flex_reserve.service;

import br.com.flexreserve.flex_reserve.entity.Product;
import br.com.flexreserve.flex_reserve.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> create(Product product) {
        productRepository.save(product);
        return list();
    }
    public List<Product> list() {
        return productRepository.findAll();
    }
    public List<Product> update(Product product) {
        productRepository.save(product);
        return list();
    }
    public List<Product> delete(Long id) {
        productRepository.deleteById(id);
        return list();
    }
}
