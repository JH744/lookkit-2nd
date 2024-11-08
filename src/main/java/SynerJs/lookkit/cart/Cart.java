package SynerJs.lookkit.cart;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private int cartId;
    private long userId;
    private int productId;
    private int quantity;
    private String brandName;
    private String productName;
    private String productThumbnail;
    private int productPrice;
    private int codiId;
}
