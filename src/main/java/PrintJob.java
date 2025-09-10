public class PrintJob {

    private String jobId;
    private int pages;

    public PrintJob(int pages, String jobId) {
        this.pages = pages;
        this.jobId = jobId;
    }

    public void decrementPages() {
        pages--;
    }

    public String getJobId() {
        return jobId;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString (){
        return "Job " + jobId + ": " + pages + " pages";
    }
}
