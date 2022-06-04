let root = document.getElementById("root");
$(document).ready(function(){
  $("#root").click(function(){ 
    if(root.value === "on"){
      root.value="off";
    }
    else{
      root.value="on";
    }
  });
 })


