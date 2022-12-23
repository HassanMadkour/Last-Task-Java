 abstract class Product {

    private double Price;

    public Product(double Price) {
        this.Price = Price;
    }

    // to compute total price
    public abstract double discount();

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}

class Book extends Product {

    private String Publisher;
    private int Publishedyear;

    public Book(double Price,
            String Publisher,
            int Publishedyear) {
        super(Price);
        this.Publisher = Publisher;
        this.Publishedyear = Publishedyear;
    }

    public double discount() {
        return super.getPrice() * 0.5;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getPublishedYear() {
        return Publishedyear;
    }

    public void setPublishedYear(int Publishedyear) {
        this.Publishedyear = Publishedyear;
    }
}

class ChildrenBook extends Book {

    int For_Age;

    public ChildrenBook(double Price, String Publisher, int Publishedyear, int age) {
        super(Price, Publisher, Publishedyear);
        For_Age = age;
    }

    @Override
    public double discount() {
        return super.getPrice() * 0.5;
    }

}

public class MyOnlineShop {

    public static void main(String[] args) {
        double totalPriceBefore = 0;
        double totalSalePrice = 0;

        Product[] pro = new Product[7];

        pro[0] = new Book(200, "Hassan", 2022);
        pro[1] = new Book(150, "Ahmed", 2021);
        pro[2] = new Book(200, "Hassan2", 2022);
        pro[3] = new Book(150, "Ahmed2", 2021);
        pro[4] = new Book(10, "hassan", 2002);
        pro[5] = new ChildrenBook(150, "Mofstfa", 2020, 8);
        pro[6] = new ChildrenBook(140, "hamda", 2001, 11);

        for (int i = 0; i < pro.length; i++) {

            totalPriceBefore += pro[i].getPrice();

            totalSalePrice += pro[i].discount();

            System.out.println("Item : " + i + " , class :" + pro[i].getClass().getName() +
                    ", the price price = " + pro[i].getPrice() +
                    ", Sale price = " + pro[i].discount());
        }
        System.out.println("Price : " + totalPriceBefore);
        System.out.println("Total Sale Price (with discount) : " + totalSalePrice);
    }

}