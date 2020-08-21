<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- you need to include the ShieldUI CSS and JS assets in order for the Upload widget to work -->
<link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css" />
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>

<script type="text/javascript">
    jQuery(function ($) {
        $("#files").shieldUpload();
    });
</script>

<form action="uploadDoc" method="post" enctype="multipart/form-data">  

	Attach Your Photo : <br/><input type="file" name="avatar"/><br/>  <br/><br/><br/><br/><br/>

	Attach Valid Organization Document/Medical Report/Company ID/Aadhaar card etc: <br/><input type="file" name="adhar"/><br/>  <br/><br/><br/><br/><br/>
	Attach Doctor Certificate:<br/><input type="file" name="doct_cert"/><br/> <br/> <br/>  
<input type="submit" value="upload"/>  


</form>  




</body>
</html>