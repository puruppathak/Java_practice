import java.util.*; // required for certain packages

class CodingBat2 {


public static void main(String[] args) {
	
}


public String stringTimes(String str, int n) {
  
  String result="";
  int i=0;
  for(i=0;i<n;i++)
  {
  
  result = result + str;
  
  }
  return result;
  
  
}


public String frontTimes(String str, int n) {
  
  String result="";
  int i;
  if(str.length()>=3)
  {
  String sub = str.substring(0,3);
  for(i=0;i<n;i++)
  {
  
  result=result+sub;
  
  }
  return result;
    }
   
   
   else
   {
   
   for(i=0;i<n;i++)
  {
  
  result=result+str;
  
  }
   
   
   return result;
   }
   
  
}


int countXX(String str) {
  
  int i,counter=0;
  for(i=0;i<str.length()-1;i++)
  {
  
  if(str.substring(i,(i+2)).equals("xx"))
  {
  
  counter++;
  
  }
  
  
  }
  
  return counter;
  
}

boolean doubleX(String str) {
  
  
  int i;
  i = str.indexOf('x');
  if(i==-1)
  {
  
  return false;
  }
 
 else
 {
 
 String x = str.substring(i);
 boolean j = x.startsWith("xx");
 if(j==true)
 return true;
 else return false;
 }
 
 }
 
 
 
 public String stringBits(String str) {
  
  int i;
  String result = "";
  for(i=0;i<str.length();i+=2)
  {
  
  result = result+str.charAt(i);
  
  
  }
  return result;
  
}

public String stringSplosion(String str) {
  
  String result="";
  int i;
  
  
  for(i=1;i<=str.length();i++)
  {
  
  result = result + str.substring(0,i); 
  
  }
  
  return result;
}

public int last2(String str) {
  if (str.length() < 2) return 0;
  
  int n = str.length(); 
  String last1 = str.substring(n-2);
  int counter=0,i;
  
  for(i=0;i<n-2;i++)
  {
  
  if(str.substring(i,i+2).equals(last1))
  counter++;
  
  }
  return counter;
  
  
}


public int arrayCount9(int[] nums) {
  int i,counter=0;
  for(i=0;i<nums.length;i++)
  {
  
  if(nums[i]==9)
  counter++;
  
  }
  return counter;
  
}


}
