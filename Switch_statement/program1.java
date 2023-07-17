	// Switch statement
import java.util.Scanner;

		class Demo{
			
			public static void main(String[] A){
				Scanner obj = new Scanner(System.in);
				System.out.println("hotel 7/12");

				System.out.print("1.Veg \n 2.Non-Veg \nEnter your Choice : ");
				String str= obj.nextString();
					
					switch(str){
					
						case "Veg":
						      {
						      	String str1 ="starter";
								switch(str1){
								
									case "starter":
										System.out.println("paneer");
										break;
									case "main course":
										System.out.println("paneer tikka");
										break;	
								}
						      }
						      break;
				
						case "Non-veg":
							{
							 	String str1="main course";
							 	switch(str1){
									
									case "starter":
										System.out.println("chikan");
										break;

									case "main course":	
										System.out.println("chikan tikka");
										break;
								}
							}
							break;
					}
					
			}
}
