package cjc.ares.designpattern.interpreter;

public class DivNode extends SymbolNode{
    public DivNode(Node left,Node right){
        super(left,right);
    }

    public int interpret(){
        return super.left.interpret() / super.right.interpret();
    }
}