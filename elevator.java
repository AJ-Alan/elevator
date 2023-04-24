import java.util.Scanner;
// import java.text.DecimalFormat;
// import java.util.Random;
public class elevator {

    public static void main(String args[]) {

    Scanner scan = new Scanner (System.in);
    char doYouWant; //do you want to use the elevator?
    int contStart = 1; //checker if the user wants to try the elevator
    int contRandMan = 1; //checker if user wants to choose random or manual
    int contUD = 1; //checker if user wants to go Up or Down
    // int currentLeftEleFloor = 2;
    // int currentRightEleFloor = 1;
    // int character = 1;

    int ElevatorLocation; //to get which elevator is nearest to you
    int character = 1; //variable for character location
    int elevator1 = 5; //variable for  elevator1 location
    int elevator2 = 7; //variable for elevator 2 location


    do {
        System.out.println("\n\nDo you want to use the ELEVATOR? Y or N?");
        doYouWant = scan.next().charAt(0);

        if (doYouWant == 'Y' || doYouWant =='y') {
            // System.out.println("Looped!");
            contStart = 1;
            
            do {
                contRandMan = 1;
                System.out.println("\n\nDo you want to manually place the elevators or make it random? R or M?\n");
                doYouWant = scan.next().charAt(0);
                if (doYouWant == 'R' || doYouWant =='r') {
                    System.out.println("\nRandom!\n");
                    contRandMan = 0;
                }
                else if (doYouWant == 'M' || doYouWant =='m') {
                    System.out.println("\nManual!\n");
                    contRandMan = 0;
                }
                else {
                    contRandMan = 1;
                    System.out.println("Please choose between R(andom) or M(anual) !\n");
                }
            } while (contRandMan == 1);

            //function() for randomizing

            //RANDOMIZER//
            if (doYouWant == 'R' || doYouWant =='r') {
            int min = 1; // Minimum value of range
            int max = 7; // Maximum value of range
            elevator1 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            elevator2 = (int)Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("\nELEVATOR 1 currently at floor level: " + elevator1 + "\n");
            System.out.println("ELEVATOR 2 currently at floor level: " + elevator2 + "\n");
            }

            else if (doYouWant == 'M' || doYouWant =='m') {
                do {
                    contRandMan = 1;
                    System.out.println("Which floor will be ELEVATOR 1?? 1 - 7?\n");
                    elevator1 = scan.nextInt();
                    if (elevator1 < 1) {
                        System.out.println("Number is too low!\nEnter Again !!!\n");
                        contRandMan = 1;
                    }
                    else if (elevator1 > 7) {
                        System.out.println("Number is too high!\nEnter Again !!!\n");
                        contRandMan = 1;
                    }
                    else {
                        contRandMan = 0;
                        System.out.println("ELEVATOR 1 currently at floor level: " + elevator1 + "\n");
                    }
                } while (contRandMan == 1);
                do {
                    contRandMan = 1;
                    System.out.println("Which floor will be ELEVATOR 2?? 1 - 7?\n");
                    elevator2 = scan.nextInt();
                    if (elevator2 < 1) {
                        System.out.println("Number is too low!\nEnter Again !!!\n");
                        contRandMan = 1;
                    }
                    else if (elevator2 > 7) {
                        System.out.println("Number is too high!\nEnter Again !!!\n");
                        contRandMan = 1;
                    }
                    else {
                        contRandMan = 0;
                        System.out.println("ELEVATOR 2 currently at floor level: " + elevator2 + "\n");
                    }
                } while (contRandMan == 1);
            }

            do {
                contRandMan = 1;
                System.out.println("Which floor will YOU be at? 1 - 7?\n");
                character = scan.nextInt();
                if (character < 1) {
                    System.out.println("Number is too low!\nEnter Again !!!\n");
                    contRandMan = 1;
                }
                else if (character > 7) {
                    System.out.println("Number is too high!\nEnter Again !!!\n");
                    contRandMan = 1;
                }
                else {
                    contRandMan = 0;
                    System.out.println("You are currently at floor level: " + character + "\n");
                }
            } while (contRandMan == 1);

            System.out.println(",----------------------------------------------,");
            System.out.println("|                                              |");
            System.out.println("|Elevator 1 Floor: " + elevator1 + "   ||   Elevator 2 Floor: " + elevator2 + "|");
            System.out.println("|                                              |");
            System.out.println("|----------------------------------------------|");
            System.out.println("|YOUR Elevator Floor: " + character + "                        |");
            System.out.println("\"----------------------------------------------\"\n\n");

            do {
                contUD = 1;
                if (character <= 1) {
                    System.out.println("Please pick a button: U\n");
                    doYouWant = scan.next().charAt(0);
                    if (doYouWant == 'U' || doYouWant =='u') {
                        System.out.println("Up!\n");
                        contUD = 0;
                    }
                    else {
                        contUD = 1;
                        System.out.println("Please choose U(p) only!\n");
                    }
                }
                else if (character >= 7) {
                    System.out.println("Please pick a button: D \n");
                    doYouWant = scan.next().charAt(0);
                    if (doYouWant == 'D' || doYouWant =='d') {
                        System.out.println("Down!\n");
                        contUD = 0;
                    }
                    else {
                        contUD = 1;
                        System.out.println("Please choose D(own) only!\n");
                    }
                }
                else if (character > 1 && character < 7) {
                    System.out.println("Please pick a button: U or D? \n");
                    doYouWant = scan.next().charAt(0);
                    if (doYouWant == 'D' || doYouWant =='d') {
                        System.out.println("Down!\n");
                        contUD = 0;
                    }
                    else if (doYouWant == 'U' || doYouWant =='u') {
                        System.out.println("Up!\n");
                        contUD = 0;
                    }
                    else {
                        contUD = 1;
                        System.out.println("Please choose between U(p) or D(own) !\n");
                    }
                }
            } while (contUD == 1);

            //function for checker of Elevator level (Absolute Difference)
            //function for elevators to move up or down
            ElevatorLocation = ElevatorCheck(character, elevator1, elevator2);
            ElevatorStatus(ElevatorLocation, character, elevator1, elevator2);
    
            //elevator delay
            int AbsFloorDiff = ReturnAbsDifference(character, elevator1, elevator2);
            // System.out.println("Current absFloorDiff is: " + AbsFloorDiff);

            Delay(elevator1, elevator2, AbsFloorDiff, ElevatorLocation, character);

            if(ElevatorLocation==1){elevator2 = character;}//Right
            else if(ElevatorLocation==2){elevator1 = character;}//Left
            else if(ElevatorLocation==3){elevator2 = character;}//Equal

            //opening door , tell what the floor the elevator is in now.
            System.out.println("\nCURRENT LOCATION OF THE ELEVATORS");
            System.out.println("\nElevator 1: " + elevator1 + " || Elevator 2: " + elevator2);
    
            //delayy 1 second
            Delay(1000); //it takes 1 second for the door to open
    
            //door opened
            System.out.println("\nOPENING...");
    
            //delay 1 second
            Delay(1000); //it takes 1 second for the door to close
    
            //door closed
            System.out.println("\nDOOR CLOSED");
            Delay(1000); //it takes 1 second for the door to close

        }
        else if (doYouWant == 'N' || doYouWant =='n') {contStart = 0;}
        else {contStart = 1;System.out.println("\nPlease choose between Y or N !\n");}

    } while (contStart == 1);

    System.out.println("Thank you for using our Elevator !!!\n");

    }

    public static void Delay(int x) //waiting for few seconds
    {
        //System.out.println("Delaying");
        try
        {
            Thread.sleep(x);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }

    public static void Delay(int elevator1, int elevator2, int AbsFloorDiff, int ElevatorLocation, int character) //Method overloading Delay 
    {
        int elevator1Checker = elevator1;
        int elevator2Checker = elevator2;

        for (int eleNum = 0; eleNum<=AbsFloorDiff; eleNum++) {
            //It takes 2 seconds to travel in each floor.
            if (ElevatorLocation==1 || ElevatorLocation==3) {
                System.out.println("ELEVATOR 2: " + elevator2Checker + "... ");
                if(elevator2>=character){elevator2Checker--;}
                else if(elevator2<=character){elevator2Checker++;}
                Delay(2000);
            }
            else if (ElevatorLocation==2) {
                System.out.println("ELEVATOR 1: " + elevator1Checker + "... ");
                if(elevator1>=character){elevator1Checker--;}
                else if(elevator1<=character){elevator1Checker++;}
                Delay(2000); 
            }
        }
    }

    public static int ElevatorCheck(int charlvl, int elev1, int elev2) //to check which elevator is nearest to you
    {
        int difference1 = charlvl-elev1; //how far elev1 from character
        int difference2 = charlvl-elev2; //how far elev2 from character

        int absdiff1 = Math.abs(difference1); //absolute value of elev1
        int absdiff2 = Math.abs(difference2); //absolute value of elev2

        int x=0; //x will serve as return value

        if (absdiff1>absdiff2)
        {
            x = 1; //elevator 2 is nearer
        }
        else if (absdiff1<absdiff2)
        {
            x = 2; //elevator 1 is nearer
        }
        else if (absdiff1==absdiff2)
        {
            x = 3; //both on the same floor or same distance
        }
        return x;
    }

    public static int ReturnAbsDifference (int charlvl, int elev1, int elev2) //basically the same with ElevatorCheck() but only returns the abs floor difference
    {
        int difference1 = charlvl-elev1; //how far elev1 from character
        int difference2 = charlvl-elev2; //how far elev2 from character

        int absdiff1 = Math.abs(difference1); //absolute value of elev1
        int absdiff2 = Math.abs(difference2); //absolute value of elev2

        int x=0; //x will serve as return value

        if (absdiff1>absdiff2)
        {
            x = absdiff2; //elevator 2 is nearer
        }
        else if (absdiff1<absdiff2)
        {
            x = absdiff1; //elevator 1 is nearer
        }
        else if (absdiff1==absdiff2)
        {
            x = absdiff2; //both on the same floor or same distance
        }
        return x;
    }

    public static void ElevatorStatus(int x, int charlvl, int elev1, int elev2) //TO DETERMINE IF ELEV WILL GO UP OR DOWN
    {
        if (x == 1) //elevator 2 is nearer
        {
            int location = charlvl - elev2; //to check if elevator is above or below you
            if (location > 0)
            {
                System.out.println("ELEVATOR 2 IS GOING UP...");
            }
            else if (location<0)
            {
                System.out.println("ELEVATOR 2 IS GOING DOWN...");
            }
        }
        else if (x == 2) //elevator 1 is nearer
        {
            int location = charlvl - elev1; //to check if elevator is above or below you
            if (location > 0)
            {
                System.out.println("ELEVATOR 1 IS GOING UP...");
            }
            else if (location<0)
            {
                System.out.println("ELEVATOR 1 IS GOING DOWN...");
            }
        }
        else if (x == 3) // elevators are both on the same floor
        {
            int location = charlvl - elev2; //to check if elevator is above or below you
            if (location > 0)
            {
                System.out.println("ELEVATOR 2 IS GOING UP...");
            }
            else if (location<0)
            {
                System.out.println("ELEVATOR 2 IS GOING DOWN...");
            }
        }
    }
}