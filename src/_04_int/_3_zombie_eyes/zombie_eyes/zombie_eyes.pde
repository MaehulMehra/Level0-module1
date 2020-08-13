
void setup() {
  size (500, 500);
PImage face = loadImage ("face.jpg");
face.resize (width, height);
image (face, 0, 0);
}
void draw() {
  ellipse (215, 198, 75, 75);  

}
