package part03.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part03.dto.DeptDTO;
import part03.dto.EmpDTO;

public class JoinDAO {

	private SqlSession session;

	public JoinDAO() {
		String resoure = "config/configuration.xml";
		try (Reader reader = Resources.getResourceAsReader(resoure)) {
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = sqlBuilder.build(reader);
			session = factory.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public List<EmpDTO> emp_deptMethod(){
		return session.selectList("join.emp_dept");
	}
	public List<DeptDTO> dept_empMethod(){
		return session.selectList("join.dept_emp");
	}
	

}
