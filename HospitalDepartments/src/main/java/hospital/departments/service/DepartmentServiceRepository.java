package hospital.departments.service;

import java.util.List;

import hospital.departments.Entity.HospitalDepartment;

public interface DepartmentServiceRepository {
	public String newDepartment( HospitalDepartment department);
	public List< HospitalDepartment> getAlldepartment();
	public HospitalDepartment getdepartment(int id);
}
