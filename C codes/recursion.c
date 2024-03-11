#include<stdio.h>
void printfun(int n){
    int x=n;
    if(x==n) return ;
    printf("%d\n",x);
    printfun(x+1);
}
int main(){
    int n;
    printf("Enter n\n");
    scanf("%d\n",&n);
    printfun(n);
    return 0;
}