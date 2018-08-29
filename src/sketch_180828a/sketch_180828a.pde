void setup(){
  size(800,800);
}

void draw(){
for(int i=500;i>10;i-=100){
  if(i%2==0){
fill(#D61A1A);
}
if(i++%2==1){
fill(#F5F5FF);
ellipse(500,400,i,i);
}
ellipse(500,400,i,i);


}
}