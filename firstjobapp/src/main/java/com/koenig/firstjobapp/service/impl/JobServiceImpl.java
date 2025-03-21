package com.koenig.firstjobapp.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.koenig.firstjobapp.job.Job;
import com.koenig.firstjobapp.repository.JobRepository;
import com.koenig.firstjobapp.service.JobService;

@Service
public class JobServiceImpl implements JobService {

	//private List<Job> jobs = new ArrayList<>();
	//private Long nextId =1L;
	JobRepository jobRepository;
	
	
	public JobServiceImpl(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return jobRepository.findAll();
	}

	@Override
	public void createJob(Job job) {
		// TODO Auto-generated method stub
		jobRepository.save(job);
		
	}

	@Override
    public Job getJobById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

	
    @Override
    public boolean deleteJobById(Long id) {
        try {
            jobRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



    @Override
    public boolean updateJob(Long id, Job updatedJob) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            Job job = jobOptional.get();
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setMinSalary(updatedJob.getMinSalary());
            job.setMaxSalary(updatedJob.getMaxSalary());
            job.setLocation(updatedJob.getLocation());
            jobRepository.save(job);
            return true;
        }
        return false;
    }
}



