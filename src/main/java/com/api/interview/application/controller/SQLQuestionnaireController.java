package com.api.interview.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.api.interview.application.service.SQLQuestionnaireService;

@Controller
public class SQLQuestionnaireController {

	@Autowired
	private SQLQuestionnaireService lSQLQuestionnaireService;

	@RequestMapping(value = "/sqlQuestionnaire")
	public ModelAndView populateSQLQuestionnairePage() {
		return lSQLQuestionnaireService.sqlQuestionnaire();

	}

	@RequestMapping(value = "/sql/fresher")
	public ModelAndView populateSQLNovicePage() {
		return lSQLQuestionnaireService.sqlNoviceQuestionnaire();

	}

	@RequestMapping(value = "/sql/intermediate")
	public ModelAndView populateSQLIntermediatePage() {
		return lSQLQuestionnaireService.sqlIntermediateQuestionnaire();

	}

	@RequestMapping(value = "/sql/advance")
	public ModelAndView populateSQLExpertPage() {
		return lSQLQuestionnaireService.sqlAdvanceQuestionnaire();

	}

}
