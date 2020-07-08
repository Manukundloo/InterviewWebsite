package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.DBMSQuestionnaireService;

@Controller
public class DBMSQuestionnaireController {

	@Autowired
	private DBMSQuestionnaireService lDBMSQuestionnaireService;

	@RequestMapping(value = "/dbmsQuestionnaire")
	public ModelAndView populateDBMSQuestionnairePage() {
		return lDBMSQuestionnaireService.dbmsQuestionnaire();

	}

	@RequestMapping(value = "/dbms/fresher")
	public ModelAndView populateDBMSNovicePage() {
		return lDBMSQuestionnaireService.dbmsNoviceQuestionnaire();

	}

	@RequestMapping(value = "/dbms/intermediate")
	public ModelAndView populateDBMSIntermediatePage() {
		return lDBMSQuestionnaireService.dbmsIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/dbms/advance")
	public ModelAndView populateDBMSExpertPage() {
		return lDBMSQuestionnaireService.dbmsAdvanceQuestionnaire();

	}

}
