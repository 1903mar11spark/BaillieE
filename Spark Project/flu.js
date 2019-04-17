
    window.onload = function(){

    let trump = "https://api.whatdoestrumpthink.com/api/v1/quotes/random";

     //Magic
     let tweet = {
         message:''
     }
     
     let updateContent1 = function(){
         let fail = tweet.message;
         document.getElementById("potus").innerHTML=fail;
     }
     
         fetch(trump, {method: "GET", headers: {"Accept":"application/json"}})
         .then((response) => {
             return response.json();
         })
         .then((data) => {
             console.log(data);
             tweet.message = data.message;
             updateContent1();
         })
     
         .catch((error) =>{
             console.log(error);
         })
     }
    
