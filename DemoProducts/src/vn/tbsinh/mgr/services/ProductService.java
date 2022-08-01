package vn.tbsinh.mgr.services;

import vn.tbsinh.mgr.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(30200, "iPhone 14 Pro Max", 1400, 10));
        productList.add(new Product(30201, "iPhone SE 2022", 600, 20));
        productList.add(new Product(30202, "Samsung Galaxy A72", 400, 17));
        productList.add(new Product(30203, "iPad Air 2022", 1220, 11));
        productList.add(new Product(30204, "Xiaomi Redmi K50", 212, 30));
        productList.add(new Product(30205, "Realme GT Neo 2T 5G", 310, 6));
        productList.add(new Product(30206, "Samsung Galaxy Tab S7 FE 4G", 190, 10));
        productList.add(new Product(30207, "Samsung Galaxy S22 Ultra", 2000, 18));
        productList.add(new Product(30208, "Samsung Galaxy S21 Plus 5G", 2021, 17));
        productList.add(new Product(30309, "iPhone 13 Pro Max", 1600, 14));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(long id) {
        List<Product> productList = findAll();
        for (Product product : productList) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public boolean existsById(long id) {
        return findById(id) != null;
    }

    @Override
    public void add(Product newProduct) {
        newProduct.setId(System.currentTimeMillis() / 1000);
        List<Product> productList = findAll();
        productList.add(newProduct);
    }

    @Override
    public void update(Product newProduct) {

    }
}
