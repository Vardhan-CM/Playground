#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  if(a>b)
  {
    c=((100+b)-a);
      cout<<c;
  }
  else if (b>a)
  {
    c=(b-a);
    cout<<c;
  }
  
}