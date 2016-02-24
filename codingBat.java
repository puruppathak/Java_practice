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

public int intMax(int a, int b, int c) {
  int temp;
  if(a>b)
  {
  temp=a;
  }
  else
  temp=b;
  
  if(c>temp)
  return c;
  else
  return temp;
  
  
  
}

public int close10(int a, int b) {
  
  int r1 = Math.abs(a-10);
  int r2 = Math.abs(b-10);
  if(r1<r2)
  {
  return a;
  
  }
  else if(r2<r1)
  {
  return b;
  }
  
  else
  return 0;
}

public boolean in3050(int a, int b) {
  
  boolean r1 = ((a>=30 && a<=40)&&(b>=30 && b<=40));
  
  boolean r2 = ((a>=40 && a<=50)&&(b>=40 && b<=50));
  
  
  return(r1 || r2);
  
}

public int max1020(int a, int b) {
  
  if((a>=10 && a<=20) && (b>=10 && b<=20) && (a>b))
  return a;
  if((a>=10 && a<=20) && (b>=10 && b<=20) && (b>a))
  return b;
  
  if((a>=10 && a<=20))
  return a;
  else if((b>=10 && b<=20))
  return b;
  else
  return 0;  


}

public boolean stringE(String str) {
  int count=0,i;
  
  for(i=0;i<str.length();i++)
  {
  
  if(str.charAt(i)=='e')
  {
  
  count++;
  }
  
  }
  if(count>0&&count<4)
  return true;
  else
  return false;
  
}


public boolean lastDigit(int a, int b) {
  
  if((a%10)==(b%10))
  return true;
  else 
  return false;
  
  
  
}
public String endUp(String str) {
  
  
  if(str.length()>3)
  {
  String u1 = str.substring(str.length()-3,str.length());
  
  return str.substring(0,str.length()-3)+u1.toUpperCase();
  
  
  }
  else
  {
  
  return str.toUpperCase();
  }
  
  
}


}