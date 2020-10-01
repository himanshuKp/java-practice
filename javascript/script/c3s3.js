function changeColor(){
    var divElement1 = document.getElementById("div1");
    var divElement2 = document.getElementById("div2");
    divElement1.className="blueback"
   divElement2.className="orangeback";
  }
  
  function doRed(){
    var divElement1 = document.getElementById("div1");
    var divElement2 = document.getElementById("div2");
    divElement1.style.backgroundColor = "red";
    divElement2.style.backgroundColor = "red";
    
    var context = divElement1.getContext("2d");
    
    context.fillStyle = "yellow";
    context.fillRect(10,10,60,60);
    context.fillRect(80,10,60,60);
    
    context.fillStyle="black";
    context.font = "20px Arial";
    context.fillText("Hello",15,45);
  }
  
  function doBlue(){
    var divElement1 = document.getElementById("div1");
    var divElement2 = document.getElementById("div2");
    divElement1.style.backgroundColor = "blue";
    divElement2.style.backgroundColor = "blue";
    
    var context = divElement1.getContext("2d");
    
    context.clearRect(0,0,divElement1.width,divElement1.height);
  }