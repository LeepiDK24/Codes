#include<stdio.h> 
int main() 
{ 
 int n,t,i;
 printf("Enter n \n");
 scanf("%d",&n);
 for(i=1;i<n;i++)
 {
if(n%i==0) t=i;
 } printf("%d",t);
 }
