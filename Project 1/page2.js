window.onload = function(){
   document.getElementById("crew").addEventListener('click', getSort);
   
};


//Magic Shelter
const apiUrl1 ="https://www.potterapi.com/v1/sortingHat";

let state1 = {
    sortingHat:''
}

let updateContent1 = function(){
    let house = state1.sortingHat;
    let cat = house.toUpperCase();
    document.getElementById("sort").innerHTML=cat;
}

function getSort() {
    fetch(apiUrl1, {method: "GET", headers: {"Accept":"application/json"}})
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
        state1.sortingHat = data;
        updateContent1();
        shelter();
    })

    .catch((error) =>{
        console.log(error);
    })
}

//TO ADD IMAGES 

function shelter(){
    let mouse = state1.sortingHat;
    let go = document.createElement("img");
    let div = document.getElementById("imageHere");
    let info = document.getElementById("infoHere");
    
    if(mouse=="Gryffindor"){
        go.src = "src/griff.png";
        div.appendChild(go);
        info.textContent += "Your shelter location is in Gryffindor - Welcome! Please proceed to the orange hallway where an individual will escort you to your bunk.";
    } else if(mouse=="Hufflepuff"){
        go.src = "src/huff.png";
        div.appendChild(go);
        info.textContent += "Welcome your shelter location is Hufflepuff, you will proceed to the yellow doorway to recieve your bunking information.";
    } else if(mouse=="Slytherin"){
        go.src = "src/slyn.png";
        div.appendChild(go);
        info.textContent += "Slytherin is your shelter location. Salutations, please proceed to the green awning to be escorted to your new quarters.";
    } else {
        go.src = "src/raven.png";
        div.appendChild(go);;
        info.textContent += "Greetings, your shelter location is with Ravenclaw. You will proceed to the blue corridor for further instructions regarding your bunk.";
    }
   
 }










