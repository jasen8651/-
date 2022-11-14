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

}
