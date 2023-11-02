package com.example.top_trumps_start_code.Services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    public String checkWinner(ArrayList<Card> cards){
        if (cards.get(0).getCardValue() > cards.get(1).getCardValue()){
            return cards.get(0).getRank() + " of " + cards.get(0).getSuit() + " wins!";
        } else if (cards.get(0).getCardValue() < cards.get(1).getCardValue()){
            return cards.get(1).getRank() + " of " + cards.get(1).getSuit() + " wins!";
//            Extension task 1: code in the event of a draw
        } else {
            return "Draw!";
        }
    }

}

