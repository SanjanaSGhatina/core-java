<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<%@ include file="nav_bar.jsp" %>
</head>
<body>
<div class="container px-5 my-5">
    <form method="post" action="beach" >
        <div class="mb-3">
            <label class="form-label" for="name">Name</label>
            <input class="form-control" id="name" type="text" placeholder="Name" name="name" data-sb-validations="required" />
            <div class="invalid-feedback" data-sb-feedback="name:required">Name is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="location">Location</label>
            <input class="form-control" id="location" type="text" placeholder="Location" name="location" data-sb-validations="required" />
            <div class="invalid-feedback" data-sb-feedback="location:required">Location is required.</div>
        </div>
        <div class="mb-3">
            <label class="form-label d-block">Clean</label>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="yes" type="radio" name="clean" data-sb-validations="" />
                <label class="form-check-label" for="yes">YES</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" id="no" type="radio" name="clean" data-sb-validations="" />
                <label class="form-check-label" for="no">NO</label>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label" for="games">Games</label>
            <select class="form-select" id="games" aria-label="Games">
                <option value="Seashell hunt">Seashell hunt</option>
                <option value="Fly a kite">Fly a kite</option>
                <option value="Water bucket relay">Water bucket relay</option>
                <option value="Limbo">Limbo</option>
                <option value="Seashell hunt">Seashell hunt</option>
            </select>
        </div>
      
        <div class="d-grid">
            <input class="btn btn-primary btn-lg" type="submit" value="Send">
        </div>
    </form>
</div>

</body>
</html>