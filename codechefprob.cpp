#include<bits/stdc++.h> 
using namespace std;


int main(){
int t;
cin>>t;
while(t--){
   
   
   
    string s;
    cin>>s;
    int ans=0;
    int i=0;
   
   
   
    while(i<s.size())
    {
        if(s[i]=='1')
        {
                ans++;
        
                while(i<s.size()&&s[i]=='1')
                i++;
        
       } 
       else
            i++;
        
        }
        cout<<ans<<endl;
    }
}

