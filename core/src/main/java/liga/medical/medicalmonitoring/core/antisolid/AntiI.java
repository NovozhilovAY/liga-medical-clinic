package liga.medical.medicalmonitoring.core.antisolid;

public class AntiI {
    public interface BigInterface {
        void doSomething1();
        void doSomething2();
        void doSomething3();
        void doSomething4();
    }

    public class BigInterfaceImpl implements BigInterface{

        @Override
        public void doSomething1() {
            System.out.println("doSomething1");
        }

        @Override
        public void doSomething2() {
            System.out.println("doSomething2");
        }

        @Override
        public void doSomething3() {
            System.out.println("doSomething3");
        }

        @Override
        public void doSomething4() {
            // не используется
            return;
        }
    }
}
