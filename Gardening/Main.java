#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  if (c>b*1 && c<=b*2)
  {
    cout<<("It is a mango tree");
  }
  else if(c>b*(b-2) && c<=b*(b-1))
  {
    cout<<("It is a mango tree");
  }
  else 
  {
    cout<<"It is not a mango tree";
  }
}