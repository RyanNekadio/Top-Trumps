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
//        Extension task 1: code to test draw
//        this.card1 = new Card(Rank.JACK, Suit.HEARTS);
//        this.card2 = new Card(Rank.JACK, Suit.CLUBS);
        this.card1 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        this.card2 = new Card(Rank.TWO, Suit.SPADES);
        this.drawnCards = new ArrayList<>();
        drawnCards.add(card1);
        drawnCards.add(card2);
        return new Reply(
                "Started new game"
        );
    }
//    MVP task: Check winning card
    public Reply checkWinner(ArrayList<Card> cards){
        cards.add(this.card1);
        cards.add(this.card2);
        Reply reply;

        if (card1.getCardValue() > card2.getCardValue()){
            reply = new Reply(card1.getRank() + " of " + card1.getSuit() + " wins!");
            reply.setWinner(true);
            return reply;
        } else if (card1.getCardValue() < card2.getCardValue()) {
            reply = new Reply(card2.getRank() + " of" + card2.getSuit() + " wins!");
            reply.setWinner(true);
            return reply;
//        Extension task: Add message in the event of a draw
        } else {
            reply = new Reply("Draw! card values are the same!");
            return reply;
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

}

