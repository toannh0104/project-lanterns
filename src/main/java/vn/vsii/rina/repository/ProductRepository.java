package vn.vsii.rina.repository;

import org.springframework.stereotype.Repository;
import vn.vsii.rina.entity.Product;

import java.util.List;

/**
 * Created by toannh on 3/1/2016.
 * ProductRepository, which work with DBMS to get data
 */
@Repository
public class ProductRepository extends AbstractDao<String, Product>{

    /**
     * Get all products
     * @return
     */
    public List<Product> getProducts(){
        return getSession().createCriteria(Product.class).list();
    }
}
