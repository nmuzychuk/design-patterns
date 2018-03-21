package com.nmuzychuk;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private List<Job> jobs = new ArrayList<>();

    void addJob(final Job job) {
        jobs.add(job);
    }

    void runJobs() {
        for (Job job : jobs) {
            job.run();
        }
    }
}
