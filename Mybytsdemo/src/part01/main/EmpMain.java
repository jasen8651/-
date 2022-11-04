package part01.main;

import java.util.List;

import part01.Controller.EmpController;
import part01.dto.EmpDTO;

public class EmpMain {

	public static void main(String[] args) {
		EmpController eController = new EmpController();
		System.out.printf("record count: %d\n", eController.countProcrss());
		
		List<EmpDTO> aList= eController.listprocess();
		for(EmpDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getEmployee_id(), dto.getFirst_name(),
					dto.getSalart(), dto.getHire_date());
		
		System.out.println("----------------------------------------------------------");
		
		List<EmpDTO> searchList = eController.searchprocees("eve");
		for(EmpDTO dto : searchList)
			System.out.printf("%d %s %d %s\n", dto.getEmployee_id(), dto.getFirst_name(),
					dto.getSalart(), dto.getHire_date());
	}

}
