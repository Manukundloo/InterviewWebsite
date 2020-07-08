package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class NetworkingQuestionnaireService {

	private static final String NETWORKING_QUESTIONNAIRE_DASHBOARD = "/Networking/networkingQuestionnaire";
	private static final String NETWORKING_NOVICE_DASHBOARD = "/Networking/networking_novice";
	private static final String NETWORKING_INTERMIDEATE_DASHBOARD = "/Networking/networking_intermediate";
	private static final String NETWORKING_ADVANCE_DASHBOARD = "/Networking/networking_advance";

	public ModelAndView networkingQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(NETWORKING_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView networkingNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(NETWORKING_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView networkingIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(NETWORKING_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView networkingAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(NETWORKING_ADVANCE_DASHBOARD);

		return model;

	}

}
