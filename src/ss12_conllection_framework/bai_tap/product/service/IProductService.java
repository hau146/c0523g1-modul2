package ss12_conllection_framework.bai_tap.product.service;

import ss12_conllection_framework.bai_tap.product.model.ProductModel;

import java.util.List;

public interface IProductService {
    void addProduct ();
    void editProduct();
    void deleteProduct();
    void showAll();
    void searchByName();
    void sortByPriceProduct();
}
