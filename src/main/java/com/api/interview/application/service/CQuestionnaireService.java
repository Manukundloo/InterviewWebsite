package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CQuestionnaireService {

	private static final String C_QUESTIONNAIRE_DASHBOARD = "/CQuestions/cQuestionnaire";
	private static final String C_NOVICE_DASHBOARD = "/CQuestions/c_novice";
	private static final String C_INTERMIDEATE_DASHBOARD = "/CQuestions/c_intermediate";
	private static final String C_ADVANCE_DASHBOARD = "/CQuestions/c_advance";

	public ModelAndView cQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(C_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView cNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(C_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView cIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(C_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView cAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(C_ADVANCE_DASHBOARD);

		return model;

	}

}
