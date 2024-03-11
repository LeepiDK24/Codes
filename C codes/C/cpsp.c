#include<stdio.h> 
int main() 
{ 
  float cp,sp; 
  printf("Enter the cost price: "); 
  scanf("%f",&cp); 
  printf("Enter the selling price: "); 
  scanf("%f",&sp); 
  if(sp>cp) 
  { 
    printf("Profit:%f\n",sp-cp); 
    printf("Profit percent:%f\n",((sp-cp)/cp)*100); 
    } 
  if(sp<cp) 
  { 
    printf("Loss:%f\n",cp-sp); 
    printf("Loss Percent:%f\n",((cp-sp)/cp)*100); 
  } 
  return 0; 
   
  }