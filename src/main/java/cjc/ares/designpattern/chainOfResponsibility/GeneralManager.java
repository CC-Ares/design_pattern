package cjc.ares.designpattern.chainOfResponsibility;

public class GeneralManager extends Manager{

    String string = "";
    @Override
    public String handleFeeRequest(double fee) {
        if(fee < 1500){
            string = "总经理报销"+fee;
        }else{
            if(getManager() != null){
                return getManager().handleFeeRequest(fee);
            }else {
                string = "总经理无法帮你报销";
            }
        }
        return string;
    }
}
