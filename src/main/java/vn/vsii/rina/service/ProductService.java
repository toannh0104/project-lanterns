package vn.vsii.rina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.vsii.rina.entity.Product;
import vn.vsii.rina.repository.ProductRepository;

import java.util.List;

/**
 * Created by toannh on 3/1/2016.
 *
 * ProductServices which provide all services of product
 */
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    /**
     * Get product form repo
     * @return List of product
     */
    @Cacheable(value= "lstProduct")
    public List<Product> getProducts(){
        return productRepository.getProducts();
    }
}
