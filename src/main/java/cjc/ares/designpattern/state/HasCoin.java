package cjc.ares.designpattern.state;

import java.util.Random;

/**
 * 已有硬币状态，可以撤回硬币，或者转动摇杆
 */
public class HasCoin implements State{
    private CandyMachine candyMachine;

    public HasCoin(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert another coin!");
    }

    @Override
    public void returnCoin() {
        System.out.println("coin return!");
        candyMachine.setState(candyMachine.mOnReadyState);
    }

    @Override
    public void turnCrank() {
        System.out.println("crank turn...!");
        Random ranwinner=new Random();
        int winner=ranwinner.nextInt(10);
        if(winner==0)
        {
            candyMachine.setState(candyMachine.mWinnerState);

        }else
        {
            candyMachine.setState(candyMachine.mSoldState);

        }
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printState() {
        System.out.println("***HasCoin***");
    }
}
