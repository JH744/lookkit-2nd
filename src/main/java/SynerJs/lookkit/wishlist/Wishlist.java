package SynerJs.lookkit.wishlist;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private long wishlistId;
    private long userId;
    private Long productId;
    private Long codiId;
}
