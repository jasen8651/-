package part03;

import java.util.List;

import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class MenuMain {
	public static void main(String[] args) {
		
		EmpDeptController eDeptController = new EmpDeptController();
		/*List<EmpDTO> aList = eDeptController.empdeptProcess();
		for(EmpDTO dDto : aList) {
			System.out.printf("%d %s %s %d %s\n", eDto.getEmployee_id(), eDto.getFirst_name(), 
					eDto.getJob_id(), eDto.getDept().getDepartment_id(),eDto.getDept().getDepartment_name());
		}*/
		
		List<DeptDTO> aList = eDeptController.deptProcess();
		for(DeptDTO ddto : aList) {
			for(EmpDTO edto : ddto.getEmplist()) {
				System.out.printf("%d %s %d %s %s\n", ddto.getDepartment_id(), ddto.getDepartment_name(),
						edto.getEmployee_id(), edto.getFirst_name(), edto.getJob_id());	
			}
		}
	}
}
