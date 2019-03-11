package cjc.ares.designpattern.mediator;

public class HouseMediator extends Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /**
     * 将房东和租客的交互由中介这个方法来执行，房东和租户无需进行耦合，只要跟中介进行交互就行
     * @param message
     * @param person
     */
    @Override
    public void contact(String message, Person person) {
        if(person == houseOwner){
            tenant.getMessage(message);
        }else{
            houseOwner.getMessage(message);
        }
    }
}
