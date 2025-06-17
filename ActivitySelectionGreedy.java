import java.util.*;

class Activity {
    int start, end;
    Activity(int s, int e) {
        start = s;
        end = e;
    }
}

public class ActivitySelectionGreedy {
    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 2), new Activity(3, 4),
            new Activity(0, 6), new Activity(5, 7),
            new Activity(8, 9), new Activity(5, 9)
        };

        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        System.out.println("Selected activities:");
        int lastEnd = -1;
        for (Activity act : activities) {
            if (act.start >= lastEnd) {
                System.out.println("Activity: " + act.start + " - " + act.end);
                lastEnd = act.end;
            }
        }
    }
}
