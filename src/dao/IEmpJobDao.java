package dao;

import java.util.List;

import model.EmpJob;

public interface IEmpJobDao {
	List<EmpJob> getAllEmpJob();
	void addEmpJob(EmpJob empj);
	EmpJob getEmpJobById(int id);
	void updateEmpJob(EmpJob empj);
	void deactivateEmpJob(EmpJob empj);
	void deleteEmpJob(int id);
}
