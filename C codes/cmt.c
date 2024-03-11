#include<stdio.h>
#include<string.h>
int main()
{
    int n,i,temp;
    char cmt[100];
    printf("Enter the comment");
    gets(cmt);
    n=strlen(cmt);

    for(i=0;i<n;i++){
        if(cmt[0]=='/'&& cmt[1]=='/'); 
            temp++;
            printf("Valid comment");
            break;
    }
     
     return 0;
}