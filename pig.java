import java.util.*;
public class pig {

    //generate random number
    public static int generateRandom() {
        final int MAX = 6;  //constant
        int faceNumber = (int) ((Math.random() * MAX) + 1);  //1 to 6
        return faceNumber;
    }

    public static void main(String[] args) {
        int sumPerson = 0;
        int sumRobot = 0;

        int firstRoll;
        int secondRoll;

        System.out.println("write roll");
        Scanner theInput = new Scanner(System.in);
        String userStart = theInput.next();
        while (true) {

            if (userStart.equals("roll")) {
                //player part
                firstRoll = generateRandom();
                secondRoll = generateRandom();

                if (firstRoll == 1 & secondRoll == 1){
                    System.out.println("you lost point");
                    sumPerson = 0;
                }
                else if (firstRoll == 1 || secondRoll == 1) {
                    System.out.println("you didn't get any points");
                }
                else {
                    sumPerson = sumPerson + firstRoll + secondRoll;
                }
                System.out.println("first dice " + firstRoll + " second dice " + secondRoll);
                System.out.println("your points " + sumPerson);
                System.out.println();

                //robot
                firstRoll = generateRandom();
                secondRoll = generateRandom();

                if (firstRoll == 1 & secondRoll == 1){
                    System.out.println("robot lost all points");
                    sumRobot = 0;
                }
                else if (firstRoll == 1 || secondRoll == 1) {
                    System.out.println("robot didn't get any points");
                }
                else {
                    sumRobot = sumRobot + firstRoll + secondRoll;
                }
                System.out.println("robot's first dice " + firstRoll + " second dice " + secondRoll);
                System.out.println("robot's points " + sumRobot);

            }
            if (sumRobot >= 100){
                System.out.println("robot won with " + sumRobot);
                break;
            }
            if (sumPerson >= 100){
                System.out.println("person won with " + sumPerson);
                break;
            }
            theInput = new Scanner(System.in);
            userStart = theInput.next();
        }
    }
}


