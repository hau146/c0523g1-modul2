package test.repository;

import test.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> finAll();
    void addProduct(Product newProduct);
    void deleProduct(int index);
}
