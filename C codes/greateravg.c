#include <stdio.h>

int main() 
{
    int tc,a,b,c,avg;
    scanf("%d\n",&tc);
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    avg=(a+b)/2;
    for(int i=0;i<=tc;i++)
    {
    if(avg>c)
    {
        printf("YES\n");
    }
    else 
    {
        printf("NO");}
    }
      return 0;
}

  
