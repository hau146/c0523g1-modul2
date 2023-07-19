package ss12_conllection_framework.bai_tap.product.comparator;

import ss12_conllection_framework.bai_tap.product.model.ProductModel;

import java.util.Comparator;

public class SortUp implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel o1, ProductModel o2) {
        return (int) (o1.getPriceProduct() - o2.getPriceProduct());
    }
}
