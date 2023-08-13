package hospital.departments.departmentrespository;

import org.springframework.data.jpa.repository.JpaRepository;

import hospital.departments.Entity.HospitalDepartment;

public interface DepartmentRespository extends JpaRepository<HospitalDepartment,Integer> 
{

}
