package cjc.ares.designpattern.memento;

public class GameRole {
    private int vir;
    private int atk;

    public int getVir() {
        return vir;
    }

    public void setVir(int vir) {
        this.vir = vir;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void init(){
        vir = 100;
        atk = 100;
    }

    public void fightBoss(){
        this.vir-= 50;
        this.atk-= 50;
    }

    public void show(){
        System.out.println("当前生命值："+this.getVir()+",当前攻击力："+this.getAtk());
    }

    public Memento saveMemento(){
        return new Memento(this.getVir(),this.getAtk());
    }

    public void recoverFromMemento(Memento memento){
        this.setVir(memento.getVir());
        this.setAtk(memento.getAtk());
    }
}
