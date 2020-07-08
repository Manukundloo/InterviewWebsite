package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.PHPQuestionnaireService;

@Controller
public class PHPQuestionnaireController {

	@Autowired
	private PHPQuestionnaireService lPHPQuestionnaireService;

	@RequestMapping(value = "/phpQuestionnaire")
	public ModelAndView populatePHPQuestionnairePage() {
		return lPHPQuestionnaireService.phpQuestionnaire();

	}

	@RequestMapping(value = "/php/fresher")
	public ModelAndView populatePHPNovicePage() {
		return lPHPQuestionnaireService.phpNoviceQuestionnaire();

	}

	@RequestMapping(value = "/php/intermediate")
	public ModelAndView populatePHPIntermediatePage() {
		return lPHPQuestionnaireService.phpIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/php/advance")
	public ModelAndView populatePHPExpertPage() {
		return lPHPQuestionnaireService.phpAdvanceQuestionnaire();

	}

}
