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

public boolean arrayFront9(int[] nums) {
  
  if(nums.length<1)
  return false;
  else
  {
  int end = nums.length;
  if(end>4)
  end=4;
  int i;
  for(i=0;i<end;i++)
  {
  
  if(nums[i]==9)
  return true;
  }
  return false;
  }
  
}

public boolean array123(int[] nums) {
  
  int i;
  boolean flag1=false,flag2=false,flag3=false;
  int end = nums.length;
  for(i=0;i<end;i++)
  {
  
  if(nums[i]==1)
  flag1=true;
  else if(nums[i]==2)
  flag2=true;
  else if(nums[i]==3)
  flag3=true;
  
  }
  
  return(flag1 & flag2 & flag3);
  
}


public int stringMatch(String a, String b) {
  
  int n = Math.min(a.length(),b.length());
  int i,j=0;
  for(i=0;i<n-1;i++)
  {
  
  
  String asub = a.substring(i,i+2);
  String bsub = b.substring(i,i+2);
  if(asub.equals(bsub))
  j++;
  
  }
  
  return j;
}

}
