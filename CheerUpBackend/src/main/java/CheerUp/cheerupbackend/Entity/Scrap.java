package CheerUp.cheerupbackend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Scrap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    // 생성자, Getter 및 Setter 생략

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
