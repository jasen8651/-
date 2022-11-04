package part01.Controller;

import java.util.List;

import part01.dao.EmployeesDAO;
import part01.dto.EmpDTO;

public class EmpController {
	
	private EmployeesDAO dao;
	
	
	public EmpController() {
		dao= new EmployeesDAO();
	}
	
	public int countProcrss() {
		return dao.countMethod();
	}
	
	public List<EmpDTO> listprocess(){
		return dao.listMethod();
	}
	
	public List<EmpDTO> searchprocees(String data){
		return dao.searchMethoe(data);
	}
}
