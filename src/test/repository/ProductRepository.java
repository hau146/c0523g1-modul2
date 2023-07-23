package test.repository;

import test.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository{
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Hau"));
        products.add(new Product(2,"Hung"));
    }

    @Override
    public List<Product> finAll() {
        return products;
    }

    @Override
    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    @Override
    public void deleProduct(int id) {
        int index = 0;
        for (int i = 0; i < products.size() ; i++) {
            if (products.get(i).getId() == id){
                index = i;
                break;
            }
        }
        products.remove(index);
    }
}
