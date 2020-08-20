
void setup() {
  size (500, 500);
PImage face = loadImage ("face.jpg");
face.resize (width, height);
image (face, 0, 0);
}
void draw() {
  fill (mouseX, mouseY, mouseX - mouseY);
  ellipse (215, 198, 75, 75);  
  ellipse (290, 198, 75, 75);
  fill (0);
  ellipse (215, 200, 40, 40);
  ellipse (290, 200, 40, 40);
}
