#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c,d;
  cin>>n;
  if (n<=200)
  {
    a=n*0.5;
    cout<<"Rs."<<a;
  }
    else if(n<=400)
    {
    b=(n*0.65)+100;
    cout<<"\nRs."<<b;
    }
    else if(n<=600)
    {
    c=(n*0.80)+200;
    cout<<"\nRs."<<c;
    }
  else if(n>600)
  {
    d=(n*1.25)+425;
    cout<<"\nRs."<<d; 
  }
}
  