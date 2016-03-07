package vn.vsii.rina.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by toannh on 3/7/2016.
 */
@Entity
@Table(name = "category")
public class Category {
    @Id
    private String id;
    private String name;

    @OneToMany(targetEntity = Product.class, fetch = FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
