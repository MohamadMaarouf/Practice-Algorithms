import java.util.*; //import this to create an ArrayList
public class commonJavaProgramming{
    public static void main(String [] args){

        //For loop
        for(int a = 0; a< 1 ; a++){
            System.out.println("Test One");
        }

        //While loop
        int b = 0;
        while (b < 1){
            System.out.println("Test Two");
            b++;
        }

        //Create a list (It can grow dynamically)
        ArrayList<Integer> listOne=new ArrayList<Integer>();
        listOne.add(1);
        System.out.println(listOne);

        //Create an array. Must print a specific index.
        int [] listTwo = new int[2];
        listTwo[0] = 1;
        listTwo[1] = 2;
        System.out.println(listTwo[0]);

        //Iterate a list or an array
        for(int x : listTwo){
            System.out.println(x);
        }

        //Try Clause
        int age = 19;
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }

        //User input
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter an string, then a integer: ");
        String stringValue = inputValue.nextLine();
        int value = inputValue.nextInt();
        System.out.println("Your integer is: " + value + " Your string is: " + stringValue);
        
        //Switch Statements
        String day = "Tuesday";
        switch(day){
            case "Tuesday":
                System.out.println("You entered Tuesday."); 
                break;
            case "Wednesday":
                System.out.println("You enter Wednesday.");  
                break;  
        }
    }
}