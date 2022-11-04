package part02.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import part02.dto.MemDTO;


public class MemDAO {
	
	private SqlSession session;
	public MemDAO() {
	String resoure = "config/configuration.xml";
		try(Reader reader = Resources.getResourceAsReader(resoure)) {
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = sqlBuilder.build(reader);
			session = factory.openSession();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	public List<MemDTO> listMethod() {
		return session.selectList("mem.list");
	}

	// 삽입
	public int inserMethod(MemDTO dto) {
		int chk = -1;
		return chk;
	}
	//수정
	public int updatamethod(HashMap<String, Object>hmap) {
		int chk =-1;	
		return chk;
	}
	//삭제
	public int deletemethod(int age) {
		int chk =-1;		
		return chk;
	}	
}
