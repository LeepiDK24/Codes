#include<stdio.h> 
int main() 
{ 
  int a,b,c; 
  printf("Enter 1st num:"); 
  scanf("%d",&a); 
  printf("Enter 2nd num:"); 
  scanf("%d",&b); 
  printf("Enter 3rd num:"); 
  scanf("%d",&c); 
  if((a+b)>c) 
  { 
    printf("They are sides of triangle"); 
  } 
  else 
  { 
   printf("They are not sides of triangle"); 
  } 
  return 0; 
   
  }