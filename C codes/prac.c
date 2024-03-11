#include<stdio.h>
#include<string.h>
int main()
{   
     int i,temp,flag;
    char str[200];
    char str2[10]="@gmail.com";
    printf("Enter mail\n");
    gets(str);
    int n=strlen(str);

    
     for(i=0;i<=n;i++)
    {
      strcmp(str,str2);
      temp=temp+1;
    }
     for(i=0;i<=n;i++)
     {
        if(temp>=10)
      { 
        printf("Valid Email");
        break;
      }
    } 
   
    for(i=0;i<=n;i++)
    {
        if(str[i]=='@') flag++;
        if(str[i]==',') flag++;
        if(str[i]=='.') flag++;
        if(str[i]=='.') flag++;
    
 if(flag>=2) 
 {
    printf("Invalid Email");
   break;
} 
    } return 0;
}


