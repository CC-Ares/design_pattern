package cjc.ares.designpattern.chainOfResponsibility;

public abstract class Manager {

    /**
     * 含有下一个处理人的引用
     */
    protected Manager manager = null;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * 报销费用方法
     * @param user
     * @param fee
     * @return
     */
    public abstract String handleFeeRequest(double fee);
}
