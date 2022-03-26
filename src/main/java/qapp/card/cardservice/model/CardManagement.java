package qapp.card.cardservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardManagement {
private String order_id;
private String card_number;
private String firstReason;
private String secondReason;
private String thirdReason;
private String otherReason;
private String requestType;
private String status;
}
