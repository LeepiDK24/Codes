#include<stdio.h> 
int main() 
{ 
  int a,b,c; 
  printf("Enter 1st side of triangle "); 
  scanf("%d",&a); 
  printf("Enter 2nd side of triangle "); 
  scanf("%d",&b); 
  printf("Enter 3rd side of triangle "); 
  scanf("%d",&c); 
  if((a*a)+(b*b)==(c*c) || (b*b)+(c*c)==(a*a) || (a*a)+(c*c)==(b*b)) 
  { 
    printf("It is a right angle triangle"); 
  } 
  else 
  { 
   printf("It is not a right angle triangle"); 
  } 
  return 0; 
   
  }