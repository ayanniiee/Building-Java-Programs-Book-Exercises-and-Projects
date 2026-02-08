
public class Question_7
{
    public static final int SIZE=10;
	public static void main(String[] args) {
	top();
	middle();
	bottom();

	}
	public static void top(){
	    for(int i=SIZE+1; i>=1; i--){
	        System.out.print(" ");
	    }
	    System.out.print("+");
	    for(int i=SIZE*3; i>=1; i--){
	        System.out.print("-");
	    }
	    System.out.println("+");
	    
	}
	public static void middle(){
	    for(int i=1; i<= SIZE; i++){
	     for(int j=SIZE; j>=i; j--){
	         System.out.print(" ");
	     }   
	     System.out.print("/");
	     for(int k=SIZE*3; k>i*3;k--){
	         System.out.print(" ");
	     }
	      System.out.print("___/");
	      for(int h= 1; h<=i-1; h++){
	          System.out.print("__/");
	      }
	        
	      for(int h= 1; h<=i-1; h++){
	          System.out.print("/");
	      }
	     System.out.println();
	        
	    }
	}	
	public static void bottom(){
	    System.out.print("+");
	    for(int i=1;i<=SIZE*3; i++){
	        System.out.print("-");
	    }
	    System.out.print("+");
	    for(int k=SIZE; k>=1; k--){
	        System.out.print("/");
	    }
	    
	    System.out.println();

	    for(int i=SIZE/2; i>=1; i--){
	        System.out.print("|");
	        for (int k=1; k<= 4; k++){
	            System.out.print(" ");
	        }
	        System.out.print("Building Java Programs");
	         for (int k=1; k<= SIZE*3-26; k++){
	            System.out.print(" ");
	        }
	        System.out.print("|");
	        for(int g= 1; g<=i*2; g++){
	            System.out.print("/");
	        }
	        System.out.println();
	        
	    }
	     System.out.print("+");
	    for(int i=1;i<=SIZE*3; i++){
	        System.out.print("-");
	    }
	    System.out.print("+");
	}
	
}
