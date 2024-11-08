package SynerJs.lookkit.inquiry;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InquiryAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private long answerId;
    private long inquiryId;
    private LocalDateTime answerCreatedAt;
    private String answerContents;
}
