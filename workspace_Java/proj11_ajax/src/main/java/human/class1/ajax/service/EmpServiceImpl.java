package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import human.class1.ajax.dao.EmpDAO;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> listEmp() {

		List<EmpDTO> list = empDAO.selectEmp();
		
		return list;
	}
	
	public int joinEmp(EmpDTO empDTO) {
		return empDAO.insertEmp(empDTO);
	}

	public EmpDTO detailEmp(int empno) {
		return empDAO.selectEmpOne(empno);
	}

	public int modifyEmp(EmpDTO empDTO) {
		return empDAO.updateEmp(empDTO);
	}
	
	public int deleteEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}
}
