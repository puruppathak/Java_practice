class CodingBat{

public static void main(String args[])
{




}

public boolean or35(int n) {
  
  if(n%3==0 || n%5==0)
  return true;
  else
  return false;
  
  
}


public String front22(String str) {
  
  if(str.length()<2)
  return str+str+str;
  else
  {
  
  String interm = str.substring(0,2);
  return interm+str+interm; 
  
  }
  
  
  
}


public boolean startHi(String str) {
  
  if(str.startsWith("hi"))
  return true;
  else
  return false;
}


public boolean icyHot(int temp1, int temp2) {
  
  if((temp1<0 && temp2>100) || (temp2<0 && temp1>100))
  return true;
  else
  return false;
  
}

public boolean in1020(int a, int b) {
  
  if((a>9&&a<21)||(b>9&&b<21))
  return true;
  else
  return false;
  
}


public boolean hasTeen(int a, int b, int c) {
  
  return((a>12&&a<20)||(b>12&&b<20)||(c>12&&c<20));
  
}



}