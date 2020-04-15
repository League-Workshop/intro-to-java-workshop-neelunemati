PImage rainbow;
PImage unicorn;


void setup() {
  rainbow = loadImage("rainbow.jpg");
size(800, 600);
rainbow.resize(width,height);
  
   unicorn = loadImage("unicorn.png");

   unicorn.resize(150,150);
}

void draw() {
  background(rainbow);
  //mouseX  mouseY
  //mousePressed
  
  if(!mousePressed){
    image(unicorn, mouseX-80,mouseY-80);
  }
  



}
