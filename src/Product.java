public class Product implements Comparable{
    private int id;
    private String title;
    private int price;

    public Product(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object obj) {
        Product product = (Product) obj;
        if(this.id == product.id) {
            return 0;
        }
        if(this.id > product.id) {
            return 1;
        }
        return -1;
    }
}

class ProductComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Product p1 = (Product) obj1;
        Product p2 = (Product) obj2;

        if(p1.getId() == p2.getId()) {
            return 0;
        }

        if(p1.getId() > p2.getId()) {
            return -1;
        }

        return 1;
    }
}

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if(p1.getPrice() == p2.getPrice()) {
            return 0;
        }
        if(p1.getPrice() < p2.getPrice()) {
            return -1;
        }
        return 1;
    }
}
