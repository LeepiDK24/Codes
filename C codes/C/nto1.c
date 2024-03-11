#include<stdio.h> 
void display(int a)
{
    if(a==0) return;
    printf("%d\n",a);
    display(a-1);
}

int main() 
{ 
 int n;
 printf("Enter n \n");
 scanf("%d",&n);
 display(n);
 return 0;
 }