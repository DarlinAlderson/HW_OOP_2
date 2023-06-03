package HomeWork_8;

public abstract class Client implements ClientBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();
}