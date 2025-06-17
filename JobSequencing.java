import java.util.*;

class Job {
    int id, deadline, profit;
    Job(int i, int d, int p) {
        id = i; deadline = d; profit = p;
    }
}

public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit); // descending

        int maxDeadline = 0;
        for (Job j : jobs)
            maxDeadline = Math.max(maxDeadline, j.deadline);

        int[] slots = new int[maxDeadline + 1]; // 1-based indexing
        Arrays.fill(slots, -1);

        int count = 0, profit = 0;

        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (slots[j] == -1) {
                    slots[j] = job.id;
                    count++;
                    profit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Max Jobs: " + count);
        System.out.println("Max Profit: " + profit);
    }
}
