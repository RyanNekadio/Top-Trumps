package com.example.top_trumps_start_code.Controllers;

import com.example.top_trumps_start_code.Services.TopTrumpsService;
import com.example.top_trumps_start_code.models.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/toptrumps")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @PostMapping
    public ResponseEntity<String> newGame(@RequestBody ArrayList<Card> cards){
        String winner = topTrumpsService.checkWinner(cards);
        return new ResponseEntity<>(winner, HttpStatus.OK);
    }

}
