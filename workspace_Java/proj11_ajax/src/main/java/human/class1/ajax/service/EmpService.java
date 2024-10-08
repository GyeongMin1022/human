package human.class1.ajax.service;

import java.util.List;

import human.class1.ajax.dto.EmpDTO;

public interface EmpService {

	List<EmpDTO> listEmp();
	public int joinEmp(EmpDTO empDTO);
	public EmpDTO detailEmp(int empno);
	public int modifyEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
	
}
