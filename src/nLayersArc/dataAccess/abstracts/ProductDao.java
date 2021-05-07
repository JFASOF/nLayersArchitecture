package nLayersArc.dataAccess.abstracts;

import nLayersArc.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void addProduct(Product product);
    void deleteProduct(Product product);
    void updateProduct(Product product);
    //ürün idsine göre ürün getir
    Product get(int id);
    List<Product> getAll();
}
