package com.gamlor;

public class Gambler {
    //UC1-AS A GAMBER WOULD START WITH A STAKE OF $100 EVERY DAY AND $1 EVERY GAME
    static int everydayStakemoney=100;

    int numberOfplay;
    //UC2-AS A GAMBLER MAKE $1 BET SO EITHER WIN OR LOOSE $1
    public void betmoney(){
         int everydayBetmoney=1;

    }
    //UC3-AS A CALCULATIVE GAMBLER IF WIN OR LOSS 50% OF THE STAKE WOULD RESIGN
    private boolean winOrloss() {
        if(Math.random()<0.5)
            return true;
        else
            return false;

    }

    public void startGame(){
        numberOfplay ++;
        int everydayBetmoney;
        if(winOrloss())
            everydayStakemoney+=everydayBetmoney;
        else
            everydayStakemoney-=everydayBetmoney;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to gambler simulator");
    }

}




