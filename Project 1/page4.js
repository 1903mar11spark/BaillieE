



window.onload = function(){
  
        let aUrl = "http://api.dataatwork.org/v1/jobs?limit=24"
        let myOtherList = document.getElementById('otherList')
        fetch(aUrl, {method: "GET", headers: {"Accept":"application/json"}})

            .then(function(response) {
                return response.json();
            })
            .then(function(data){
                console.log(data);
                for(var i = 0; i < data.length; i++) {
                    var listItem = document.createElement('li');
                    listItem.innerHTML = '<strong>' + data[i].title + '</strong>';
                    myOtherList.appendChild(listItem);
                }   
            })

    document.getElementById('btn').addEventListener('click', function(){
          let code = parseFloat(document.getElementById("code").value);
    
          let sick = 'https://api.fda.gov/food/event.json?search=products.industry_code:"'+code+'"&limit=10';
          
          let myList = document.getElementById('list');
        
  
      //The Document method querySelector() returns the first Element within the document that matches the specified selector, or group of selectors. If no matches are found, null is returned.
  
      //Sickness Around
  
      fetch(sick, {method: "GET", headers: {"Accept":"application/json"}})
  
         .then(function(response) {
             if (!response.ok) {
                 throw new Error("HTTP error, status= " + response.status + alert("There are no rations left with that number. Please indicate another number or one within range."))
             }
             //The ok read-only property of the Response interface contains a Boolean stating whether the response was successful (status in the range 200-299) or not.
             return response.json();
         })
      
  
         .then(function(json) {
              console.log(json);  
              for(let i = 0; i < json.results.length; i++) {
                  for (let j = 0; j < json.results[i].products.length; j++){
                    let listItem = document.createElement('li');
                    listItem.innerHTML = '<strong>' + json.results[i].products[j].name_brand + '</strong>';
                  myList.appendChild(listItem);
                  }
              }
         })
    
          .catch((error) =>{
              console.log(error);
          })


        })

        
    }
          