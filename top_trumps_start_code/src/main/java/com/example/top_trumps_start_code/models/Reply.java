package com.example.top_trumps_start_code.models;

public class Reply {

    private String message;
    private boolean winner;

    public Reply(String message){
        this.message = message;
        this.winner = false;
    }

    public Reply(){
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }
}
