<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>


<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	
</script>

</head>

<body>
	<form id="foo" method="post" action="${pageContext.request.contextPath}/login">
		<input id="username" name="username" type="text" value="" /> <br>
		<input id="passwd" name="passwd" type="password" value="" /> <br>
		<input type="submit" value="Send" />
	</form>
	
</body>
</html>