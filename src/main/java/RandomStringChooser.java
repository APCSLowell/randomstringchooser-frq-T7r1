import java.util.*;
public class RandomStringChooser
{
private ArrayList<String>he;
  RandomStringChooser(String[] n){
    he=new ArrayList<String>();
    for (int i:n)
      he.add(n);
  }
  
 public String getNext(){
   if(he.size()>0){
    int g=(int)(math.random()he.size());
    String tem=he.get(g);
   tem.remove(g);
   return tem;
   }return "None";
 }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
