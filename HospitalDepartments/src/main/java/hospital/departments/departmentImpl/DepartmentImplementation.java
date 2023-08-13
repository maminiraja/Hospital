package hospital.departments.departmentImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hospital.departments.Entity.HospitalDepartment;
import hospital.departments.Exception.NoDepartmentFoundException;
import hospital.departments.departmentrespository.DepartmentRespository;
import hospital.departments.service.DepartmentServiceRepository;
@Service
public class DepartmentImplementation implements  DepartmentServiceRepository{


          @Autowired
	    private DepartmentRespository departmentrepository;



      	@Override
      	public String newDepartment(HospitalDepartment department)
      	{
      		HospitalDepartment returned_department = departmentrepository.save(department);
      		
      		return "A department is saved succesfully";
      	}
      	@Override
      	public List<HospitalDepartment> getAlldepartment() 
      	{
      		List<HospitalDepartment> all_departments = departmentrepository.findAll();
      		if (all_departments.size() != 0) 
      		{
      			return all_departments;
      			
      		} 
      		
      		else 
      		{
      			throw new NoDepartmentFoundException("no department Available currently");
      		}
      	}
      	@Override
      	public HospitalDepartment getdepartment(int id) 
      	{
      		return departmentrepository.findById(id).get();
      	}


}
