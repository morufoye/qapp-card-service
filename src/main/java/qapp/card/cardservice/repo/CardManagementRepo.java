package qapp.card.cardservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import qapp.card.cardservice.model.CardManagement;

public interface CardManagementRepo extends JpaRepository<CardManagement, String> {
    CardManagement findCardManagementByOrder_id(String order_id);
}
