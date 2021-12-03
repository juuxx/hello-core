package hello.core.order;

//test
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
