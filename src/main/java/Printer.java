import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    private Queue<PrintJob> queue;
    private int time;

    public Printer() {
        queue = new LinkedList<>();
        time = 0;
    }

    public void addJob(String jobId, int pages) {
        PrintJob job = new PrintJob(pages, jobId);
        queue.offer(job);
        System.out.println("Added " + job + " added to the queue");
    }

    public void printPage() {
        time++;

        if (queue.isEmpty()) {
            System.out.println("Time " + time + ": There are no current jobs");
            return;
        }

        PrintJob currentJob = queue.peek();

        System.out.println("Time " + time + ": Printing page from " + currentJob);
        currentJob.decrementPages();

        if (currentJob.getPages() == 0) {
            PrintJob finishedJob = queue.poll();
            System.out.println("Time " + time + ": " + finishedJob + " Job is completed and removed from the queue");
        }
    }

    public void showQueue() {
        System.out.println("Queue status at this time:  " + time);
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Jobs in queue:");
            int index = 0;
            for (PrintJob job : queue) {
                String status = (index == 0) ? " (currently printing)" : "";
                System.out.println("  " + job + status);
                index++;
            }
        }
        System.out.println();
    }

    public boolean hasJobs() {
        return !queue.isEmpty();
    }
}

