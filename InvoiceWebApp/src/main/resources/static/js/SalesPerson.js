/**
 * 
 */

function searchFunction() {
    // Declaring variables
    var input, filter, ul, li, a, i;
    input = document.getElementById('searchEmp');
    filter = input.value.toUpperCase();
    ul = document.getElementById("empList");
    li = ul.getElementsByTagName('li');
    // Looping through all list items, and hide those which don't match!
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";
        }
    }
}



var modal = document.getElementById('popupModal');
var emp = document.getElementById("employerList");
var span = document.getElementsByClassName("close")[0];
emp.onclick = function() {
    modal.style.display = "block";
}
span.onclick = function() {
    modal.style.display = "none";
}
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
