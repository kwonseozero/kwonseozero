package jdbc.dao;

public class emp목록 {
	
	
	//제 깃허브에 올려지지 않은 관계로 강사님 것 보고 참고하였습니다.
	
	//목록 메소드
	public List<EmpDto> selectList() {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp order by emp_no asc";
		//Object[] data = {};
		EmpMapper mapper = new EmpMapper();
		return jdbcTemplate.query(sql, mapper);
//		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper);
//		return list;
	}
	
	//상세 메소드 
	public EmpDto selectOne(int EmpNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_no = ?";
		Object[] data = {empNo};
		EmpMapper mapper = new EmpMapper();
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
//		if(list.isEmpty()) {
//			return null;
//		}
//		else {
//			return list.get(0);
//		}
}
}