import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner; 
public class Main {
	public static void main(String []args){
		int input;
		int command = 0;
		int parameter = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		

while (!(command==5)) {
		System.out.println("\n Input format"+
		"\n 1 X: put X at the end of arraylist"+ "\n 2 Y: remove 
all Ys from arraylist" 
				+ "\n 3: print size of the arraylist"+ 
"\n 4: prints arraylist");

      command=scanner.nextInt();
      if(command==1 || command==2){
      parameter = scanner.nextInt();
      }
      
      if(command==1){
    	 list.add(parameter); 
      }
      else if(command==2){
    	list.removeAll(Collections.singleton(parameter));  
      }
      else if(command==3){
    	  System.out.print("ArrayList size: "+ list.size());
    	  
      }
      else   if(command==4){
    	  System.out.print("[");
    	 for(int n=0;n<list.size();n++){
    		System.out.print(list.get(n)+", "); 
    	 }
    	 System.out.print("]");
      }
     


}
 if(command == 5){
	  System.exit(0);
}
	}

}
