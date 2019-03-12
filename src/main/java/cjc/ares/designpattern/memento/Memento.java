package cjc.ares.designpattern.memento;

public class Memento {
    private int vir;
    private int atk;

    public Memento(int vir, int atk) {
        this.vir = vir;
        this.atk = atk;
    }

    public int getVir() {
        return vir;
    }

    public int getAtk() {
        return atk;
    }
}
