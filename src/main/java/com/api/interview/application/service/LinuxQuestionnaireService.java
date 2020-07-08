package com.api.interview.application.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class LinuxQuestionnaireService {

	private static final String LINUX_QUESTIONNAIRE_DASHBOARD = "/LINUX/linuxQuestionnaire";
	private static final String LINUX_NOVICE_DASHBOARD = "/LINUX/linux_novice";
	private static final String LINUX_INTERMIDEATE_DASHBOARD = "/LINUX/linux_intermediate";
	private static final String LINUX_ADVANCE_DASHBOARD = "/LINUX/linux_advance";

	public ModelAndView linuxQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(LINUX_QUESTIONNAIRE_DASHBOARD);
		return model;
	}

	public ModelAndView linuxNoviceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(LINUX_NOVICE_DASHBOARD);

		return model;

	}

	public ModelAndView linuxIntermediateQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(LINUX_INTERMIDEATE_DASHBOARD);

		return model;

	}

	public ModelAndView linuxAdvanceQuestionnaire() {

		ModelAndView model = new ModelAndView();
		model.setViewName(LINUX_ADVANCE_DASHBOARD);

		return model;

	}

}
