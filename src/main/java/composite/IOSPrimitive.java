package composite;

public class IOSPrimitive extends GraphicalPrimitive {

    public IOSPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "IOS primitive: " + this.id;
    }

}
