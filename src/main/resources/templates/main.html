<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Management System</title>
<style>
body {
	font-family: Arial, sans-serif;
	line-height: 1.6;
	color: #333;
	max-width: 1200px;
	margin: 0 auto;
	padding: 20px;
	background-color: #f4f4f4;
}

h3 {
	margin-bottom: 20px;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-bottom: 20px;
	background-color: #fff;
	box-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);
}

th, td {
	padding: 12px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #2196F3;
	color: white;
}

tr:hover {
	background-color: #f5f5f5;
}

button {
	background-color: #2196F3;
	color: white;
	padding: 10px 15px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	transition: background-color 0.3s;
}

button:hover {
	background-color: #1976D2;
}

input[type="text"], input[type="number"] {
	width: 100%;
	padding: 8px;
	margin: 5px 0 15px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 1px 3px rgba(0, 0, 0, 0.12), 0 1px 2px rgba(0, 0, 0, 0.24);
}

.success {
	color: #2196F3;
}

.failure {
	color: #f44336;
}

.button-group {
	margin-bottom: 20px;
}

.button-group a {
	margin-right: 10px;
}
</style>
</head>
<body>
	<h3 th:if="${failure}" class="failure" th:text="${failure}"></h3>
	<h3 th:if="${success}" class="success" th:text="${success}"></h3>

	<div th:if="${list}">
		<table>
			<tr>
				<th>Name</th>
				<th>Mobile</th>
				<th>Gender</th>
				<th>Maths</th>
				<th>Science</th>
				<th>English</th>
				<th>Percentage</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>

			<tr th:each="student:${list}">
				<td th:text="${student.name}"></td>
				<td th:text="${student.mobile}"></td>
				<td th:text="${student.gender}"></td>
				<td th:text="${student.maths}"></td>
				<td th:text="${student.science}"></td>
				<td th:text="${student.english}"></td>
				<td th:text="${student.percentage}"></td>
				<td><a th:href="'/edit/'+${student.id}"><button>Edit</button></a></td>
				<td><a th:href="'/delete/'+${student.id}"><button>Delete</button></a></td>
			</tr>
		</table>
	</div>

	<div class="button-group">
		<a href="/insert"><button>Insert Record</button></a> <a href="/fetch"><button>Fetch
				Records</button></a>
	</div>

	<div th:if="${insert}">
		<form action="/insert" method="post">
			<h3>Insert New Record</h3>
			<input type="text" name="name" placeholder="Enter Name" required>
			<input type="number" name="mobile" placeholder="Enter Mobile"
				required>
			<div>
				<label>Gender:</label> <input type="radio" name="gender"
					value="male" required> Male <input type="radio"
					name="gender" value="female" required> Female
			</div>
			<h4>Marks:</h4>
			<input type="number" name="maths" placeholder="Enter Maths Marks"
				required> <input type="number" name="science"
				placeholder="Enter Science Marks" required> <input
				type="number" name="english" placeholder="Enter English Marks"
				required>
			<button type="submit">Insert</button>
		</form>
	</div>

	<div th:if="${update}">
		<form action="/update" method="post" th:object="${student}">
			<h3>Update Record</h3>
			<input type="hidden" name="id" th:field="*{id}"> <input
				type="text" name="name" th:field="*{name}" placeholder="Enter Name"
				required> <input type="number" name="mobile"
				th:field="*{mobile}" placeholder="Enter Mobile" required>
			<div>
				<label>Gender:</label> <input type="radio" name="gender"
					th:field="*{gender}" value="male" required> Male <input
					type="radio" name="gender" th:field="*{gender}" value="female"
					required> Female
			</div>
			<h4>Marks:</h4>
			<input type="number" name="maths" th:field="*{maths}"
				placeholder="Enter Maths Marks" required> <input
				type="number" name="science" th:field="*{science}"
				placeholder="Enter Science Marks" required> <input
				type="number" name="english" th:field="*{english}"
				placeholder="Enter English Marks" required>
			<button type="submit">Update</button>
		</form>
	</div>

	<div th:if="${fetch}" class="button-group">
		<h3>Fetch Records By:</h3>
		<a href="/fetch/name"><button>Name</button></a> <a
			href="/fetch/mobile"><button>Mobile</button></a> <a
			href="/fetch/gender"><button>Gender</button></a> <a
			href="/fetch/marks"><button>Marks</button></a> <a
			href="/fetch/percentage"><button>Percentage</button></a>
	</div>

	<div th:if="${field}">
		<form th:action="'/fetch/'+${field}" method="post">
			<h3>
				Search by <span th:text="${field}"></span>
			</h3>
			<input type="text" th:name="${field}"
				th:placeholder="'Enter ' + ${field}" required>
			<button type="submit">Search</button>
		</form>
	</div>
</body>
</html>
