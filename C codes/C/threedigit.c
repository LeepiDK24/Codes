#include<stdio.h> 
int main() 
{ 
  int n; 
  printf("Enter any integer: "); 
  scanf("%d",&n); 
  if(n>99 && n<1000) 
  { 
   printf("%d is a three digit number",n); 
  } 
  else if((n<100 || n>999) && n>=0) 
  { 
   printf("%d is a not a three digit number",n); 
  } 
  else if(n>-1000 && n<-99) 
  { 
   printf("%d is a three digit number",n); 
  } 
  else 
  { 
   printf("%d is not  a three digit number",n); 
  } 
   
  return 0; 
   
  }