package jdbc.select;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.uril.jdbcHelper;

public class Test03사원검색like {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사원의 이름을 입력하세요.");
		String keyword = sc.nextLine();
		
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		String sql = "select * from emp "
				+ "where emp_name like ? || '%'";
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper();
	
	List<EmpDto> list = jdbcTemplate.query(sql,mapper,data);
	
	System.out.println("조회 결과: " +list.size());
	for(EmpDto dto : list) {
		System.out.println(dto.getEmpName());
	}
	}
}
