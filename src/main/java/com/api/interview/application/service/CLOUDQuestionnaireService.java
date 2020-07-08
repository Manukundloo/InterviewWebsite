package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CLOUDQuestionnaireService {

	private static final String CLOUD_QUESTIONNAIRE_DASHBOARD = "/CLOUD/cloudQuestionnaire";
	private static final String CLOUD_NOVICE_DASHBOARD = "/CLOUD/cloud_novice";
	private static final String CLOUD_INTERMIDEATE_DASHBOARD = "/CLOUD/cloud_intermediate";
	private static final String CLOUD_ADVANCE_DASHBOARD = "/CLOUD/cloud_advance";

	public ModelAndView cloudQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CLOUD_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView cloudNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CLOUD_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView cloudIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CLOUD_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView cloudAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(CLOUD_ADVANCE_DASHBOARD);

		return model;

	}

}
