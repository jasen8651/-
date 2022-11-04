package part01.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import part01.dto.EmpDTO;

public class EmployeesDAO {
	private SqlSession session;
	
	public EmployeesDAO() {
		//1트랜잭션이 설정된 파일 연결
		String resoure = "config/configuration.xml";
		
		//2 설정파일을 로딩하기위해 입풀력 스트림연결
		try(Reader reader = Resources.getResourceAsReader(resoure)) {
			//3 설정파일을 저장하기 위해 팩토리 설정하는 빌더 생성
			SqlSessionFactoryBuilder sqlBuilder = new SqlSessionFactoryBuilder();
			
			//4설정파일의정보를 읽어와 sql빌더에 생성
			SqlSessionFactory factory = sqlBuilder.build(reader);
			//5쿼리문에 접근가능한 sql새션객체를 리턴한다.,자동 커밋을 사용할려면 open새션로 설정
			session = factory.openSession();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//쿼리문 작성
	public int countMethod() {
		
		return session.selectOne("emp.cnt");
	}
	public List<EmpDTO> listMethod(){
		return session.selectList("emp.list");
	}
	public List<EmpDTO> searchMethoe(String data){
		return session.selectList("emp.searchList",data);
	}
}
