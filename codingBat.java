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

public boolean loneTeen(int a, int b) {
  
  return(((a>12&&a<20)&&(b<13||b>19)) || ((b>12&&b<20)&&(a<13||a>19)));
  
}


public String delDel(String str) {
  
  
  
  if(str.length()>=4)
   {
  String str1 = str.substring(1,4);
  
  boolean rent = str1.equals("del");
  
  
  
  
  if(rent==true)
  {
  
  return str.charAt(0) + str.substring(4);
  
  }
  
  else
  {
  return str;
  }
  }
  else
  return str;
  
  
}

public boolean mixStart(String str) {
  
  
  if(str.length()>=3)
  {
  //String str1 = str.substring(1,2);
  
  if(str.charAt(1)=='i'&& str.charAt(2)=='x')
  {
  
  return true;
  }
  else
  return false;
  }
  else
  return false;
  
  
}

public String startOz(String str) {
  String result = "";
  
  if (str.length() >= 1 && str.charAt(0)=='o') {
    result = result + str.charAt(0);
  }
  
  if (str.length() >= 2 && str.charAt(1)=='z') {
    result = result + str.charAt(1);
  }
  
  return result;
}


}