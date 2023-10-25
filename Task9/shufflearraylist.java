import java.util.ArrayList;
import java.util.Collections;

public class shufflearraylist 
{
    public static void main(String[] args) 
    {
     ArrayList<String> arrayList = new ArrayList<>();
     arrayList.add("Haswanth");
     arrayList.add("virat kohli");
     arrayList.add("scahin Tendulakr");
     arrayList.add("Rohit Sharma");
     arrayList.add("Kl Rahul");
     Collections.shuffle(arrayList);
     System.out.println("Shuffled ArrayList:");
        for (String element : arrayList) 
        {
            System.out.println(element);
        }
    }
}