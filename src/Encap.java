class Shop {
    private String jwelleryName;
    private int price;
    private int carat;
    private int weight;

    public String getJwelleryName() {
        return jwelleryName;
    }

    public void setJwelleryName(String jwelleryName) {
        this.jwelleryName = jwelleryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

public class Encap {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.setJwelleryName("Gold");
        shop.setCarat(24);
        shop.setPrice(34000);
        shop.setWeight(1);

        System.out.println(shop.getJwelleryName() + " " + shop.getCarat() + " " + shop.getWeight() + " " + shop.getPrice());
    }
}
