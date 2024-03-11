#include<stdio.h> 
int power(int a,int b,int m)
{   
    if(b==0) return 1;
    return (a%m * power(a,b-1,m))%m;
}

int main() 
{   
    int a,b,m;
    printf("Enter a \n");
    scanf("%d",&a);
    printf("Enter b \n");
    scanf("%d",&b);
    printf("Enter m \n");
    scanf("%d",&m);
    int res = power(a,b,m);
    printf("%d",&res);
    return 0;
 
 }