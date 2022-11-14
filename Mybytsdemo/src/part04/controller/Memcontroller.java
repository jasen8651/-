package part04.controller;

import java.util.List;

import part04.dao.MemDAO;
import part04.dto.MemDTO;

public class Memcontroller {
	private MemDAO dao;
	
	public Memcontroller() {
		dao = new MemDAO();
	}
	
	public List<MemDTO> selectProcrss(){
		return dao.allMethod();
	}
	
	public int multiInsProcess(List<MemDTO> list) {
		for(MemDTO dto : list)
			dto.setNum(dao.keyNumMethod());
		return dao.multiInsertMethod(list);
	}
	public int multiDelProcess(List<Integer> list) {
		return dao.multiDeleteMethod(list);
	}
	public List<MemDTO> searchPorcess(MemDTO dto){
		return dao.searchMethod(dto);
	}
	
	public int multiuptProcess(MemDTO dto) {
		return dao.multiuptMethod(dto);
	}
}
