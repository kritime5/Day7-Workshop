package com.gamlor;

public class Gambler {
    //UC1=AS A GAMBLER START WITH A STAKE OF 100$ EVERY DAY AND BET $1 EVERY GAME
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




}




