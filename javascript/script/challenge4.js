var image;
var orgimage;
function upload() {
    //   get the canvas 
    var orgImgCanvas = document.getElementById("orgImageCan");
    //   get input from the text input
    var fileinput = document.getElementById("finput"); 
    orgimage = new SimpleImage(fileinput);
    image = new SimpleImage(fileinput);
    //   displaying image in canvas
    orgimage.drawTo(orgImgCanvas);
}

function makeGrey() {
    for (var pixel of image.values()) {
        var avg = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
        pixel.setRed(avg);
        pixel.setGreen(avg);
        pixel.setBlue(avg);
    }
    var greyImgCanvas = document.getElementById("greyImgCan");
    image.drawTo(greyImgCanvas);
}