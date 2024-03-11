#include<stdio.h> 
int main() 
{ 
  int per; 
  printf("Enter percentage: "); 
  scanf("%d",&per); 
  if(per>=81) 
  { 
  if(per<=100) 
  { 
    printf("Very Good"); 
  }  
} 
  else if(per>=61)  
  { 
   if(per<=80) 
  { 
   printf("Good"); 
  } 
} 
  else if(per>=41)  
  { 
   if(per<=60) 
  { 
   printf("Average"); 
  } 
} 
  else if(per>=0)  
  { 
   if(per<=40) 
  { 
   printf("Fail"); 
  } 
} 
  else 
  { 
   printf("Invalid Input"); 
  } 
   
  return 0; 
   
  }