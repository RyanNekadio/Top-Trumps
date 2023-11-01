package com.example.top_trumps_start_code.Controllers;

import com.example.top_trumps_start_code.Services.TopTrumpsService;
import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/cardgames")
public class TopTrumpsController {

    @Autowired
    TopTrumpsService topTrumpsService;

    @PostMapping
    public ResponseEntity<Reply> newGame(@RequestBody ArrayList<Card> cards){
        Reply reply = topTrumpsService.startNewGame();
        return new ResponseEntity<Reply>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Reply> geCardStatus(){

        Reply reply;
        

}
