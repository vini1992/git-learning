<html>
<head>
<script>
function valid()
{
   var variable=document.getElementById("first");
   var pasw=document.getElementById("pasw");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter first name");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }
   
   variable=document.getElementById("last");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter last name");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }
   
    variable=document.getElementById("uname");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter user name");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }
   
   variable=document.getElementById("pas");
   
   if(variable.value=="" || variable.value==null)
   {
     alert("enter password");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else if(variable.value.length<8)
	  { alert("enter minimum 8 character");
     variable.style.border = "2px solid red";	 
	 return false;
	 }
   	 
   else
   {
      variable.style.border = "";
   }
   
   if(pasw.value=="" || pasw.value==null)
   {
     alert("Reenter password");
     pasw.style.border = "2px solid red";	 
	 return false;
   }
   else if(variable.value!=pasw.value)
   {
     alert("password not matched");
	 pasw.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
      pasw.style.border = "";
   }
   
     var e = document.getElementById("select");
    var s = e.options[e.selectedIndex].value;
    if(s==0)
	{
	  alert("please select Month");
	  e.style.border = "2px solid red";	
	  return false;
	}
    else
     {
       e.style.border = "";
     }	   
	  variable=document.getElementById("day");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter day");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }
   
   variable=document.getElementById("year");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter year");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }
   
   if(document.getElementById("m").checked==true)
      variable.style.border = "";
   else if(document.getElementById("f").checked==true)
         variable.style.border = "";
		 else
		 {
		     alert("select Gender");
             variable.style.border = "2px solid red";	 
	         return false; 
	      }

   variable=document.getElementById("mob");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter mobile number");
     variable.style.border = "2px solid red";	 
	 return false;
   }
    else if(variable.value.length<10 || variable.value.length>10)
   {
      alert("enter correct mobile number");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else if(!(variable.value.charAt(0)=="9" || variable.value.charAt(0)=="8" || variable.value.charAt(0)=="7"))
       {
            alert("Mobile No. should start with 9 ,8 or 7 ");
             variable.style.border = "2px solid red";
            return false;
       }
   else
   {
   variable.style.border = "";
   }
   
  /* variable=document.getElementById("c_email");
   if(variable.value== "" || variable.value== null)
   {
     alert("enter current email");
     variable.style.border = "2px solid red";	 
	 return false;
   }
   else
   {
   variable.style.border = "";
   }*/
   var e=document.getElementById("c_email");
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

    if (!filter.test(e.value))
	{
    alert('Please provide a valid email address');
    e.style.border = "2px solid red";	
    return false;
	}
	else
	{
	 e.style.border = "";
    }	 
 
   
   
 }
</script>
<style>

#header
{
  background-color:lavender;
  padding:10px;
} 
#cen
{
   background-color:White;
   padding:10px;
}
#Right
{
  
   width:430px;
   height:530px;
    float:left;
    padding:10px;	
  background-color:lavender;
 	      
}
#left
{
    line-height:30px;
    background-color:white;
    height:540px;
    width:450px;
    float:left;
    padding:5px;
}
#Footer {
    background-color:white;
    color:white;
    clear:both;
    text-align:center;
   padding:40px;	 	 
}
#Footer1 {
    background-color:lavender;
    color:white;
    clear:both;
    text-align:center;
   padding:40px;	 	 
}
input
{
 border-radius:5px;
 outline: 2px solid #e8e8e8;
 }
select option[default]
{
 border-radius:5px;
 outline: 5px solid #e8e8e8;
 color:gray;
}
 }
 }
</style>
</head>

<body>
<div id="header"><h1 style="color:cornflowerblue;">Google
<input type="Submit" value="Sign in" id="submit" style="width:100px; height:30px; color:white; background-color:cornflowerblue; float:right;" onClick="window.location.href='file:///C:/Users/Vinita/Desktop/mylocalrepo/Gmail.html'"></h1>
</div>
<div id="cen"><center><h1 style="color:cadetblue;">Create your Google Acount</h1></center>
</div>

<div id="left"><br><br><br><br><br><br><center><h2 style="color:cadetblue;">One account is all you need.</h2></center>
<center><h4 style="color:cadetblue;">One username and password gets you into everything in google.</h4></center><br>
<center><img src="gmail.png"></img><img src="googleplus.png"></img><img src="custom_google_maps.png"></img></center>
</div>
<div id="Right">
<form action="wellcome.php" method="get" onsubmit="return valid()">
<br>
Name<br><input type="text" name="first" id="first" style="width:200px; height:35px;" placeholder="First"/>
<input type="text" name="last" id="last" style="width:200px; height:35px;" placeholder="Last"/><br>

Choose your username<br><input type="text" name="uname" id="uname" placeholder="UserName" style="width:200px; height:35px"/><br>


Create a password<br><input type="text" id="pas" style="width:200px; height:35px;" placeholder="at least 8 character"/><br>

Renter password<br><input type="text" id="pasw" style="width:200px; height:35px;" placeholder="enter again same password"/><br>
Birthday<br>
<select name="MM" id="select" style="width:200px; height:35px;">
<option value="0">Month</option>
<option value="january" >january</option>
<option value="feburary">feburary</option>
<option value="march">march</option>
<option value="april">april</option>
<option value="may">may</option>
<option value="june">june</option>
<option value="july">july</option>
<option value="august">8</option>
<option value="september">september</option>
<option value="october">october</option>
<option value="november">november</option>
<option value="december">december</option>
</select>
<input type="text" name="day" id="day" style="width:100px; height:35px"placeholder="Day">
<input type="text" name="year" id="year" style="width:100px; height:35px" placeholder="Year"><br>
Gender<br><input type="radio" name="sex" value="male" id="m">male
<input type="radio" name="sex" value="female" id="f">female
<br>
Mobile numberbr<br><input type="text" id="mob" style="width:200px; height:35px" placeholder="+91"><br>
Enter your current email address<br><input type="text" id="c_email" style="width:300px; height:35px" placeholder="current email">
<br><br><br>
<center><input type="Submit" value="Create Account" id="submit" style="width:120px; height:30px; color:white; background-color:cornflowerblue;" ><center><br>

 

</form>
</div>
<div id="Footer"></div>
<div id="Footer1"></div>
</body>
</html>