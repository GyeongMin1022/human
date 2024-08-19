package org.zerock.w1.research.service;

import java.util.List;

import org.zerock.w1.research.dao.ResearchDAO;
import org.zerock.w1.research.dto.ResearchDTO;

public class ResearchService {

	public List<ResearchDTO> getResearches() {
		ResearchDAO researchDAO = new ResearchDAO();
		return researchDAO.getResearches();
	}
}
