#include<stdio.h> 
int main() 
{ 
  int x,y; 
  printf("Enter x co-ordinate: "); 
  scanf("%d",&x); 
  printf("Enter y co-ordinate: "); 
  scanf("%d",&y); 
  if(x>0 && y>0) 
  printf("1st Quadrant");
  if(x<0 && y>0) 
  printf("2nd Quadrant");
  if(x<0 && y<0) 
  printf("3rd Quadrant");
  if(x>0 && y<0) 
  printf("4th Quadrant");
}
  
  
  
