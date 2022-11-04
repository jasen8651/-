package part02.controller;

import java.util.HashMap;
import java.util.List;

import part02.dao.MemDAO;
import part02.dto.MemDTO;



public class MemController {
	
	private MemDAO dao;
	
	public MemController() {
		dao = new MemDAO();
	}
	public List<MemDTO> listprocess(){
		return dao.listMethod();
	}
	public int insertProcess(MemDTO dto) {
		return dao.inserMethod(dto);
	}
	public int updateprocess(HashMap<String, Object> hmap) {
		return dao.updatamethod(hmap);
	}
	public int deletprocess(int age) {
		return dao.deletemethod(age);
	}
}
