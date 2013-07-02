<html>
<head>
<TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>


<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#foo").bind('submit', function() {

			// setup some local variables
			var $form = $(this);
			// let's select and cache all the fields
			var $inputs = $form.find("input");
			// serialize the data in the form
			var serializedData = $form.serialize();

			// let's disable the inputs for the duration of the ajax request
			$inputs.prop("disabled", true);
			$.ajax({
				url : 'login',
				type : "post",
				data : serializedData,
				success : function(data) {
					$('#result').html(data);
				}
			});

			return false;
		});
	});
</script>

</head>

<body>
	<form id="foo">

		<input id="username" name="username" type="text" value="" /> <br>
		<input id="passwd" name="passwd" type="password" value="" /> <br>
		<input type="submit" value="Send" />
	</form>
	<div align="center">
		<br> <br> ${message} <br> <br>
		<div id="result"></div>
		<br>

	</div>
</body>
</html>