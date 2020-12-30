var imageLoaded=null;
var imageCanvas;
var imageGray=null;
var imageRed=null;

function loadImageFile(){
  imageCanvas = document.getElementById("imgCanvas");
  var fileInput = document.getElementById("imgFile");
  imageLoaded = new SimpleImage(fileInput);
  imageLoaded.drawTo(imageCanvas);
  imageGray = imageLoaded;
  imageRed = imageLoaded;
}

function doImageGreyScale(){
  if(imageIsLoaded(imageGray)){
    filterGray();
    imageGray.drawTo(imageCanvas);
  }
}

function imageIsLoaded(image){
  if(image == null || !image.complete()){
    alert("Image is not loaded");
    return false;
  }else {
    return true;
  }
}

function filterGray(){
  for(var pixel of imageGray.values()){
    var avg = (pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
    pixel.setRed(avg);
    pixel.setGreen(avg);
    pixel.setBlue(avg);
  }
}

function doImageRed(){
  if(imageIsLoaded(imageRed)){
    makeImageRed();
    imageRed.drawTo(imageCanvas);
  }
}

function makeImageRed(){
  for(var pixel of imageRed.values()){
    var avg = (pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
    if(avg<128){
      pixel.setRed(2*avg);
      pixel.setGreen(0);
      pixel.setBlue(0);
    }else{
      pixel.setRed(255);
      pixel.setGreen((2*avg)-255);
      pixel.setBlue((2*avg)-255);
    }
  }
}