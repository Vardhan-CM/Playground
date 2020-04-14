#include<iostream>
using namespace std;
int main()
{
  int p;
  int r;
  int t;
  cin>>p;
  cin>>r;
  cin>>t;
  float s=(p*t*r)/100,a=p+s,d=s*0.02,f=a-d;
  cout<<s<<"\n";
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<f;
}