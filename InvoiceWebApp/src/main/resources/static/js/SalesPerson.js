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

//function retrieveData(){
//    //Declare Variable
//    var table = document.getElementById("salesList");
//    for var(i=0, row; row=table.rows[i]; i++){
//
//    }
//}

//$('salesList tr').each(function(){
//    $(this).find('td:last-child').each(function(){
//    alert($(this).html());
//    })
//})

//function retrieveData(){
//    var table = document.getElementById("salesList").addEventListener("click");
//    var k = table.rows.length;
//    var l = table.rows[r].cells.length;
//    for var(i=0, i< k; i++){
//    for var(j =0, l<j; j++){
//    alert(table.cells[L].innerHTML);
//    }
//    }
//}

$('sList').click(function(){
    $('.selected').removeClass('selected');
    $(this).addClass('selected');
})
$('#verify').click(function(){
    $('.selected').childred().each(function()){
    alert($(this).innerHTML());
    }
})

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
