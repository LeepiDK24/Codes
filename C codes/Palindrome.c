#include<stdio.h>
#include<string.h>
int main()
{
    int n,i,temp;
    char str[100];
    printf("Enter the string\n");
    gets(str);
    n=strlen(str);
    for(i=0;i<(n-1)/2;i++)
    {
      if(str[i]=str[n-i-1]) temp=1;
      else temp=0;
    }
if(temp==1) printf("Palindrome");
else printf("Not a palindrome");
}