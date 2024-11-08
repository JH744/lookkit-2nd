package SynerJs.lookkit.user;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "USER")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_UUID", length = 100, nullable = false)
    private String userUuid;

    @Column(name = "PASSWORD", length = 255, nullable = false)
    private String password;

    @Column(name = "USER_NAME", length = 100, nullable = false)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name = "GENDER", columnDefinition = "ENUM('M', 'F')")
    private Gender gender;

    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    @Column(name = "EMAIL", length = 255, unique = true, nullable = false)
    private String email;

    @CreationTimestamp
    @Column(name = "USER_CREATED_AT", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "PHONE", length = 100)
    private String phone;

    @UpdateTimestamp
    @Column(name = "LAST_UPDATE")
    private LocalDateTime lastUpdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE", columnDefinition = "ENUM('user', 'admin')", nullable = false)
    private Role role;

    @Column(name = "ADDRESS", length = 255)
    private String address;

    // ENUM 타입 정의
    public enum Gender {
        M, F
    }

    public enum Role {
        user, admin
    }

    // 업데이트 메서드 예시 (선택적으로 구현)
    public void updateUserDetails(String userName, String phone, String address) {
        this.userName = userName;
        this.phone = phone;
        this.address = address;
    }

}
