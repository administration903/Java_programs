//Write a menu driven program to perform insertion,deletion, searching and sorting operations on an array. Design the classes accordingly


import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
class Menudriven{
public static void check(int newarr[], int el){
		int res=Arrays.binarySearch(newarr, el);
		boolean test= res>0 ? true : false;
		System.out.println("\n Is " + el + " present in the array: " + test);
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		}
public static void main(String args[]){
	int choice, i=0 , element, count=0;;
	Scanner sc= new Scanner(System.in);
	int arr[]= new int[7];
	int newarr[]= new int[arr.length +1 ];
	
	System.out.println("\n\n\n:::::::::MENU DRIVEN PROGRAM:::::::::");
	System.out.println("---------------------------------------");
	while(true){
	System.out.println("\n 1. Enter an array\n");
	System.out.println("\n 2. Insertion in array\n");
	System.out.println("\n 3. Deletion in array\n");
	System.out.println("\n 4. Searching in array\n");
	System.out.println("\n 5. Sorting an array\n");
	System.out.println("\n 6. Exit\n");
	System.out.println("\n Enter your choice:: \n");
	choice =  sc.nextInt(); 
	
	switch(choice){
	
	case 1: //create an array
		System.out.println("\n Enter  elements in an array::\n" );
		for(i=0;i<arr.length;i++){
		System.out.println("\n Enter an array " );
		arr[i]=sc.nextInt();
		}
		System.out.println("\n\n Array: " + Arrays.toString(arr));
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
	break;
			
	case 2: //insert an element 
		System.out.println("\n Enter the element to insert: \n ");
		int value = sc.nextInt();
			System.out.println("\n Initial array: " + Arrays.toString(arr));
			for(i=0;i<arr.length;i++){
				newarr[i]=arr[i];
				}
			newarr[arr.length]=value;
		System.out.println("\n Array with " + value + " added: "+ Arrays.toString(newarr));
		System.out.println();
		System.out.println("-------------------------------------------");		
		System.out.println();

	break;

	case 3: //delete an element
		System.out.println("\n Enter the element to remove: \n ");
		element = sc.nextInt();
		for(i=0;i<newarr.length;i++){
			if(element==newarr[i]){
				count++;
				for(int j=i;j<newarr.length-1;j++){
				newarr[j] = newarr[j+1];
				}
				i--;
			}
			}
			System.out.println("\n\n Removed the element successfully!!\n");
			System.out.println("\n The new array is: \n");
			for(i=0;i<newarr.length-count;i++){
			System.out.print("   " + newarr[i]);
			}
		System.out.println("\n");
		System.out.println("-------------------------------------------");
		System.out.println();
	break;
		
	case 4: //search in array
		System.out.println("\n Enter the element to search: \n ");
		int el = sc.nextInt();
		
		System.out.println("\n Array: " + Arrays.toString(newarr));
		check(newarr, el);
		System.out.println();
		System.out.println("-------------------------------------------");		
		System.out.println();
	break;

	case 5: //sort an array
		Arrays.sort(newarr);
		System.out.println("\n Elements of array after sorted in ascending order: \n");
		for(i=0;i<newarr.length;++i){
			System.out.print("  " +newarr[i]);
		}
		System.out.println("\n");
		System.out.println("-------------------------------------------");
		System.out.println();
	break;

	case 6: 
		System.out.println("\n Exiting..........\n\n\n\n ");
		System.exit(0);
	
	default:  
		System.out.println("\n Please, Enter a valid choice!!! \n");
		System.out.println("\n ---------------------------------- \n\n");
	
	}
	}
}
}
