#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  int R,S,T;
  int U,V,W;
  int Q,Z,J;
  cin>>a;cin>>b;cin>>c;cin>>d;cin>>e;cin>>f;cin>>g;cin>>h;cin>>i;
  U=b*a;
  V=e*d;
  W=h*g;
  Q=U/100;
  Z=V/100;
  J=W/100;
  R=a-Q+c;
  S=d-Z+f;
  T=g-J+i;
  cout<<"In Flipkart Rs."<<R;
  cout<<"\nIn Snapdeal Rs."<<S;
  cout<<"\nIn Amazon Rs."<<T;
  if((R<=S)&&(R<=T))
    cout<<"\nHe will prefer Flipkart";
  else if((S<=R)&&(S<=T))
    cout<<"\nHe will prefer Snapdeal";
  else if((T<=R)&&(T<=S))
    cout<<"\nHe will prefer Amazon";
}