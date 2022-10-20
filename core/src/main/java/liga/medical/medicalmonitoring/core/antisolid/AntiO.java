package liga.medical.medicalmonitoring.core.antisolid;

public class AntiO {
    //плохой пример
    private int value = 0;
    public void increaseValue() {
        value++;
    }
}

//хороший пример
/*public class GoodO {

    private int value = 0;

    private ValueIncreaser valueIncreaserImpl;

    public GoodO(ValueIncreaser valueIncreaserImpl) {
        this.valueIncreaserImpl = valueIncreaserImpl;
    }

    public void increaseValue() {
        value = valueIncreaserImpl.increaseValue(value);
    }

}*/
