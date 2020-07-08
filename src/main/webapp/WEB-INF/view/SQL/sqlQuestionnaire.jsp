<!DOCTYPE sql>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="./css/questionnairepages-style.css"
	type="text/css" />
</head>
<body>

	<div class="tab">
		<button class="tablinks" onclick="openQuestionaire(event, 'Fresher')"
			id="defaultOpen">Fresher</button>
		<button class="tablinks"
			onclick="openQuestionaire(event, 'Intermediate')">Intermediate</button>
		<button class="tablinks" onclick="openQuestionaire(event, 'Expert')">Expert</button>
	</div>

	<div id="Fresher" class="tabcontent">
		<iframe src="/sql/fresher" height="700" width="1100" frameBorder="0"
			scrolling="no"></iframe>
	</div>

	<div id="Intermediate" class="tabcontent">
		<iframe src="/sql/intermediate" height="700" width="1100"
			frameBorder="0" scrolling="no"></iframe>
	</div>

	<div id="Expert" class="tabcontent">
		<iframe src="/sql/advance" height="700" width="1100" frameBorder="0"
			scrolling="no"></iframe>
	</div>

	<script src="./js/questionnairePage.js" defer></script>

</body>
</html>
