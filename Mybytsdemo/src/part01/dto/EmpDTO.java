package part01.dto;

import java.sql.Date;
import java.util.List;

public class EmpDTO {
	
	private int employee_id;
	private String first_name;
	private int salart;
	private Date hire_date;
	//private Date date;
	
	
	private Date hire_date() {
		return hire_date();
	}

	public Date getHire_date() {
		return hire_date;
	}


	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public EmpDTO() {
		
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalart() {
		return salart;
	}

	public void setSalart(int salart) {
		this.salart = salart;
	}

	/*
	 * public Date getDate() { return date; }
	 * 
	 * public void setDate(Date date) { this.date = date; }
	 */
	
	
}
