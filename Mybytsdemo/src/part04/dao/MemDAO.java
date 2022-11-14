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

}
