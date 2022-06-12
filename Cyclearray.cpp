#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<" VALUE : ";
    cin>>n;
    int *a=new int[n];
    cout<<"Enter "<<n<<" values : ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int tem=a[0];
    for(int i=0;i<n-1;i++){
        a[i]=a[i+1];
    }
    a[n-1]=tem;
    for(int i=0;i<n;i++){
        cout<<a[i]<<"  ";
    }
    delete[] a;
    return 0;
}