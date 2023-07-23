package test.service;

import test.model.Product;
import test.repository.IProductRepository;
import test.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    Scanner scanner = new Scanner(System.in);

    IProductRepository productRepository = new ProductRepository();
    @Override
    public void displayProduct() {
        List<Product> productList = productRepository.finAll();
        for (Product products : productList) {
            System.out.println(products);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập vào id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên");
        String name = scanner.nextLine();
        Product newProduct = new Product(id,name);
        productRepository.addProduct(newProduct);
        System.out.println("thêm ok");
    }

    @Override
    public void deleProduct() {
        System.out.println("Nhập id bạn muốn xóa");
        int id = scanner.nextInt();
        productRepository.deleProduct(id);
        System.out.println("xóa ok");
    }
}
