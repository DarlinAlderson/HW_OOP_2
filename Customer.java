package HomeWork_8;

public class Customer extends Client {
    public void setName(String name) { this.name = name; }
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() { 
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}