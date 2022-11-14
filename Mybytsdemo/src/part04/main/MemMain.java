package part04.main;

import java.util.ArrayList;
import java.util.List;

import part04.controller.Memcontroller;
import part04.dto.MemDTO;

public class MemMain {

	public static void main(String[] args) {
		Memcontroller mc = new Memcontroller();

		/*
		 * List<MemDTO> insertList = new ArrayList<MemDTO>(); insertList.add(new
		 * MemDTO("이기용", 40, "재주")); insertList.add(new MemDTO("이소라", 33, "대전")); int
		 * cnt = mc.multiInsProcess(insertList);
		 * System.out.printf("Insert count : %d\n", cnt);
		 */
		/*
		 * List<Integer> deletlist = new ArrayList<Integer>(); deletlist.add(17);
		 * deletlist.add(18);
		 *
			int delcnt = mc.multiDelProcess(deletlist);
			System.out.printf("delete count %d\n", delcnt);
		*/
		
		/*
		 * System.out.println("검색 결과"); MemDTO dto = new MemDTO(); dto.setAge(33);
		 * dto.setName("이"); List<MemDTO> searchlist = mc.searchPorcess(dto);
		 * display(searchlist);
		 */
		
		/*
		 * MemDTO mt = new MemDTO(); mt.setNum(19); mt.setName("한라산"); mt.setAge(99);
		 * int upcnt = mc.multiuptProcess(mt); System.out.printf("수정 완료 %d\n", upcnt);
		 */
		
		//int inscnt = mc.insertdataProcess(new MemDTO("개구리",10,"계곡"));
		int inscnt = mc.insertdataProcess(new MemDTO("두꺼비",10));
		System.out.printf("inset count %d\n", inscnt);
		
		List<MemDTO> alist = mc.selectProcrss();
	    display(alist);

	}

	public static void display(List<MemDTO> alList) {
		for (MemDTO dto : alList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
	}

}
