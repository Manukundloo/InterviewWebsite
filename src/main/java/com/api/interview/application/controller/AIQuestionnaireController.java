package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.AIQuestionnaireService;

@Controller
public class AIQuestionnaireController {

	@Autowired
	private AIQuestionnaireService lAIQuestionnaireService;

	@RequestMapping(value = "/aiQuestionnaire")
	public ModelAndView populateAIQuestionnairePage() {
		return lAIQuestionnaireService.aiQuestionnaire();

	}

	@RequestMapping(value = "/ai/fresher")
	public ModelAndView populateAINovicePage() {
		return lAIQuestionnaireService.aiNoviceQuestionnaire();

	}

	@RequestMapping(value = "/ai/intermediate")
	public ModelAndView populateAIIntermediatePage() {
		return lAIQuestionnaireService.aiIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/ai/advance")
	public ModelAndView populateAIExpertPage() {
		return lAIQuestionnaireService.aiAdvanceQuestionnaire();

	}

}
