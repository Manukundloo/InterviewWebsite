package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.AWSQuestionnaireService;

@Controller
public class AWSQuestionnaireController {

	@Autowired
	private AWSQuestionnaireService lAWSQuestionnaireService;

	@RequestMapping(value = "/awsQuestionnaire")
	public ModelAndView populateAWSQuestionnairePage() {
		return lAWSQuestionnaireService.awsQuestionnaire();

	}

	@RequestMapping(value = "/aws/fresher")
	public ModelAndView populateAWSNovicePage() {
		return lAWSQuestionnaireService.awsNoviceQuestionnaire();

	}

	@RequestMapping(value = "/aws/intermediate")
	public ModelAndView populateAWSIntermediatePage() {
		return lAWSQuestionnaireService.awsIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/aws/advance")
	public ModelAndView populateAWSExpertPage() {
		return lAWSQuestionnaireService.awsAdvanceQuestionnaire();

	}

}
