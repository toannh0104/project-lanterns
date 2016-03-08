package vn.vsii.rina.entity;

import javafx.beans.DefaultProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by toannh on 3/1/2016.
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable{

    @Id
    private String id;
    @Length(max = 200, message = "Size of product's name is too long")
    @NotBlank
    private String name;

    @NotBlank
    private double price;

    private int quantity;

    @NotBlank
    private Date createTime;
    private String detail;
    @NotBlank
    private String user;

    public Product(){}

    public Product(String id, String name, int quantity, Date createTime, String detail, String user) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.createTime = createTime;
        this.detail = detail;
        this.user = user;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
