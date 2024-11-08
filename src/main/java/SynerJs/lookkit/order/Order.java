package SynerJs.lookkit.order;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private int orderId;
    private long userId;
    private int totalAmount;
    private String orderStatus;
    private String orderComment;
    private Timestamp orderDate;
    private String orderAddress;
    private String orderAddressee;
    private String orderPhone;
    private List<com.example.lookkit.order.OrderDetailVO> orderDetails = new ArrayList<>();
}


