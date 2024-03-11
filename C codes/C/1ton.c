#include<stdio.h> 
void display(int x,int n)
{
    if(x>n) return;
    printf("%d\n",x);
    display(x+1,n);
}

int main() 
{ 
 int x,n;
 printf("Enter n \n");
 scanf("%d",&n);
 display(x+1,n);
 return 0;
 }