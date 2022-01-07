#include <iostream>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int x1,x2,X1,X2;
        cin>>x1>>x2>>X1>>X2;
        int a = X1/x1;
        int b = X2/x2;
        int sum = a+b;
        cout<<sum;
    }
    return 0;
}