#include<iostream>
using namespace std;
int main()
{
  int boat,adult,child;
  std::cin>>boat;
  std::cin>>adult;
  std::cin>>child;
  if(boat>adult*70+child*30)
  std::cout<<"Boat is stable";
  else if(boat<adult*70+child*30)
  std::cout<<"Boat ""will ""drow";
}