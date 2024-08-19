package org.zerock.w1.research.dto;

import java.util.List;

public class ResearchDTO {

	private int id; // 고유 번호
	private String question; // 질문
	private String optionText; // 선택지

	public ResearchDTO(int id, String question, String optionText) {
		this.id = id;
		this.question = question;
		this.optionText = optionText;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	@Override
	public String toString() {
		return "researchDTO [id=" + id + ", question=" + question + " optionText=" + optionText + "]";
	}

}
