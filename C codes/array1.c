#include<stdio.h>
void main()
{
  int i,t;
  int a[6]={1,2,3,4,5,6};
  t=a[5];
  for(i=5;i-1>=0;i--)
  {
    a[i]=a[i-1];
  }
  a[i]=t;
  for(i=0;i<6;i++)
  {
    printf("%d",a[i]);
  }
}
