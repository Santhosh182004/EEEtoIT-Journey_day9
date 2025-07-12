First Non-Repeating Character
//Write a program to find the first non-repeating character in a string.
// Use a LinkedHashMap to preserve order + store frequencies.
/* Example: Input:  abaccdeff
            Output: b      */
import java.util.*;
class Student{
    public static void main(String[] args) {
        LinkedHashMap<Character,Integer> freqmap=new LinkedHashMap<>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for(char ch:str.toCharArray()){
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:freqmap.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeating character: "+entry.getKey());
                break;
            }
            else{
                System.out.println("No first non repeating character found");
            }
        }      
    }} 
