
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<div align="center">
	
	<form action="Add-Stud" Method="post" >
	Name: <input type="text" name="name"> <br> <br>
	
	Mobile No: <input type="tel" pattern="[0-9]{10}" name="mobile" > <br><br>
	
	Gender : <input type="radio" name="gender" value="male" > Male
			 <input type="radio" name="gender" value="female" > Female
			 <input type="radio" name="gender" value="Others" > Others
			 <br> <br>
	Skills : <input type="checkbox" name="skills" value="java" > Java
	 <input type="checkbox" name="skills" value="JavaScript" > JavaScript
	 <input type="checkbox" name="skills" value="Reactjs" > React js
	 <input type="checkbox" name="skills" value="HTML" > HTML
	 <input type="checkbox" name="skills" value="CSS" > CSS
			<br> <br>
			
			<button>Add</button>	
	</form>
		<br>
		<a href="/Crud_proj"><button>back</button></a>
	</div>

</body>
</html>