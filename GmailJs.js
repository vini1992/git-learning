function validate() {
var txt = document.getElementById("email");
var pas=document.getElementById("password");
if(txt.value== "" || txt.value== null) {
alert("Please enter your email");
txt.style.border = "2px solid red";
return false;
}
else
 {
txt.style.border = "";
}
 
 if(pas.value== "" || pas.value== null)
 {
    alert("Please enter your password");
	pas.style.border = "2px solid red";
	return false;
 }
else if(pas.value.length<8)
	{
	 alert("enter mininmum 8 character");
    pas.style.border = "2px solid red";
    return false;
	}

 else
 {
  pas.style.border = "";
 }

}