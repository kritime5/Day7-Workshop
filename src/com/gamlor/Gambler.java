package com.gamlor;

public class Gambler {
    //UC1-AS A GAMBER WOULD START WITH A STAKE OF $100 EVERY DAY AND $1 EVERY GAME
    static int everydayStakemoney=100;
    static int everydayBetmoney=1;
    int numberOfplay;
    private boolean winOrloss() {
    }

    public void startGame(){
        numberOfplay ++;
        if(winOrloss())
            everydayStakemoney+=everydayBetmoney;
        else
            everydayStakemoney-=everydayBetmoney;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to gambler simulator");
    }

}




