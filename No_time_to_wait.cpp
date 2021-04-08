#include<iostream>
using namespace std;
int main(){
    int n,h,x;
    bool temp=0;
    cin>>n>>h>>x;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        int ans=arr[i]+x;
        if(ans>=h){
             temp = 1;
            
            break;
    }
     
    }
   if(temp==1){
       cout<<"YES"<<endl;
   }else{
       cout<<"NO"<<endl;
   }
    }
