#include<stdio.h>
#include<string.h>
int main()
{   int i,count;
    char str[200];
    printf("Enter a string\n");
    gets(str);
    int n=strlen(str);
    for(i=0;i<n;i++)
    {
        if(str[i]==32)
        count++;
    }
    printf("No of spaces:%d\n",count);
    puts(str);
}