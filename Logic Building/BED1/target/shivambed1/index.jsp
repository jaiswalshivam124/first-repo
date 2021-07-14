<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<!-- title -->
<title>CreditCard-Home Page </title>

</head>
<body>
<div>



<!-- heading -->
	<h1>Check for Credit Card Eligibilty</h1>
	<form method = "POST" action ="pancard">
		<table border="1">
			<tbody>
				<tr>
					<td>Enter PAN Number:</td>
					<td><input id="panNo" name="pN" type="text" pattern="[a-zA-Z0-9]{10}" title="10 character alpha numeric" required></td>
				</tr>
				<tr>
					<td colspan="2"><button id="submit" name="submit" type="submit">Check</button></td>
				</tr>
			</tbody>
		</table>
	</form>
	
	
	
</div>
</body>
</html>