package inne;

public class GenericHolder<AnyType> {

    private AnyType a;

    public GenericHolder(AnyType a) {
        this.a = a;
    }

    public AnyType getA() {
        return a;
    }

    public void setA(AnyType a) {
        this.a = a;
    }
}
