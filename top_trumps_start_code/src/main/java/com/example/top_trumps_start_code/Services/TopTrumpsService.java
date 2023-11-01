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

    public String checkWinner(Card card1, Card card2){
        if (card1.getCardValue() > card2.getCardValue()){
            return card1 + " is the winner!";
        } else {
            return card2 + " is the winner!";
        }
    }

    public Card getCard1() {
        return card1;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }

    public Card getCard2() {
        return card2;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    public ArrayList<Card> getDrawnCards() {
        return drawnCards;
    }

    public void setDrawnCards(ArrayList<Card> drawnCards) {
        this.drawnCards = drawnCards;
    }

    public boolean checkWinner() {
    }
}

