package SynerJs.lookkit.coordiset;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CoordisetImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private long codiImgId;
    private long codiId;
    private String imgPath;
}
