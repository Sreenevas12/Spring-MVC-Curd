<%@page isELIgnored="false" %>
<%@page import="java.util.Arrays" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fetching data Page</title>
</head>

<body>
	
	<div align="center">
	
	<h1 align="center" style="color:green">${success}</h1> 
	
	<h1>Student Details :</h1>
	
	<table border="1">
			<tr>
				<th>Name</th>
				<th>Mobile</th>
				<th>Gender</th>
				<th>Skills</th>
				<th>Edit</th>
				<th>Delete</th>
				
			</tr>
			
				<x:forEach var="s" items="${students}"><tr>
					<th>${s.name} </th>
					<th>${s.mobile}</th>
					<th>${s.gender}</th>
					<th>${Arrays.toString(s.skills)}</th>
					<th><a href="edit?id=${s.id}"><button>Edit</button></a></th>
					<th><a href="delete?id=${s.id}"><button>Delete</button></a></th>
				</tr>
				
				
								
				</x:forEach>
			
		
			
			</table>
	
	</div>
	
</body>
</html>