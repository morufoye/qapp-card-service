package qapp.card.cardservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import qapp.card.cardservice.model.Card;
import qapp.card.cardservice.model.CardManagement;
import qapp.card.cardservice.service.CardService;

@RestController
@RequestMapping("/card-service/")
public class CardController {

    @Autowired
    private CardService cardService;

    @PostMapping("/block")
    public ResponseEntity<String> blockCard(@RequestBody CardManagement request) {
        String response =  cardService.lodgeRequest(request);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/retrieve-pin")
    public ResponseEntity<String> retrievePin(@RequestBody CardManagement request) {
        String response =  cardService.lodgeRequest(request);
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/replace")
    public ResponseEntity<String> replaceCard(@RequestBody CardManagement request) {
        String response =  cardService.lodgeRequest(request);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/checkCard")
    public ResponseEntity<Boolean> checkCard(@RequestBody Card card) {
        boolean response =  cardService.checkCard(card);
        return ResponseEntity.ok().body(response);
    }
}
