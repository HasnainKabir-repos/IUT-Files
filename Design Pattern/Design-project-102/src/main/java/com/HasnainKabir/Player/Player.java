package com.HasnainKabir.Player;

public class Player {

    public static Player instance;

    private Player(){

    }

    public Player getInstance(){
        if(instance == null){
            instance =  new Player();
        }

        return instance;
    }
}
