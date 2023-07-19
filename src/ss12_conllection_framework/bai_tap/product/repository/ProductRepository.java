package ss12_conllection_framework.bai_tap.product.repository;

import ss12_conllection_framework.bai_tap.product.comparator.SortDown;
import ss12_conllection_framework.bai_tap.product.comparator.SortUp;
import ss12_conllection_framework.bai_tap.product.model.ProductModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<ProductModel> productList = new ArrayList<>();

    static {
        productList.add(new ProductModel(1, "Laptop", 12.000));
        productList.add(new ProductModel(2, "Tủ lạnh", 15.000));
        productList.add(new ProductModel(3, "Tivi", 10.000));
        productList.add(new ProductModel(4, "Máy Lạnh", 30.000));
        productList.add(new ProductModel(5, "Quạt", 27.000));
    }

    @Override
    public void add(ProductModel product) {
        productList.add(product);
    }

    @Override
    public void editProduct(int index, ProductModel product) {
        productList.set(index, product);
    }

    @Override
    public void deleteProductById(int index) {
        productList.remove(index);
    }

    @Override
    public int searchIndex(int id) {
        List<ProductModel> productModelList = displayProduct(); //thằng này để hứng danh sách đối tượng
        for (int i = 0; i < productModelList.size(); i++) {
            if (id == productModelList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public List<ProductModel> displayProduct() {
        return productList;
    }

    @Override
    public List<ProductModel> searchName(String name) {
        List<ProductModel> searchList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(name)) {
                searchList.add(productList.get(i));
            }
        }
        return searchList;
    }

    @Override
    public List<ProductModel> sortByPriceProductUp() {
        SortUp sortUp = new SortUp();
        Collections.sort(productList, sortUp);
        return productList;
    }

    @Override
    public List<ProductModel> sortByPriceProductDown() {
        SortDown sortDown = new SortDown();
        Collections.sort(productList, sortDown);
        return productList;
    }
}
