<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE>
<html>
<head>
	<title>Athlete Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="athlete">
	
		First name: <form:input path="firstName" />
		<br><br>
		Last name: <form:input path="lastName" />
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
		<input type="submit" value="Submit" />
	
	</form:form>
	


</body>

</html>


