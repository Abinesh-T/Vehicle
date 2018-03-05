<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>${HeaderName}</h1>
<div class="container">

<form action="/Vehicle/success" method="post">
<div class="form-group">
<label for="vID">Vehicle ID: </label>
<input type="text" class="form-control" id="vID" name="vID" placeholder="Enter the VechileId">
</div>
<div class="form-group">
<label for="vSpeed">Vehicle Speed: </label>
<input type="text" class="form-control" id="vSpeed" name="vSpeed" placeholder="Enter the VechileSpeed">
</div>
<div class="form-group">
<label for="vLt">Vehicle Latitude: </label>
<input type="text" class="form-control" id="vLt" name="vLt" placeholder="Enter the VechileLatitude">
</div>
<div class="form-group">
<label for="vLg">Vehicle Langitude: </label>
<input type="text" class="form-control" id="vLg" name="vLg" placeholder="Enter the VechileLangitude">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>
</div>

</body>
</html>