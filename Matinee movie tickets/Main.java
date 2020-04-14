#include<iostream>
using namespace std;
int main()
{
  int a;
  double b;
  cin>>a;
  cin>>b;
  if(a>13){
    if(b==13.3){
      cout<<"$5.00";
    }
   else{
      cout<<"$8.00";
    }
  }
  else if (a<13){
   if(b==13.3){
     cout<<"$2.00";
   }
    else
  {
    cout<<"$4.00";
  }
  }
}