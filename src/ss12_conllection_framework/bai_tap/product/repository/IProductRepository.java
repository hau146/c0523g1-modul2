package ss12_conllection_framework.bai_tap.product.repository;

import ss12_conllection_framework.bai_tap.product.model.ProductModel;

import java.util.List;

public interface IProductRepository {
    void add(ProductModel product);

    void editProduct(int index, ProductModel product);

    void deleteProductById(int index);

    int searchIndex(int id);

    List<ProductModel> displayProduct();

    List<ProductModel> searchName(String name);

    List<ProductModel> sortByPriceProductUp();

    List<ProductModel> sortByPriceProductDown();
}
