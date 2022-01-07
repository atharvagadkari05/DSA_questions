#include <iostream>
using namespace std;


int main(){
    int t;
    cin>>t;
     bool ans;
     int d,x,y,z,strat1,strat2;
    while(t--){
         cin>>d>>x>>y>>z;
         strat1 = x*7;
     strat2 = y*d + z*(7-d) ;

    int finalAns = max(strat1,strat2);

    if(finalAns==strat1){
        ans=1;
    }else{
        ans=0;
    }
      
    }
    if(ans){
cout<<strat1;
    }else{
        cout<<strat2;
    }
}