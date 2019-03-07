package cjc.ares.designpattern.chainOfResponsibility;

public class ProjectManager extends Manager{
    @Override
    public String handleFeeRequest(double fee) {
        String str = "";
        if(fee < 500){
            str = "项目经理报销" + fee;
        }else{
            if(getManager() != null){
                return getManager().handleFeeRequest(fee);
            }else{
                str = "项目经理无法帮你报销";
            }
        }
        return str;
    }
}
