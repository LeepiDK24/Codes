#include<stdio.h>
int main()
{  int i;
   int a[5];
   printf("Enter array elements\n");
   for(i=0;i<5;i++)
   {
     scanf("%d",a[i]);
   }
    for(i=0;i<5;i++)
   {
     printf("The elements are  %d  ",a[i]);
   }
}