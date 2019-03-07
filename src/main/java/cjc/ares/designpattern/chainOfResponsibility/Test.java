package cjc.ares.designpattern.chainOfResponsibility;

/**
 * 责任链模式，每个处理人里都有或者没有包含下一级处理人
 * 如果有下一级处理人，则抛给下级处理人处理
 *
 * 应用场景
 * 1、servlet中的Filter
 *      Filter中有一个filter数组，进行过滤时会链式执行完所有的filter
 * 2、Dubbo中的Filter
 * 3、Mybatis中的Plugin
 */
public class Test {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager();
        DeptManager deptManager = new DeptManager();
        GeneralManager generalManager = new GeneralManager();
        //设置项目经理上层经理为部门经理
        projectManager.setManager(deptManager);
        //设置部门经理上层为总经理
        deptManager.setManager(generalManager);

        System.out.println(projectManager.handleFeeRequest(1200));
    }
}
