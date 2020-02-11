<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE>
<html>
<head>
	<title>Athlete Confirmation Form</title>
</head>

<body>

	The athlete is confirmed: ${athlete.firstName} ${athlete.lastName}
	<br><br>
	
	Country: ${athlete.country}	
	<br><br>
	
	Preferred Sport: ${athlete.preferredSport}
	<br><br>
	
	Practice Day Availability:
	
	<ul>
		<c:forEach var="temp" items="${athlete.practiceDay}">
			<li> ${temp} </li>
		</c:forEach>
	</ul>
	<br><br>
	
	Free Game Passes Requested: ${athlete.freePasses}
	<br><br>
	
	Age of Athlete: ${athlete.age}
	<br><br>
	
	Preferred Drink Name: ${athlete.drinkName}

</body>

</html>