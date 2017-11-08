package com.niit.dao;


import java.util.List;

import com.niit.model.Job;

public interface JobDao {

	void saveJobDetails(Job job);

	List<Job> getAllJobDetails();

	Job getJobById(int id);
	

}
