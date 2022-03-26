package qapp.card.cardservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qapp.card.cardservice.model.Card;
import qapp.card.cardservice.model.CardManagement;
import qapp.card.cardservice.repo.CardManagementRepo;
import qapp.card.cardservice.repo.CardRepo;

@Service
public class CardService {

    @Autowired
    private CardRepo cardRepo;
    @Autowired
    private CardManagementRepo cardManagementRepo;



    public String lodgeRequest(CardManagement request){
        cardManagementRepo.save(request);
        if ("block card".equalsIgnoreCase(request.getRequestType())) {
            // call card block api
        }
        return request.getRequestType()  + " successfully lodged";
    }


    public boolean checkCard(Card card_input) {
        Card card = cardRepo.findCardByCard_number(card_input.getCard_number());
        boolean result = false;
        if
        (
                card.getCard_type() == card_input.getCard_type() &&
                card.getCvv() == card_input.getCvv() &&
                card.getCard_type() == card_input.getCard_type() &&
                card.getExpiry_date() == card_input.getExpiry_date()
         )

        {
            result = true;
        }
        return result;
    }
}
