package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class SQLQuestionnaireService {

	private static final String SQL_QUESTIONNAIRE_DASHBOARD = "/SQL/sqlQuestionnaire";
	private static final String SQL_NOVICE_DASHBOARD = "/SQL/sql_novice";
	private static final String SQL_INTERMIDEATE_DASHBOARD = "/SQL/sql_intermediate";
	private static final String SQL_ADVANCE_DASHBOARD = "/SQL/sql_advance";

	public ModelAndView sqlQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(SQL_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView sqlNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(SQL_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView sqlIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(SQL_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView sqlAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(SQL_ADVANCE_DASHBOARD);

		return model;

	}

}
