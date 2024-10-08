package human.class1.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import human.class1.ajax.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmp();
	public int insertEmp(EmpDTO empDTO);
	EmpDTO selectEmpOne(int empno);
	int updateEmp(EmpDTO empDTO);
	public int deleteEmp(EmpDTO empDTO);
	
}
