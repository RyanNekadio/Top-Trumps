package com.example.top_trumps_start_code.Services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpsService {

    private Card card1;
    private Card card2;
    private ArrayList<Card> drawnCards;

    public TopTrumpsService(){
    }

    public Reply startNewGame() {
        this.card1 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        this.card2 = new Card(Rank.TWO, Suit.SPADES);
        this.drawnCards = new ArrayList<>();
        drawnCards.add(card1);
        drawnCards.add(card2);
        return new Reply(
                "Started new game"
        );
    }
}

