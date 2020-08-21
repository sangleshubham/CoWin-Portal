
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

div {
  word-wrap: break-word;
}

body{
    background: -webkit-linear-gradient(left, #3931af, #00c6ff);
}
.emp-profile{
    padding: 3%;
    margin-top: 3%;
    margin-bottom: 3%;
    border-radius: 0.5rem;
    background: #fff;
}
.profile-img{
    text-align: center;
}
.profile-img img{
    width: 70%;
    height: 100%;
}
.profile-img .file {
    position: relative;
    overflow: hidden;
    margin-top: -20%;
    width: 70%;
    border: none;
    border-radius: 0;
    font-size: 15px;
    background: #212529b8;
}
.profile-img .file input {
    position: absolute;
    opacity: 0;
    right: 0;
    top: 0;
}
.profile-head h5{
    color: #333;
}
.profile-head h6{
    color: #0062cc;
}
.profile-edit-btn{
    border: none;
    border-radius: 1.5rem;
    width: 70%;
    padding: 2%;
    font-weight: 600;
    color: #6c757d;
    cursor: pointer;
}
.proile-rating{
    font-size: 12px;
    color: #818182;
    margin-top: 5%;
}
.proile-rating span{
    color: #495057;
    font-size: 15px;
    font-weight: 600;
}
.profile-head .nav-tabs{
    margin-bottom:5%;
}
.profile-head .nav-tabs .nav-link{
    font-weight:600;
    border: none;
}
.profile-head .nav-tabs .nav-link.active{
    border: none;
    border-bottom:2px solid #0062cc;
}
.profile-work{
    padding: 14%;
    margin-top: -15%;
}
.profile-work p{
    font-size: 12px;
    color: #818182;
    font-weight: 600;
    margin-top: 10%;
}
.profile-work a{
    text-decoration: none;
    color: #495057;
    font-weight: 600;
    font-size: 14px;
}
.profile-work ul{
    list-style: none;
}
.profile-tab label{
    font-weight: 600;
}
.profile-tab p{
    font-weight: 600;
    color: #0062cc;
}








.thumb {
    height: 200px;
    width: 250px;
}







//model zoom images

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 200%; /* Full height */
  overflow: visible; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  -webkit-animation-name: fadeIn; /* Fade in the background */
  -webkit-animation-duration: 0.4s;
  animation-name: fadeIn;
  animation-duration: 0.4s
}

/* Modal Content */
.modal-content {
 overflow: auto;
  position: fixed;
  bottom: 0;
  background-color: #fefefe;
  width: 100%;
  -webkit-animation-name: slideIn;
  -webkit-animation-duration: 0.4s;
  animation-name: slideIn;
  animation-duration: 0.4s
}

/* The Close Button */
.close {
  color: white;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}

.modal-header {
  padding: 2px 16px;

  color: white;
}

.modal-body {padding: 2px 16px;}

.modal-footer {
  padding: 2px 16px;

  color: white;
}

/* Add Animation */
@-webkit-keyframes slideIn {
  from {bottom: -300px; opacity: 0} 
  to {bottom: 0; opacity: 1}
}

@keyframes slideIn {
  from {bottom: -300px; opacity: 0}
  to {bottom: 0; opacity: 1}
}

@-webkit-keyframes fadeIn {
  from {opacity: 0} 
  to {opacity: 1}
}

@keyframes fadeIn {
  from {opacity: 0} 
  to {opacity: 1}
}








</style>

</head>
<body>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container emp-profile">
            
                <div class="row">
                    <div class="col-md-4">
                        <div class="profile-img">
                            <img src="show_images" alt=""  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="profile-head">
                                    <h5>
                                       <%  out.print( request.getAttribute("f_name").toString());  out.print("  ")  ;out.print( request.getAttribute("l_name").toString()); %>
                                    </h5>
                                    <h6>
                                        <% 	 out.print( request.getAttribute("veh_type").toString()); %>
                                    </h6>
                                    <p class="proile-rating">Contaminated Zone : <%  out.print( request.getAttribute("contaminate_zom").toString()); %><span>
										
									</span></p>
                            <ul class="nav nav-tabs" id="myTab" role="tablist">
                                <li class="nav-item">
                                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Details</a>
                                </li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-md-2">
                    <form method="post" action="accept">
                        <input type="submit" class="profile-edit-btn" name="acc" value="Accept Form"/>
                        <br/><br/>
                    </form>	
                    <form method="post" action="reject">
                        <input type="submit" class="profile-edit-btn" name="reg" value="Reject Form"/>
                    </form>		
                    </div>
                    
                    
                </div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="profile-work">
                            
                          

							<button id="myBtn" onclick="exe1()">Show Document</button>
							

								<!-- The Modal -->
								<div id="myModal" class="modal">
								
								  <!-- Modal content -->
								  <div class="modal-content">
								    <div class="modal-header">
								      <span class="close">&times;</span>
								      
								    </div>
								<img src="show_adhar" style="position:fixed; width: 40%;height: 100%;top:0px;"/>
								<img src="show_md" style="position: fixed; top: 50px;right: 20px; width: 40%;height: 80%%;"/>
									
								
								    <div class="modal-footer">
								      <h3>Modal Footer</h3>
								    </div>
								  </div>
								
								</div>
							                          
                          
                          	
                          
                  
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                          
                            
                        </div>
                    </div>
                    <div class="col-md-8">
                        <div class="tab-content profile-tab" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Start City</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("start_city").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                       <div class="row">
                                            <div class="col-md-6">
                                                <label>End City</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("end_city").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                        
                                        
                                        
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Name</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("f_name").toString());  out.print("  ")  ;out.print( request.getAttribute("l_name").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                        
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Email</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p>
														<%  out.print( request.getAttribute("email").toString()); %>
												</p>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Phone</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p>   <%  out.print( request.getAttribute("contact").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                      <div class="row">
                                            <div class="col-md-6">
                                                <label>Start Date</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("start_date").toString()); %></p>
                                            </div>
                                        </div> 
                                         
                                         <div class="row">
                                            <div class="col-md-6">
                                                <label>End Date</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("end_date").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Current Address</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("curr_add").toString()); %></p>
                                            </div>
                                        </div>
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Destination Address</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("dest_addr").toString()); %></p>
                                            </div>
                                        </div>                                        

                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Vehical Number</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("veh_no").toString()); %></p>
                                            </div>
                                        </div>   

                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Reason</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("reason").toString()); %></p>
                                            </div>
                                        </div>     
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Reason Explanation</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("exp_reason").toString()); %></p>
                                            </div>
                                        </div>  
                                        
                                        <div class="row">
                                            <div class="col-md-6">
                                                <label>Contaminate Zone</label>
                                            </div>
                                            <div class="col-md-6">
                                                <p><%  out.print( request.getAttribute("contaminate_zom").toString()); %></p>
                                            </div>
                                        </div>                                        
                                        
                                        
                            </div>
                            
                        </div>
                    </div>
                </div>
                       
        </div>
	
	
	
	
	<script>

	function exe1(){
		// Get the modal
		var modal = document.getElementById("myModal");

		// Get the button that opens the modal
		var btn = document.getElementById("myBtn");

		// Get the <span> element that closes the modal
		var span = document.getElementsByClassName("close")[0];

		// When the user clicks the button, open the modal 
		btn.onclick = function() {
		  modal.style.display = "block";
		}

		// When the user clicks on <span> (x), close the modal
		span.onclick = function() {
		  modal.style.display = "none";
		}

		// When the user clicks anywhere outside of the modal, close it
		window.onclick = function(event) {
		  if (event.target == modal) {
		    modal.style.display = "none";
		  }
		}
			
	}
	
	
	
	
	</script>
	
	
	

</body>
</html>