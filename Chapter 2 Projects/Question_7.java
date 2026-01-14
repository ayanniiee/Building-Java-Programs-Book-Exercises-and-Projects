public class Question_7{
    public  static final int SIZE=20;
    public static void main (String[]args){   
      printTopDashes();
        printTop();
       printTopBottom();
        printSentence();
        printBottom();
        

    }

public static void printTop(){
        for(int i= 1; i<=SIZE; i++){
            for(int spaces= 1; spaces<=SIZE+1-i; spaces++){
             System.out.print(" ");
            }
            System.out.print("/");
            
            for(int spacestwo= 1; spacestwo<= SIZE * 3 - 3 * i; 
spacestwo++){
             System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
    System.out.print("___/");
}
for (int squares = 1; squares <= i - 1; squares++) {
    System.out.print("__/");
    
}for(int dashes= 1; dashes<i; dashes++){
             System.out.print("/");
            }
            System.out.println();
        }
    }
public static void printTopDashes(){
    for(int i=1; i<= SIZE+1; i++)	{
        System.out.print(" ");
    }
            System.out.print("+");

     for(int i=1; i<= SIZE*3; i++){
        System.out.print("-");
    }
                System.out.println("+");
 
}

public static void printTopBottom(){
    
    System.out.print("+");
    for(int i=1; i<=SIZE*3; i++){
    System.out.print("-");
}
    System.out.print("+");
    for(int dashes=1; dashes<=SIZE;dashes ++){
        System.out.print("/");
    }
 System.out.println();
}
public static void printBottom(){
    
    System.out.print("+");
    for(int i=1; i<=SIZE*3; i++){
    System.out.print("-");
}
    System.out.print("+");
    

}
// print buliding java sentence
public static void printSentence(){
   
    for(int i =1; i<=SIZE/2; i++){
       System.out.print("|");

        for( int spaces=1; spaces<= 4; spaces++){
       System.out.print(" ");

        }
       System.out.print("Builiding Java Programs");
         for( int spaces=1; spaces<= SIZE*3-27; spaces++){
       System.out.print(" ");

        }
         System.out.print("|");
         for(int dashes= 1; dashes<= SIZE - 2 * i+2 ; dashes++){
             System.out.print("/");
            }
             System.out.println();


}
}
}








