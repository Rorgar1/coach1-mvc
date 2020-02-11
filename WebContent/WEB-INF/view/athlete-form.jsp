<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>
<head>
	<title>Athlete Registration Form</title>
	
	<style>
		.error {color:red}
	</style>
	<br>
		
</head>

<body>
<i>(*) indicates required field</i>
<br><br><br>

	<form:form action="processForm" modelAttribute="athlete">
	
		First name: <form:input path="firstName" />
		<br><br>
		Last name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		
		Country: 
		<form:select path="country">
			<form:option value="United States" label="United States" />
			<form:option value="Brazil" label="Brazil" />
			<form:option value="China" label="China" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="Japan" label="Japan" />
		</form:select>
		<br><br>
		
		Preferred Sport:
		
		Soccer <form:radiobutton path="preferredSport" value="Soccer"/>
		Baseball <form:radiobutton path="preferredSport" value="Baseball"/>
		Basketball <form:radiobutton path="preferredSport" value="Basketball"/>
		Tennis <form:radiobutton path="preferredSport" value="Tennis"/>
		Track <form:radiobutton path="preferredSport" value="Track"/>
		<br><br>
		
		Practice Day Availability (check all that apply):
		
		Monday <form:checkbox path="practiceDay" value="Monday" />
		Tuesday <form:checkbox path="practiceDay" value="Tuesday" />
		Wednesday <form:checkbox path="practiceDay" value="Wednesday" />
		Thursday <form:checkbox path="practiceDay" value="Thursday" />
		Friday <form:checkbox path="practiceDay" value="Friday" />
		Saturday <form:checkbox path="practiceDay" value="Saturday" />
		Sunday <form:checkbox path="practiceDay" value="Sunday" />
		<br><br>
		
		
		<br><br>
		<input type="submit" value="Submit" />
	
	</form:form>
	


</body>

</html>


