package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class InterviewQuestionnaireApplicationService {

	private static final String INTERVIEW_QUESTIONNAIRE_DASHBOARD = "dashboard";

	public ModelAndView welcome() {

		ModelAndView model = new ModelAndView();
		model.setViewName(INTERVIEW_QUESTIONNAIRE_DASHBOARD);

		return model;

	}

}
