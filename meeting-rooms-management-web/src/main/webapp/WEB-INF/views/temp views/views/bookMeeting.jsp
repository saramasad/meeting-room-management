<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Book a Meeting</title>

<link href="${contextPath}/resources/Static/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/Static/css/common.css"
	rel="stylesheet">

<link rel="stylesheet"
	href="${contextPath}/resources/Static/css//bootstrap-theme.min.css">
<script src="${contextPath}/resources/Static/js/jquery.min.js"></script>
<script src="${contextPath}/resources/Static/js/bootstrap.min.js"></script>
<script
	src="${contextPath}/resources/Static/js/bootstrap-datetimepicker.js"></script>

</head>

<body>

	<div class="container">

		<form method="POST" action="${contextPath}/admin/adduser"
			class="form-horizontal customForm">
			<div class="form-group">
				<label class="col-xs-2 control-label">Room name</label>
				<div class="col-xs-10">
					<input type="text" name="roomname" class="form-control">
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-2 control-label">Location</label>
				<div class="col-xs-10">
					<input type="text" name="location" class="form-control">
				</div>
			</div>

			<div class="form-group">
				<label class="col-xs-2 control-label">Capacity</label>
				<div class="col-xs-10">
					<input type="text" name="capacity" class="form-control">
				</div>

			</div>
			<div class="form-group">
				<label class="col-xs-2 control-label">Equipment</label>
				<div class="col-xs-10">
					<input type="text" name="equipment" class="form-control">
				</div>

			</div>

			<div class="form-group">
				<label class="col-xs-2 control-label">Meetings</label>
				<div class="col-xs-10">
					<input type="text" name="meetings" class="form-control">
				</div>

			</div>
	</div>

	</div>
	<div class="form-group">
		<label class="col-xs-2 control-label">Owner</label>
		<div class="col-xs-10">
			<input type="text" name="owner" class="form-control">

		</div>
	</div>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Add
	</button>
	<button class="btn btn-lg btn-primary btn-block" type="Reset">Reset</button>
	<button class="btn btn-lg btn-primary btn-block" type="text">Cancel</button>

	</form>
	</div>
</body>
</html>
