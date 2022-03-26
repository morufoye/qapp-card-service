package qapp.card.cardservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String user_id;
    private String user_name;
    private String card_number;
    private String card_type;
    private String expiry_date;
    private String cvv;
    private String pin;
}
