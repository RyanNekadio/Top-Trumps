package com.example.top_trumps_start_code.Controllers;

import com.example.top_trumps_start_code.Services.TopTrumpsService;
import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cardgames")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @PostMapping
    public ResponseEntity<Reply> newGame(@RequestBody Card card1, Card card2){
        Reply reply = topTrumpsService.startNewGame();
        return new ResponseEntity<Reply>(reply, HttpStatus.CREATED);
    }


}
