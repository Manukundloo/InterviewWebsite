package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.CSSQuestionnaireService;

@Controller
public class CSSQuestionnaireController {

	@Autowired
	private CSSQuestionnaireService lCSSQuestionnaireService;

	@RequestMapping(value = "/cssQuestionnaire")
	public ModelAndView populateCSSQuestionnairePage() {
		return lCSSQuestionnaireService.cssQuestionnaire();

	}

	@RequestMapping(value = "/css/fresher")
	public ModelAndView populateCSSNovicePage() {
		return lCSSQuestionnaireService.cssNoviceQuestionnaire();

	}

	@RequestMapping(value = "/css/intermediate")
	public ModelAndView populateCSSIntermediatePage() {
		return lCSSQuestionnaireService.cssIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/css/advance")
	public ModelAndView populateCSSExpertPage() {
		return lCSSQuestionnaireService.cssAdvanceQuestionnaire();

	}

}
