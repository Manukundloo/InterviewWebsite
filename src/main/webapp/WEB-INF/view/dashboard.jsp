<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/dashboard-style.css" type="text/css" />
</head>
<body>

	<div id="topsection">
		<h1>uCertify Candidate Selection Questionnaire</h1>
	</div>

	<div class="tab">
		<button class="tablinks" onclick="openQuestionaire(event, 'HTML')"
			id="defaultOpen">HTML Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'CSS')">CSS
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'JAVAScript')">JS
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'Linux')">Linux
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'SQL')">SQL
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'DBMS')">DBMS
			Questions</button>
		<button class="tablinks"
			onclick="openQuestionaire(event, 'DATAStructure')">DS Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'JAVA')">JAVA/C++
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'CQuestions')">C
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'AI')">AI
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'Python')">Python
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'PHP')">PHP
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'CLOUD')">Cloud
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'AWS')">AWS
			Questions</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'NetWorking')">Networking
			Questions</button>

	</div>

	<div id="HTML" class="tabcontent">
		<iframe src="/htmlQuestionnaire" height="700" width="1110"
			frameBorder="0" scrolling="no"></iframe>
	</div>

	<div id="CSS" class="tabcontent">

		<iframe src="/cssQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>

	<div id="JAVAScript" class="tabcontent">

		<iframe src="/jsQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>

	</div>

	<div id="Linux" class="tabcontent">
		<iframe src="/linuxQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="SQL" class="tabcontent">
		<iframe src="/sqlQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="DBMS" class="tabcontent">

		<iframe src="/dbmsQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>

	<div id="DATAStructure" class="tabcontent">
		<iframe src="/dsQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="JAVA" class="tabcontent">
		<iframe src="/javaQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="CQuestions" class="tabcontent">
		<iframe src="/cQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="AI" class="tabcontent">
		<iframe src="/aiQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="Python" class="tabcontent">
		<iframe src="/dsQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="PHP" class="tabcontent">
		<iframe src="/phpQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="CLOUD" class="tabcontent">
		<iframe src="/cloudQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="AWS" class="tabcontent">
		<iframe src="/awsQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>
	<div id="NetWorking" class="tabcontent">
		<iframe src="/networkingQuestionnaire" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>


	<script src="./js/questionnairePage.js" defer></script>


</body>
</html>
