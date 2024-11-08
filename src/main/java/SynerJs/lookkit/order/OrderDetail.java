package SynerJs.lookkit.order;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OrderDetail {
    private int orderDetailId;
    private int orderId;
    private int productId;
    private long userId; 
    private int quantity;
    private int productPrice;
}