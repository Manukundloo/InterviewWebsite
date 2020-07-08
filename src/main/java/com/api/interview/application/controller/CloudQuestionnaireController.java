package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.CLOUDQuestionnaireService;

@Controller
public class CloudQuestionnaireController {

	@Autowired
	private CLOUDQuestionnaireService lCLOUDQuestionnaireService;

	@RequestMapping(value = "/cloudQuestionnaire")
	public ModelAndView populateCLOUDQuestionnairePage() {
		return lCLOUDQuestionnaireService.cloudQuestionnaire();

	}

	@RequestMapping(value = "/cloud/fresher")
	public ModelAndView populateCLOUDNovicePage() {
		return lCLOUDQuestionnaireService.cloudNoviceQuestionnaire();

	}

	@RequestMapping(value = "/cloud/intermediate")
	public ModelAndView populateCLOUDIntermediatePage() {
		return lCLOUDQuestionnaireService.cloudIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/cloud/advance")
	public ModelAndView populateCLOUDExpertPage() {
		return lCLOUDQuestionnaireService.cloudAdvanceQuestionnaire();

	}

}
