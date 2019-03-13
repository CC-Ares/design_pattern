package cjc.ares.designpattern.temple;

public abstract class DodishTemplate {

    //做菜的顺序是固定的，即备料，做菜和上菜，但是具体每个步骤如何实现教由子类实现
    protected void dodish(){
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    /**
     * 备料
     */
    public abstract void preparation();
    /**
     * 做菜
     */
    public abstract void doing();
    /**
     * 上菜
     */
    public abstract void carriedDishes ();
}
