package hospital.departments.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_table")
public class HospitalDepartment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long departmentId;
	private String departmentName;
	private int availableDoctors;

	private String departmentDescription;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getAvailableDoctors() {
		return availableDoctors;
	}

	public void setAvailableDoctors(int availableDoctores) {
		this.availableDoctors = availableDoctores;
	}

	public String getDepartmentDescription() {
		return departmentDescription;
	}

	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}

	public HospitalDepartment() {
		super();
	}

	public HospitalDepartment(Long departmentId, String departmentName, int availableDoctors,
			String departmentDescription) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.availableDoctors = availableDoctors;
		this.departmentDescription = departmentDescription;
	}

	@Override
	public String toString() {
		return "HospitalDepartment [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", availableDoctors=" + availableDoctors + ", departmentDescription=" + departmentDescription + "]";
	}

}
