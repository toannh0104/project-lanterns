package vn.vsii.rina.repository;

import org.springframework.stereotype.Repository;
import vn.vsii.rina.entity.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by toannh on 3/1/2016.
 * ProductRepository, which work with DBMS to get data
 */
@Repository
public class ProductRepository {

    private Logger LOG = Logger.getLogger(ProductRepository.class.getName());

    /**
     * Get all products
     * @return
     */
    public List<Product> getProducts(){
        List<Product> lstProduct = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Product product = new Product("P00"+i, "name "+i, 10, new Date(), "detail "+i, "user "+i);
            lstProduct.add(product);
        }
        return lstProduct;
    }
}
