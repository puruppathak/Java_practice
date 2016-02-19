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


}