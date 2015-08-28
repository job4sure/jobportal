<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	$(document).ready(function(){
		$(".tabs > ul").tabs();
	});

	</script>
	<script type="text/javascript">
	$(document).ready(function(){	
		
		$('input[name=rollType]').click(function() {
			if($(this).val() == "0") {
				$('#DivPaid').hide();
				$('#DivFree').show();
			} else {
				$('#DivFree').hide();
				$('#DivPaid').show();
			}
		});
	});
	</script>
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
		 <form:form method="POST" action="saveRegistration" modelAttribute="Registration">
			<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</p>
			<input type="radio" name="rollType" value="1" checked />Jobseeker
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="rollType"
				value="2" />Employer
			<div id="DivFree">
				<table>
					<tr>
						<td style="width: 70px;">FullName*:</td>
						<td><form:input type="text" size="30" path="fullName"
							class="input-text" /></td>
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
						<td>UserEmail*:</td>
						<td><form:input type="text" size="40" path="email"
							class="input-text" /></td>
					</tr>
					<tr>
						<td>Password*:</td>
						<td><form:input type="text" size="40" path="password"
							class="input-text" /></td>
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
							class="input-text" /><br></td>
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
							class="input-submit-02" /></td>
					</tr>

				</table>
			</div>

			<div id="DivPaid" style="display: none;">
				<table>
					<tr>
						<td style="width: 70px;">CompanyName*:</td>
						<td><form:input type="text" size="30" path="fullName"
							class="input-text" /></td>
					</tr>

					<tr>
						<td>CompanyEmail*:</td>
						<td><form:input type="text" size="40" path="email"
							class="input-text" /></td>
					</tr>
					
					<tr>
						<td>Password*:</td>
						<td><form:input type="text" size="40" path="password"
							class="input-text" /></td>
					</tr>
					<tr>
						<td>Contact No.*:</td>
						<td><form:input type="text" size="40" path="mobileNo"
							class="input-text" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Register"
							class="input-submit-02" /></td>
					</tr>
				</table>
			</div>
		</form:form>
	</div>
</body>
</body>
</html>