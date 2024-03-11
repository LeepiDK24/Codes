#include<stdio.h> 
int main() 
{ int n;
int a=1,r=2;      // 1 2 4 8 ....
 printf("Enter n \n");
 scanf("%d",&n);
  for(int i=1;i<=n;i++){
  printf("%d\n",a);
  a=a*r;
  }
  return 0;
}