package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class JAVAQuestionnaireService {

	private static final String JAVA_QUESTIONNAIRE_DASHBOARD = "/JAVA/javaQuestionnaire";
	private static final String JAVA_NOVICE_DASHBOARD = "/JAVA/java_novice";
	private static final String JAVA_INTERMIDEATE_DASHBOARD = "/JAVA/java_intermediate";
	private static final String JAVA_ADVANCE_DASHBOARD = "/JAVA/java_advance";

	public ModelAndView javaQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JAVA_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView javaNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JAVA_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView javaIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JAVA_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView javaAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(JAVA_ADVANCE_DASHBOARD);

		return model;

	}

}
