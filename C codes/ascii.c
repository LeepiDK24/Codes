#include<stdio.h> 
int main() 
{
char ch;
int i;
for(i=65,ch='A';i<91;i++,ch++)
{
    printf("%c=%d\n",ch,i);
}
return 0;
}