<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>CoWin Registration</title>
	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Font-->
	<link rel="stylesheet" type="text/css" href="css/montserrat-font.css">
	<link rel="stylesheet" type="text/css" href="fonts/material-design-iconic-font/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<!-- Main Style Css -->
    <link rel="stylesheet" href="css/style2.css"/>
</head>
<body class="form-v10">
	<div class="page-content">
		<div class="form-v10-content">
			<form class="form-detail" action="register" method="post" id="myform" enctype="multipart/form-data">
				<div class="form-left">
					<h2>General Information</h2>
					<div class="form-group">
						<div class="form-row form-row-1">
							<input type="text" name="first_name" id="first_name" class="input-text" placeholder="First Name" required>
						</div>
						<div class="form-row form-row-2">
							<input type="text" name="last_name" id="last_name" class="input-text" placeholder="Last Name" required>
						</div>
					</div>
					
					<div class="form-row">
						<select name="start_city">
						    <option class="option" value="none">Select Starting District</option>
						    <option class="option" value="Ahmednagar">Ahmednagar</option>
							<option class="option" value="Akola">Akola</option>
							 <option class="option" value="amravati">Amravati</option> 
							 <option class="option" value="aurangabad">Aurangabad</option> 
							 <option class="option" value="beed">Beed</option> 
							 <option class="option" value="bhandara">Bhandara</option> 
							 <option class="option" value="buldana">Buldana</option> 
							 <option class="option" value="chandrapur">Chandrapur</option> 
							 <option class="option" value="dhule">Dhule</option> 
							 <option class="option" value="gadchiroli">Gadchiroli</option> 
							 <option class="option" value="gondia">Gondia</option> 
							 <option class="option" value="hingoli">Hingoli</option> 
							 <option class="option" value="jalgaon">Jalgaon</option> 
							 <option class="option" value="jalna">Jalna</option> 
							 <option class="option" value="kolhapur">Kolhapur</option> 
							 <option class="option" value="latur">Latur</option> 
							 <option class="option" value="mumbai city">Mumbai City</option> 
							 <option class="option" value="mumbai suburban">Mumbai Suburban</option> 
							 <option class="option" value="nagpur">Nagpur</option> 
							 <option class="option" value="nanded">Nanded</option> 
							 <option class="option" value="nandurbar">Nandurbar</option> 
							 <option class="option" value="nashik">Nashik</option> 
							 <option class="option" value="osmanabad">Osmanabad</option> 
							 <option class="option" value="palghar">Palghar</option> 
							 <option class="option" value="parbhani">Parbhani</option> 
							 <option class="option" value="pune">Pune</option> 
							 <option class="option" value="raigad">Raigad</option> 
							 <option class="option" value="ratnagiri">Ratnagiri</option> 
							 <option class="option" value="sangli">Sangli</option> 
							 <option class="option" value="satara">Satara</option> 
							 <option class="option" value="sindhudurg">Sindhudurg</option> 
							 <option class="option" value="solapur">Solapur</option> 
							 <option class="option" value="thane">Thane</option> 
							 <option class="option" value="wardha">Wardha</option> 
							 <option class="option" value="washim">Washim</option> 
							 <option class="option" value="yavatmal">Yavatmal</option> 
						    
						</select>
						<span class="select-btn">
						  	<i class="zmdi zmdi-chevron-down"></i>
						</span>
					</div>
					
					<div class="form-row">
						<select name="end_city">
						    <option class="option" value="none">Select Ending District</option>
						    <option class="option" value="Ahmednagar">Ahmednagar</option>
							<option class="option" value="Akola">Akola</option>
							 <option class="option" value="amravati">Amravati</option> 
							 <option class="option" value="aurangabad">Aurangabad</option> 
							 <option class="option" value="beed">Beed</option> 
							 <option class="option" value="bhandara">Bhandara</option> 
							 <option class="option" value="buldana">Buldana</option> 
							 <option class="option" value="chandrapur">Chandrapur</option> 
							 <option class="option" value="dhule">Dhule</option> 
							 <option class="option" value="gadchiroli">Gadchiroli</option> 
							 <option class="option" value="gondia">Gondia</option> 
							 <option class="option" value="hingoli">Hingoli</option> 
							 <option class="option" value="jalgaon">Jalgaon</option> 
							 <option class="option" value="jalna">Jalna</option> 
							 <option class="option" value="kolhapur">Kolhapur</option> 
							 <option class="option" value="latur">Latur</option> 
							 <option class="option" value="mumbai city">Mumbai City</option> 
							 <option class="option" value="mumbai suburban">Mumbai Suburban</option> 
							 <option class="option" value="nagpur">Nagpur</option> 
							 <option class="option" value="nanded">Nanded</option> 
							 <option class="option" value="nandurbar">Nandurbar</option> 
							 <option class="option" value="nashik">Nashik</option> 
							 <option class="option" value="osmanabad">Osmanabad</option> 
							 <option class="option" value="palghar">Palghar</option> 
							 <option class="option" value="parbhani">Parbhani</option> 
							 <option class="option" value="pune">Pune</option> 
							 <option class="option" value="raigad">Raigad</option> 
							 <option class="option" value="ratnagiri">Ratnagiri</option> 
							 <option class="option" value="sangli">Sangli</option> 
							 <option class="option" value="satara">Satara</option> 
							 <option class="option" value="sindhudurg">Sindhudurg</option> 
							 <option class="option" value="solapur">Solapur</option> 
							 <option class="option" value="thane">Thane</option> 
							 <option class="option" value="wardha">Wardha</option> 
							 <option class="option" value="washim">Washim</option> 
							 <option class="option" value="yavatmal">Yavatmal</option> 
						</select>
						<span class="select-btn">
						  	<i class="zmdi zmdi-chevron-down"></i>
						</span>
					</div>
					
					<div class="form-row">
						<input type="text"  name="cont" class="company" id="cont" placeholder="Contact Number" required>
					</div>
					<div class="form-group">
						<div class="form-row form-row-3">
							<p class="input-text">Start  Date </p>
							<input type="date" name="start_date" class="start_date" id="start_date" placeholder="start_date" required>
						</div>
						
						<div class="form-row form-row-4">
							<p class="input-text form-row-5">End  Date </p>
							<input type="date" name="end_date" class="end_date" id="end_date" placeholder="end_date" required>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row form-row-3">
							<select name="reason">
								<option value="none">Reason Of Traveling</option>
							    <option value="Death of First Relative">Death of First Relative</option>
								<option value="Extreme medical emergency">Extreme medical emergency</option>
								<option value="Stranded Student">Stranded Student</option>
								<option value="Stranded Individual">Stranded Individual</option>
								<option value="Extreme emergency case/issue">Extreme emergency case/issue</option>
							</select>
							<span class="select-btn">
							  	<i class="zmdi zmdi-chevron-down"></i>
							</span>
						</div>
					</div>
					
					<div class="form-group">
							
						<div class="form-row form-row-5">
							<textarea rows="5" cols="45" name= "exp_reason" placeholder="Explain" class="" required></textarea>
						</div>
					</div>
				
				<div class="form-group">
							
						<div class="form-row form-row-5">
				Attach Your Photo :<input type="file" name="avatar"/><br/>
						</div>
				</div>
			</div>
				
				
				
				<div class="form-right">
					<h2>Other Details</h2>
					<div class="form-row">
						<input type="text" name="current_addr" class="street" id="street" placeholder="Current Addrress " required>
					</div>
					<div class="form-row">
						<input type="text" name="addr_dest" class="additional" id="addr_dest" placeholder="Address Of Destination" required>
					</div>
					
					
					<div class="form-group">
						<div class="form-row form-row-1">
							<input type="text" name="vehicle_no" class="zip" id="vehicle_no" placeholder="Vehicle No" required>
						</div>
						<div class="form-row form-row-2">
							<select name="vehicle">
								<option value="none">Select Vehicle Type</option>
							    <option value="Train">Train</option>
							    <option value="Public Bus">Public Bus</option>
							    <option value="Private Bus">Private Bus</option>
							    <option value="Private 4 Wheeler (5 Seater)">Private 4 Wheeler (5 Seater)</option>
							    <option value="Private 4 Wheeler (7 Seater)">Private 4 Wheeler (7 Seater)</option>
							    <option value="Private Vehicle (2 Wheeler)">Private Vehicle (2 Wheeler)</option>
							    <option value="Truck/Lorry">Truck/Lorry</option>
							    <option value="Tracktor">Tracktor</option>
								<option value="Taxi/Cab/Rickshaw">Taxi/Cab/Rickshaw</option>
								<option value="Other">Other</option>
							</select>
							<span class="select-btn">
							  	<i class="zmdi zmdi-chevron-down"></i>
							</span>
						</div>
					</div>
					<div class="form-row">
						<select name="contaminated_zone">
						    <option value="none">Are you from contaminated zone ?</option>
						    <option value="yes">Yes</option>
						    <option value="no">No</option>
						</select>
						<span class="select-btn">
						  	<i class="zmdi zmdi-chevron-down"></i>
						</span>
					</div>
					
						<div class="form-row">
							<input type="number" name="trav_cnt" class="phone" id="trav_cnt" placeholder="Number of fellow travelers ?" required>
						</div>
					
					<div class="form-row">
						<input type="text" name="your_email" id="your_email" class="input-text" required pattern="[^@]+@[^@]+.[a-zA-Z]{2,6}" placeholder="Your Email">
					</div>
					
					
					
					<div class="form-row" style="color:white">
					 Attach Valid Organization Document/Medical Report/Company ID/Aadhaar card etc: <br/><input type="file" name="adhar" placeholder="" /><br/>
					</div>
					<div class="form-row" style="color:white">
					Attach Doctor Certificate:<br/><input type="file" name="doct_cert"/><br/>
					</div>
					
					
					
					
					
					
					<div class="form-checkbox">
						<label class="container"><p><b>All information mentioned above is true as per my knowledge of your site.</b></p>
						  	<input type="checkbox" name="checkbox">
						  	<span class="checkmark"></span>
						</label>
					</div>
					
					
					
			
					<div class="form-row-last">
						<input type="submit" name="register" class="register" value="Apply For E-Pass">
					</div>
					
					
					

					
				</div>
				
				
				
					
				
				
				
				
			</form>
		</div>
	</div>
</body>
</html>