#include<iostream>
using namespace std;
int fun(int a[],int n,int k)
{
    int i=0,j=n-1;
    int c=0;
    while(i<j)
    {
        if(a[i]*a[j]<=k)
        {
            c+= (j-i);
            i++;
        }
        else
        j--;
    }
    return c;
}
int main(){
    int a[6]={1,2,3,4,5,6};
    cout<<fun(a,6,5)<<endl;
    return 0;
}