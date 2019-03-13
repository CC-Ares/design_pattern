package cjc.ares.designpattern.state;

/**
 * 售空状态，无法做任何事情
 */
public class SoldOutState implements State {

    private CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("you can't insert coin,the machine sold out!");
    }

    @Override
    public void returnCoin() {
        System.out.println("you can't return,you haven't inserted a coin yet!");

    }

    @Override
    public void turnCrank() {
        System.out.println("you turned,but there are no candies!");
    }

    @Override
    public void dispense() {

    }

    @Override
    public void printState() {
        System.out.println("***SoldOutState***");
    }
}
