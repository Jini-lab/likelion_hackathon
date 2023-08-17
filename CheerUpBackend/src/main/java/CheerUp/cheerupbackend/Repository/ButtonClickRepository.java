package CheerUp.cheerupbackend.Repository;

import CheerUp.cheerupbackend.Entity.ButtonClick;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ButtonClickRepository extends JpaRepository<ButtonClick, Long> {
    ButtonClick findByButtonName(String buttonName);
}
