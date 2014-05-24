package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author sezin karli
 * @since 4/7/14 1:27 PM
 *        User: Sezin Karli
 */

@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String sku;

    @Field(value = "material_name")
    private String materialName;

    private Double price;
    private Integer availability;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", sku='" + sku + '\'' +
                ", materialName='" + materialName + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }
}
