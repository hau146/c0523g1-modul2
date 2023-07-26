package ss17_binary_serialization.bai_tap.product_file.model;

import java.io.Serializable;

public class Items implements Serializable {
    private int idItems;
    private String nameItems;
    private int priceItems;
    private String productionItems;
    private String describe;
    private static final long serialVersionUID = -684L;

    public Items() {
    }

    public Items(String nameItems, int priceItems, String productionItems, String describe) {
        this.nameItems = nameItems;
        this.priceItems = priceItems;
        this.productionItems = productionItems;
        this.describe = describe;
    }

    public Items(int idItems, String nameItems, int priceItems, String productionItems, String describe) {
        this.idItems = idItems;
        this.nameItems = nameItems;
        this.priceItems = priceItems;
        this.productionItems = productionItems;
        this.describe = describe;
    }

    public int getIdItems() {
        return idItems;
    }

    public void setIdItems(int idItems) {
        this.idItems = idItems;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public float getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(int priceItems) {
        this.priceItems = priceItems;
    }

    public String getProductionItems() {
        return productionItems;
    }

    public void setProductionItems(String productionItems) {
        this.productionItems = productionItems;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Items{" +
                "idItems=" + idItems +
                ", nameItems='" + nameItems + '\'' +
                ", priceItems=" + priceItems +
                ", productionItems='" + productionItems + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
