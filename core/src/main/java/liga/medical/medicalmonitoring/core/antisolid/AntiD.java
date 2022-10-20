package liga.medical.medicalmonitoring.core.antisolid;

import java.util.ArrayList;
import java.util.List;

public class AntiD {
    public class Developer {

    }

    public class Designer {

    }

    public class Tester {

    }

    public class Manager {
        private List<Developer> developers;

        private List<Designer> designers;

        private List<Tester> testers;

        public Manager() {
            designers = new ArrayList<>();
            developers = new ArrayList<>();
            testers = new ArrayList<>();
        }

        public void addDeveloper(Developer developer) {
            developers.add(developer);
        }

        public void addDesigner(Designer designer) {
            designers.add(designer);
        }

        public void addTester(Tester tester) {
            testers.add(tester);
        }
    }
}
