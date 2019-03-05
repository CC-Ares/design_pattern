package cjc.ares.designpattern.dynamicProxy;

public class Zhonghua implements CigaretteOwner{
    @Override
    public void sellCigarette() {
        System.out.println("I sell zhonghua cigarette");
    }
}
