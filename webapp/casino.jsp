<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<%@ include file="nav_bar.jsp"%>
</head>
<body>
	<div class="container px-5 my-5">
		<form method="post" action="casino">
			<div class="mb-3">
				<label class="form-label" for="name">Name</label> <input
					class="form-control" id="name" type="text" placeholder="Name"
					data-sb-validations="required" name="name" />
				<div class="invalid-feedback" data-sb-feedback="name:required">Name
					is required.</div>
			</div>
			<div class="mb-3">
				<label class="form-label" for="cruise">Cruise</label> <input
					class="form-control" id="cruise" type="text" placeholder="Cruise"
					data-sb-validations="required" name="Cruise" />
				<div class="invalid-feedback" data-sb-feedback="cruise:required">Cruise
					is required.</div>
			</div>
			<div class="mb-3">
				<label class="form-label" for="entryFree">Entry Free</label> <input
					class="form-control" id="entryFree" type="text"
					placeholder="Entry Free" data-sb-validations="required"
					name="entryFee" />
				<div class="invalid-feedback" data-sb-feedback="entryFree:required">Entry
					Free is required.</div>
			</div>
			<div class="mb-3">
				<label class="form-label d-block">Free Food</label>
				<div class="form-check form-check-inline">
					<input class="form-check-input" id="yes" type="radio"
						name="freeFood" data-sb-validations="required" name="freeFood" />
					<label class="form-check-label" for="yes">YES</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" id="no" type="radio"
						name="freeFood" data-sb-validations="required" name="freeAlcohol" />
					<label class="form-check-label" for="no">NO</label>
				</div>
				<div class="invalid-feedback" data-sb-feedback="freeFood:required">One
					option is required.</div>
			</div>
			<div class="mb-3">
				<label class="form-label d-block">Free Alcohol</label>
				<div class="form-check form-check-inline">
					<input class="form-check-input" id="yes" type="radio"
						name="freeAlcohol" data-sb-validations="required" /> <label
						class="form-check-label" for="yes">YES</label>
				</div>
				<div class="form-check form-check-inline">
					<input class="form-check-input" id="no" type="radio"
						name="freeAlcohol" data-sb-validations="required" /> <label
						class="form-check-label" for="no">NO</label>
				</div>
				<div class="invalid-feedback"
					data-sb-feedback="freeAlcohol:required">One option is
					required.</div>
			</div>



			<div class="d-grid">
				<input class="btn btn-primary " type="submit" value="Send">
			</div>
		</form>
	</div>

</body>
</html>