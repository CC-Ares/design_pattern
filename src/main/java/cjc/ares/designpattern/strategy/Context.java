package cjc.ares.designpattern.strategy;

public class Context {

    private Algorithm algorithm;

    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void executeStrategy(int a,int b){
        System.out.println("result : "+algorithm.caculate(a,b));
    }

}
