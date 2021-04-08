#include <iostream>
using namespace std;
int main(){
    int N;
    cin>>N;
    int arr[N];
    for(int i=0;i<N;i++){
        cin>>arr[i];
    }
    int mx = -1;
    int ans = 0;
    for(int i=0;i<N;i++){
        if(arr[i]>mx){
           if(arr[i]>arr[i+1]){
               ans++;
           }
        }
    mx = max(arr[i],mx);

    }
    cout<<"your ans is "<<ans<<endl;

}