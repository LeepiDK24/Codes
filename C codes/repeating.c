#include<stdio.h>
#include<string.h>
#include<stdbool.h>
int main()
{ 
  bool check;
  int i,n,flag,pos,nb;
  char a[100],b[100];
  printf("Enter a pattern\n");
  gets(a);
  n=strlen(a);
  for(i=0;i<n;i++)
  {
  if(a[i-1]==a[i])
  {
    pos=i;
    b[i]=a[i];
    break;
  }
  }
  nb=strlen(b);
for(i=0;i<n;i+=nb)
{
if(b[i]==a[nb]) check=1;
}
if(check==1)
printf("Valid pattern");
else 
printf("Invalid");
}