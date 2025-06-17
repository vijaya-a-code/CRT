import java.util.*;

public class TrainPlatforms {
    public static void main(String[] args) {
        int[] arrival =  {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int n = arrival.length;
        int i = 1, j = 0, platforms = 1, maxPlatforms = 1;

        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        System.out.println("Minimum platforms required: " + maxPlatforms);
    }
}
