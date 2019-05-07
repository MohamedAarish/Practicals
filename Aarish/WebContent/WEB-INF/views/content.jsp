<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title>
</head>
<body>
	<form name="showForm" action="start">
		<center>
			<table border="2" width=80% height=100>
				<tr>
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Dept</th>
					<th>Designation</th>
					<th>Salary</th>
				</tr>
				<c:forEach items="${Employee}" var="employee">
					<tr style="color: blue">
						<td>${employee.employeeId}</td>
						<td>${employee.empName}</td>
						<td>${employee.dept}</td>
						<td>${employee.designation}</td>
						<td>${employee.salary}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="5" style="text-align: right;"><input type="submit" value="Back" /></td>

				</tr>
			</table>
		</center>

	</form>
</body>
</html>