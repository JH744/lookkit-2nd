package SynerJs.lookkit.coordiset;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Coordiset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private long codiId;
    private String codiName;
    private String codiDescription;
    private String codiThumbnail;
    private double codiPrice;
}
