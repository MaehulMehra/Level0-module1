PImage pepperoni; 
PImage olive;
PImage mushroom;
void setup() {
size (500, 500);
fill (#B7BC85);
ellipse (250, 250, 400, 400);
fill (255, 0, 0);
ellipse (250, 250, 390, 390);
fill (#FAFF0A);
ellipse (250, 250, 370, 370);
pepperoni = loadImage ("pepperoni.png");
olive = loadImage ("olive.png");
mushroom = loadImage ("mushroom.png");
}
void draw() {
  if (mousePressed){
    image (pepperoni, 100, 100);
    image (pepperoni, 200, 100);
    image (pepperoni, 300, 100);
    image (olive, 100, 200);
    image (olive, 200, 200);
    image (olive, 300, 200);
  }
    if (mousePressed && (mouseButton == RIGHT)){
    image (mushroom, 100, 300);
    image (mushroom, 200, 300);
    image (mushroom, 300, 300);
    }
    
}
