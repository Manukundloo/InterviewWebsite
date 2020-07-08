package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class DSQuestionnaireService {

	private static final String DS_QUESTIONNAIRE_DASHBOARD = "/DS/dsQuestionnaire";
	private static final String DS_NOVICE_DASHBOARD = "/DS/ds_novice";
	private static final String DS_INTERMIDEATE_DASHBOARD = "/DS/ds_intermediate";
	private static final String DS_ADVANCE_DASHBOARD = "/DS/ds_advance";

	public ModelAndView dsQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DS_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView dsNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DS_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView dsIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DS_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView dsAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(DS_ADVANCE_DASHBOARD);

		return model;

	}

}
