package part04.main;

import java.util.List;

import part04.controller.Memcontroller;
import part04.dto.MemDTO;

public class MemMain {

	public static void main(String[] args) {
		Memcontroller mc = new Memcontroller();
		
		List<MemDTO> alist = mc.selectProcrss();
		display(alist);

	}
	public static void display(List<MemDTO> alList) {
		for(MemDTO dto : alList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(),  dto.getLoc());
	}

}
