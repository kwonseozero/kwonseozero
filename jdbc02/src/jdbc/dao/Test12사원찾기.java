package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.select.EmpDto;

public class Test12사원찾기 {

	public static void main(String[] args) {
		
		int empNo = 918;
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(empNo);
		
		if(dto != null) {
			System.out.println("사원 정보");
			System.out.println("사번: " + dto.getEmpNo());
			System.out.println("이름: " + dto.getEmpName());
			System.out.println("부서: " + dto.getEmpDept());
			System.out.println("입사일: " + dto.getEmpDate());
			System.out.println("급여: " + dto.getEmpSal());
		} else {
			System.out.println("존재하지 않는 사번입니다");
		}
	}

}