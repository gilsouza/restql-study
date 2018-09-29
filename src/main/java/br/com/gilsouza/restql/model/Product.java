package br.com.gilsouza.restql.model;

import restql.core.annotation.RestEntity;

import java.util.List;

@RestEntity(
        name = "Product",
        resourceMapping = "https://313dc7f6-4e0c-4bb6-9c27-aa95a128eb2e.mock.pstmn.io/products",
        responseLookupPath = "products"
)
public class Product {
    private String sku;
    private String name;
    private String status;
    private List<Association> associations;



    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Association> getAssociations() {
        return associations;
    }

    public void setAssociations(List<Association> associations) {
        this.associations = associations;
    }
}