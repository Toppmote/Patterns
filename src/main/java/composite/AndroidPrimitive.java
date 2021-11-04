package composite;

public class AndroidPrimitive extends GraphicalPrimitive {

    public AndroidPrimitive(String id) {
        super(id);
    }

    @Override
    public String operation() {
        return "Android primitive: " + this.id;
    }

}
