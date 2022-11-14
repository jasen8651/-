package part04.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part04.dto.MemDTO;

public class MemDAO {
	
	private SqlSession session;
	
	public MemDAO() {
		String resoure = "config/configuration.xml";
		try (Reader reader = Resources.getResourceAsReader(resoure)) {
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = sqlBuilder.build(reader);
			session = factory.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<MemDTO> allMethod() {
		return session.selectList("per.all");
	}
	public int keyNumMethod() {
		return session.selectOne("per.keyNum");
	}
	public int multiInsertMethod(List<MemDTO> list) {
		return session.insert("per.multiIns", list);
	}
	public int multiDeleteMethod(List<Integer> list) {
		return session.delete("per.multiDel",list);
	}
	public List<MemDTO> searchMethod(MemDTO dto){
		return session.selectList("per.search", dto);
	}
	public int multiuptMethod(MemDTO dto) {
		return session.update("per.multiupt", dto);
	}
	public int inserdataMethod(MemDTO dto) {
		return session.insert("per.insData", dto);
	}
}
