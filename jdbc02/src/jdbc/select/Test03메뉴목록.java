package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.uril.jdbcHelper;

public class Test03메뉴목록 {
	public static void main(String[] args) {
		
		JdbcTemplate jdbcTemplate = jdbcHelper.getJdbcTemplate();
		
		String sql = "select * from menu order by menu_no asc";
		//Object[] data = {};
		MenuMapper mapper = new MenuMapper();
		
		//List<MenuDto> list = jdbcTemplate.query(sql, mapper, data); 데이터가 있을시
		List<MenuDto> list = jdbcTemplate.query(sql, mapper);
	
		for(MenuDto dto : list) {
//			System.out.println(dto.toString());
			System.out.print(dto.getMenuNameEng());
			System.out.print("(");
			System.out.print(dto.getMenuNameEng());
			System.out.print(")");
			System.out.print("-");
			System.out.println(dto.getMenuPrice()+"원");
				}
	}
}
