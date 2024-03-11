#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  int n,check,i,precount,postcount;
  printf("Enter a pattern\n");
  gets(a);
  n=strlen(a);
  
  for(i<0;i<n/2;i++)
  {
    if(a[i]=='a')
    postcount++;
  }
  for(i<0;i<n/2;i--)
  {
    if(a[i]=='a')
    precount++;
  }
  int b_middle()
  { 
    for(i=0;i<n;i++)
  {
    if(a[n/2]=='b') check++;
  }
    return 0;
  }
  int validation()
  {
     if(postcount==precount)
     check++;

  }
if(check==2)
printf("Valid pattern");
else
printf("Invlid pattern");
return 0;
}