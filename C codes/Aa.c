#include<stdio.h>
#include<string.h>
int main()
{
    int n,i,count;
    char str[100];
    printf("Enter the string\n");
    gets(str);
    n=strlen(str);

    for(i=0;i<n;i++){
        if(str[i]=='a'|| str[i]=='A') // this is a comment 
        count++;
    }

    printf("Total no of a/A is %d",count);
    return 0;
}