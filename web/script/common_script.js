/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


        function redirectTo(url) {
        window.location = url;
        }

function submit(id){
document.getElementById(id).submit();
}

function changeStatus(element){
var value = element.value;
        if (value === "Start"){
element.innnerHTML = "Stop";
        } else {
element.innnerHTML = "Start";
        }
}

function submitSignupForm(signupForm){
var password = document.getElementById("password").value;
        var cnfPassword = document.getElementById("cnfpassword").value;
        if (password === cnfPassword){
document.getElementsById(signupForm).submit();
        } else {
alert("Password and Confirm password shoould be same");
        }
}

function submitImage(){
var uploadBox = document.getElementById("uploadImage");
        if (document.getElementById("uploadImageInput").value !== "") {
        uploadBox.submit();
        //window.open('', '_self', ''); window.close();
        }
}

 function goBack() {
                window.history.back();
            }
            
            
            