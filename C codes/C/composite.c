#include<stdio.h> 
int main() 
{ 
 int n,check=0;
 printf("Enter n \n");
 scanf("%d",&n);
 for(int i=2;i<=n-1;i++)
 {
if(n%i==0)
   {
   check=1;
   break;
   } 
 } if(check==1) printf("Composite\n");
   else printf("Prime\n");
   return 0;
}
