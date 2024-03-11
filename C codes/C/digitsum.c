//ye glt h need to work
#include<stdio.h> 
int sum(int n)
{ 
  int x=n;
  if(x!=0)  return x%10 + sum(n/10);
  else   return n;
  return 0 ;
}

int main() 
{ 
 int n;
 printf("Enter n \n");
 scanf("%d",&n);
 int res = sum(n);
 printf("%d",&res);
 return 0;
 }