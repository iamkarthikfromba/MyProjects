import java.util.*;
class StringCapitilise{
    Scanner scn = new Scanner(System.in);
    String Name;
    String UpperCase;
    void ReadSentence(){
        System.out.print("Enter the Name: ");
        Name = scn.nextLine();
        UpperCase = "";
        Scanner NameScan = new Scanner(Name);
        while(NameScan.hasNext()){
            String word = NameScan.next();
            UpperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

        }
        System.out.printf("Name after capitalizing it: ");
        System.out.println(UpperCase.trim());
    }

    void NameShortening(){
        String Initials[] = UpperCase.split(" ");
        System.out.printf("Name after considering the first few words first letter and the last word in full: ");
        for(int i = 0;i < Initials.length - 1;i++){
            Initials[i] = Initials[i].substring(0,1);
            System.out.print(Initials[i] + " ");
        }
        System.out.print(Initials[Initials.length - 1]);
    }
}
class LabProgram2{
    public static void main(String[] args){
        StringCapitilise sct = new StringCapitilise();
        sct.ReadSentence();
        sct.NameShortening();
    }
}
