import java.util.HashMap;
import java.util.Map;

public class CinemaApplicationRun extends Viewer {
    Viewer viewer = new Viewer();
    Map<String, Integer> map = new HashMap<>();
    public void listLoading() {
        // name check
        if (name == null) {
            System.out.println("(listLoading error) age == null");
            return;
        }

        // views check
        if (views == null) {
            System.out.println("(averageAge error) age == null");
            return;
        }
        for (int i = 0; i < age.length; i++) {
            if (age[i] < -1) {
                System.out.println("(averageAge error) age element " + i + "=" + age[i]);
                return;
            }
        }

        for (int i = 0; i < 5; i++) {
            map.put(name[i],views[i]);
        }

    }
}