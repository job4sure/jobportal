<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/register.js"></script>
</head>
<body>
	<div id="main">
		<div id="tray" class="box">
			<h1 align="center">Regisration Form</h1>
		</div>

		<hr class="noscreen" />

		<div id="menu" class="box">
			<ul class="box">

			</ul>
		</div>
		 <h3 style="color: red;">${message}</h3>	
			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</p>
			<input type="radio" name="rollType" value="0" checked />Jobseeker
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="rollType"
				value="1" />Employer
			<div id="DivFree">
			<div>
			<form:form method="POST" action="saveRegistration" modelAttribute="Registration">
				<table>
					<tr>
						<td style="width: 150px;">Full Name*:</td>
						<td><form:input type="text" size="30" path="fullName"
								class="input-text" required="autofocus" maxlength="80"/></td>
								<form:hidden path="rollType" value="1"/>
					</tr>

					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<form:errors path="email" class="label error-label"></form:errors>
					<tr>
						<td>User Email*:</td>
						<td><form:input type="text" size="40" path="email"
								class="input-text" required="autofocus" maxlength="80"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Password*:</td>
						<td><form:input type="text" size="40" path="password"
								class="input-text" required="autofocus" maxlength="5"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Conform Password*:</td>
						<td><form:input type="text" size="40" path="conformPassword"
								class="input-text" required="autofocus" maxlength="5"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Mobile No.*:</td>
						<td><form:input type="text" size="40" path="mobileNo"
								class="input-text" required="autofocus" maxlength="10"/><br></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Company Url*:</td>
						<td><form:input type="text" size="40" path="Companyurl"
								class="input-text" required="autofocus" maxlength="80"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td><input type="submit" value="Register"
							class="input-submit-02" required="autofocus"/></td>
					</tr>

				</table>
			</form:form>
</div>
</div>
<div>
			<div id="DivPaid" style="display: none;">
			<form:form method="POST" action="saveRegistration" modelAttribute="Registration">
				<table>
					<tr>
						<td style="width: 150px;">Company Name*:</td>
						<td><form:input type="text" size="30" path="fullName"
								class="input-text" required="autofocus" maxlength="80"/></td>
						<form:hidden path="rollType" value="2"/>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>

					<tr>
						<form:errors path="email" class="label error-label"></form:errors>
						<td>Company Email*:</td>
						<td><form:input type="text" size="40" path="email"
								class="input-text" required="autofocus" maxlength="80"/></td>
					</tr>
                     <tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Password*:</td>
						<td><form:input type="text" size="40" path="password"
								class="input-text" required="autofocus" maxlength="5"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Conform Password*:</td>
						<td><form:input type="text" size="40" path="conformPassword"
								class="input-text" required="autofocus" maxlength="5"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Contact No.*:</td>
						<td><form:input type="text" size="40" path="mobileNo"
								class="input-text" required="autofocus" maxlength="10"/></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td>Company Url*:</td>
						<td><form:input type="text" size="40" path="Companyurl"
								class="input-text" required="autofocus" maxlength="80"/></td>
					</tr>
                     <tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td><input type="submit" value="submit"
							class="input-submit-02" /></td>
					</tr>
				</table>
		</form:form>
	</div>
	</div>
</body>
</html>