package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.NetworkingQuestionnaireService;

@Controller
public class NetworkingQuestionnaireController {

	@Autowired
	private NetworkingQuestionnaireService lNETWORKINGQuestionnaireService;

	@RequestMapping(value = "/networkingQuestionnaire")
	public ModelAndView populateNETWORKINGQuestionnairePage() {
		return lNETWORKINGQuestionnaireService.networkingQuestionnaire();

	}

	@RequestMapping(value = "/networking/fresher")
	public ModelAndView populateNETWORKINGNovicePage() {
		return lNETWORKINGQuestionnaireService.networkingNoviceQuestionnaire();

	}

	@RequestMapping(value = "/networking/intermediate")
	public ModelAndView populateNETWORKINGIntermediatePage() {
		return lNETWORKINGQuestionnaireService.networkingIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/networking/advance")
	public ModelAndView populateNETWORKINGExpertPage() {
		return lNETWORKINGQuestionnaireService.networkingAdvanceQuestionnaire();

	}

}
