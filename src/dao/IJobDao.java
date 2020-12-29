package dao;

import java.util.List;

import model.Job;

public interface IJobDao {
	List<Job> getAllJob();
	void addJob(Job job);
	Job getJobById(int id);
	void updateJob(Job job);
	void deactivateJob(int id);
	void deleteJob(int id);
}
