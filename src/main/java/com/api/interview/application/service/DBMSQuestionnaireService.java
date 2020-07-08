package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class DBMSQuestionnaireService {

	private static final String DBMS_QUESTIONNAIRE_DASHBOARD = "/DBMS/dbmsQuestionnaire";
	private static final String DBMS_NOVICE_DASHBOARD = "/DBMS/dbms_novice";
	private static final String DBMS_INTERMIDEATE_DASHBOARD = "/DBMS/dbms_intermediate";
	private static final String DBMS_ADVANCE_DASHBOARD = "/DBMS/dbms_advance";

	public ModelAndView dbmsQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DBMS_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView dbmsNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DBMS_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView dbmsIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DBMS_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView dbmsAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DBMS_ADVANCE_DASHBOARD);

		return model;

	}

}
