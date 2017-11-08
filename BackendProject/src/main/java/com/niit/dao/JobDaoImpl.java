package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Job;

@Repository
public class JobDaoImpl implements JobDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void saveJobDetails(Job job) {
		Session session = sessionFactory.openSession();
		session.save(job);
		session.flush();
		session.close();

	}

	public List<Job> getAllJobDetails() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Job");
		List<Job> jobs = query.list();
		session.close();
		return jobs;
	}

	public Job getJobById(int id) {
		Session session = sessionFactory.openSession();
		Job job = (Job) session.get(Job.class, id);
		session.close();
		return job;
	}
}
