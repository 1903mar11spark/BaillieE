


//FOR EMERGENCY ALERT
  setTimeout(function() { alert("NATIONAL EMERGENCY IN EFFECT"); }, 3000);


function myFlip(){
  document.getElementById("here").style.background = "red";
}

//FOR MODAL
function theModal(){
// Get the modal
let modal = document.getElementById('myModal');

// Get the button that opens the modal
let btn = document.getElementById("divModal");

// Get the <span> element that closes the modal
let span = document.getElementsByClassName("close")[0];

// When the user clicks the button, open the modal 
btn.onmousemove = function() {
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

//FOR TAKE MY CHANCES EVENT
function clickB1(event){
  let chances = Math.random();
  alert("Your chances of survival without the aid of the US Government are: " +chances*30+"%");
}

//FOR SURVIVAL GUIDE OR ZOMBS
window.onload = function (){
  document.getElementById("enter").addEventListener('click', enterPage)
}

function enterPage(){
      let age = parseFloat(document.getElementById("age").value);
      let party = parseFloat(document.getElementById("party").value);
      if((10 < age && age < 60) && (0 <= party && party < 5)){
          location.href = "page2.html";
          } else {
          location.href = "zombie.html";
          }
}

      
  