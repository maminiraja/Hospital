package hospital.departments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import hospital.departments.Entity.HospitalDepartment;
import hospital.departments.service.DepartmentServiceRepository;

@Controller
public class DepartmentController 
{

	@Autowired
	private  DepartmentServiceRepository departmentrepo;
	
	
	@GetMapping(path = "/home")
    public String Home()
	{
		return "Home";
	}

	@GetMapping(path = "/adddepartment")
    public String returnToDepartmentForm(Model m)
	{
		HospitalDepartment department=new HospitalDepartment();
		m.addAttribute("department", department);
		return "departmentform";
	}
	
	
	@PostMapping("/")
	public String adding_a_Department(@ModelAttribute("department") HospitalDepartment department) 
	{
		System.out.println(department.getAvailableDoctors());
		departmentrepo.newDepartment(department);
		return "redirect:/home";
	}
	@GetMapping(path ="departments")
    public String fetch_All_Departments(Model m)
	{
		List< HospitalDepartment > list_Of_Departments = departmentrepo.getAlldepartment();
        m.addAttribute("departments", list_Of_Departments);
		return "departmentlist.html";
		
	}
	@GetMapping(path = "departments/{deptId}")
	public HospitalDepartment fetchDepartment(@PathVariable int deptId) {
		return departmentrepo.getdepartment(deptId);
	}
	// json
//	@GetMapping(path = "alldepartments")
//    @ResponseBody
//	public List< HospitalDepartment > fetch_All_Departments() {
//		List< HospitalDepartment > list_Of_Departments = departmentrepo.getAlldepartment();
//		return list_Of_Departments;
//	}
//	@PostMapping("/new_department1")
//	@ResponseBody
//	public String adding_a_Department(@RequestBody HospitalDepartment department) {
//		String saved_department = departmentrepo.newDepartment(department);
//		return saved_department;
//	}

}
