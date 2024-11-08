package SynerJs.lookkit.inquiry;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Inquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 예시
    private long inquiryId;
    private long userId;
    private String inquiryTitle;
    private String inquiryContents;
    private LocalDateTime inquiryCreatedAt;
    private String answerState;
}
