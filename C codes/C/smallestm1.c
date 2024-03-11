#include<stdio.h> 
int main() 
{ 
  int a,b,c; 
  printf("Enter 1st number "); 
  scanf("%d",&a); 
  printf("Enter 2nd number "); 
  scanf("%d",&b); 
  printf("Enter 3rd number "); 
  scanf("%d",&c); 
  if(a<=b && a<=c) 
  { 
    printf("%d is least",a); 
  } 
  else if(b<=a && b<=c) 
  { 
   printf("%d is least",b); 
  } 
  else 
  { 
   printf("%d is least",c); 
  } 
   
  return 0; 
   
  }