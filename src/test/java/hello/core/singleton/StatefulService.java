package hello.core.singleton;

public class StatefulService {

    private int price; // tkdxofmf dbwlgksms vlfem

    public void order(String name, int price){
        System.out.println("name = " + name);
        System.out.println("price = " + price);

        this.price = price;
    }

    public int orderStateless(String name, int price){
        System.out.println("name = " + name);
        System.out.println("price = " + price);

        return price;
    }

    public int getPrice() {
        return price;
    }
}
