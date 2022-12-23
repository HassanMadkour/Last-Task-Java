

// Class main to run Code 
public class MyOnlineShop_interface {

    public static void main(String[] args) {
        double totalPriceBefore = 0;
        double totalSalePrice = 0;
        // create array of Object
        Product[] pro = new Product[9];
        // create books
        pro[0] = new Book(200, "Hassan", 2022);
        pro[1] = new Book(150, "Ahmed", 2021);
        pro[2] = new Book(200, "Hassan2", 2022);
        pro[3] = new Book(150, "Ahmed2", 2021);
        pro[4] = new Book(10, "hassan", 2002);
        // create chidrenbooks
        pro[5] = new ChildrenBook(150, "Mofstfa", 2020, 8);
        pro[6] = new ChildrenBook(140, "hamda", 2001, 11);
        // Create Cartoon
        pro[7] = new Cartoon(120, "Hassan", 2012, "Spiderman");
        pro[8] = new Cartoon(110, "HassanMadkour", 2011, "Batman");

        // Display Sales (Books)
        System.out.println(
                "\n\t\t-----------------Your Sales-------------------  ");
        for (int i = 0; i < pro.length; i++) {

            totalPriceBefore += pro[i].getPrice();

            totalSalePrice += pro[i].discount();

            System.out.println("Item : " + i + 1 + " , class : " + pro[i].getClass().getName() +
                    ", the Price : " + pro[i].getPrice() + ", Sale Price : " + pro[i].discount());
        }
        // Display Price
        System.out.println("-------------------------------------------\n" +
                "Total Price : " + totalPriceBefore + "\nTotal Sale Price (with discount) : " + totalSalePrice);
    }

}

// interface of product--------------------------------------------------------------------------------------------------------

interface Products {
    public double discount();

    public double getPrice();

    public void setPrice(double Price);
}

// class that implements from interface
class Product implements Products {

    private double Price;

    // constractor
    public Product(double Price) {
        this.Price = Price;
    }

    public double discount() {
        return 0;
    }

    // getters and setters
    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}

// interface for Book------------------------------------------------------------------------------------------------------------
interface Books {
    public String getPublisher();

    public void setPublisher(String Publisher);

    public int getYearPublished();

    public void setPublishedyear(int Publishedyear);
}

// create class book which implements from interface books
class Book extends Product implements Books {

    private String Publisher; // name of publisher
    private int Publishedyear;// year of pub...

    // consturctor for class
    public Book(double Price,
            String Publisher,
            int Publishedyear) {
        super(Price);
        this.Publisher = Publisher;
        this.Publishedyear = Publishedyear;
    }

    // fuction inherited from product with change in its body (make discount on
    // sale)
    @Override
    public double discount() {
        return super.getPrice() * 0.8;
    }

    // getter and setter
    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public int getYearPublished() {
        return Publishedyear;
    }

    public void setPublishedyear(int Publishedyear) {
        this.Publishedyear = Publishedyear;
    }

}

// class children inherints from Book----------------------------------------------
class ChildrenBook extends Book {

    int For_Age;

    // constarctor of class
    public ChildrenBook(double Price, String Publisher, int Publishedyear, int age) {
        super(Price, Publisher, Publishedyear);
        For_Age = age;
    }

    @Override
    public double discount() {
        return super.getPrice() * 0.5;
    }

}



// anthor class inherints from class book------------------------------------------------
class Cartoon extends Book {

    String CartoonName;

    public Cartoon(double Price, String Publisher, int Publishedyear, String CartoonName) {
        super(Price, Publisher, Publishedyear);
        this.CartoonName = CartoonName;
    }

    @Override
    public double discount() {
        return super.getPrice() * 0.6;
    }
}