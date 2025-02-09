/**
 * @author Yuri Santos
 * @since 04-02-2025
 * @version 1.0
 */
package br.com.flexreserve.flex_reserve.controller;

import br.com.flexreserve.flex_reserve.entity.Product;
import br.com.flexreserve.flex_reserve.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @PostMapping
    List<Product> create(@RequestBody Product product){
        return productService.create(product);
    }
    @GetMapping
    List<Product> list(){
        return productService.list();
    }
    @PutMapping
    List<Product> update(@RequestBody Product product){
        return productService.update(product);
    }
    @DeleteMapping("{id}")
    List<Product> delete(@PathVariable("id") Long id){
        return productService.delete(id);
    }

}
