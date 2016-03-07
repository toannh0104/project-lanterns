package vn.vsii.rina.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by toannh on 3/1/2016.
 */
@Entity
@Table(name = "product")
public class Product implements Serializable{

    @Id
    private String id;

    private String categoryId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryID", nullable = false)
    private Category category;

    @Length(max = 200, message = "Size of product's name is too long")
    @NotBlank
    private String name;
    @ColumnDefault("222")
    private int quantity;
    @NotBlank
    private Date createTime;
    private String detail;
    @NotBlank
    private String user;
    @Column(name = "DESCRIPTION", columnDefinition = "TEXT", nullable = true)
    private String description;
    private String images;
    @ColumnDefault("0.0")
    private double price;
    @ColumnDefault("0.0")
    private double oldPrice;
    @ColumnDefault("0")
    private int discount;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Product() {
    }

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
}
