void setup(){
  size(800,800);
}
int x1 =0;
int x2= 800;






void draw(){
  background(#1521E8);
for(int i=500;i>10;i-=100){



ellipse(x1++,400,i,i);
ellipse(x2--,400,i,i);
}
}