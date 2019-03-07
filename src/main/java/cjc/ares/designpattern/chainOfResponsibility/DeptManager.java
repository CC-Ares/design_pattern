package cjc.ares.designpattern.chainOfResponsibility;

public class DeptManager extends Manager{
    @Override
    public String handleFeeRequest(double fee) {
        String str = "";
        if(fee < 1000){
            str = "部门经理报销"+fee;
        }else{
            if(getManager() != null){
                return getManager().handleFeeRequest(fee);
            }else{
                str = "部门经理无法帮你报销";
            }
        }
        return str;
    }
}
