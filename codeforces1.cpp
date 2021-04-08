#include <iostream>
using namespace std;
int main(){
int n;
cin>>n;
string s1(n);
string s2(n);

cin>>s1>>s2;
int a=0;
int b=0;
for(int i=0;i<n;i++){
    if(s1[i]>s2[i]){
        a++;
        break;
    }
    if(s1[i]<s2[i]){
        b++;
        break;
    }
    if(s1[i]==s2[i]){
        a++;
        b++;
    }
}
if(a>b){
    cout<<"RED"<<endl;
}
if(a<b){
    cout<<"BLUE"<<endl;
}
if(a==b){
    cout<<"EQUAl"<<endl;
}
return 0;
}