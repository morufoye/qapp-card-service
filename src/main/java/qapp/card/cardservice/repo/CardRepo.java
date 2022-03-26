package qapp.card.cardservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import qapp.card.cardservice.model.Card;

public interface CardRepo extends JpaRepository<Card, String> {
    Card findCardByCard_number(String cardNumber);
}
