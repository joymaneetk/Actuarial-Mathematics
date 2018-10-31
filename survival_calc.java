package create.real;

import java.util.Scanner;

public class CreateReal {

    public static void main(String[] args) {
        System.out.println("Welcome to THE CALCULATOR.");
        System.out.println("This program that calculates how likely you are to die from an accident using physics.");
        System.out.println("Please input the option number.");
        System.out.println("Option 1: driving");
        System.out.println("Option 2: riding a motorcycle");
        System.out.println("Option 3: riding a bike");
        Scanner input = new Scanner(System.in);
        Scanner weight = new Scanner(System.in);
        Scanner speed = new Scanner(System.in);
        
        double g = 9.8;
        
        
        int type = input.nextInt();
        switch(type){
        case 1: System.out.println("You chose crashing a car"); 
            System.out.println("Please input your weight(kg)");
            int yourweight = weight.nextInt();
            System.out.println("The speed at which you are travelling at(m/h). These numbers are rounded so :");
            System.out.println("Press 1 if your speed is under 35 miles per hour");
            System.out.println("Press 2 if your speed is 35-44 miles per hour");
            System.out.println("Press 3 if your speed is 45-54 miles per hour");
            System.out.println("Press 4 if your speed is 55-64 miles per hour");
            System.out.println("Press 5 if your speed is over 64 miles per hour");
            
            int yourspeed = speed.nextInt();
                switch(yourspeed){
                    case 1: double stoptime1 = 20;
                        double force = yourweight*(30/(2*stoptime1));
                        
                        if(force>75){
                            System.out.println("Your chance of surviving is IMPOSSIBLE");
                        }
                        else if(force<=75 && force>45){
                            System.out.println("Your chance of surviving is LOW");
                        }
                        else if(force<=45 && force>25){
                            System.out.println("Your chance of surviving is DECENT");
                        }
                        else if(force<=25){
                            System.out.println("Your chance of surviving is HIGH to GUARANTEED");
                        }
                        System.out.println("The force that your body takes on is " + force + " newtons");
                        break;
                    case 2: double stoptime2 = 34;
                        double force2 = yourweight*(40/(2*stoptime2));
                        if(force2>75){
                            System.out.println("Your chance of surviving is IMPOSSIBLE");
                        }
                        else if(force2<=75 && force2>45){
                            System.out.println("Your chance of surviving is LOW");
                        }
                        else if(force2<=45 && force2>25){
                            System.out.println("Your chance of surviving is DECENT");
                        }
                        else if(force2<=25){
                            System.out.println("Your chance of surviving is HIGH to GUARANTEED");
                        }
                        System.out.println("The force that your body takes on is " + force2 + "newtons");
                        break;
                    case 3: double stoptime3 = 41;
                        double force3 = yourweight*(50/(2*stoptime3));
                        if(force3>75){
                            System.out.println("Your chance of surviving is IMPOSSIBLE");
                        }
                        else if(force3<=75 && force3>45){
                            System.out.println("Your chance of surviving is LOW");
                        }
                        else if(force3<=45 && force3>25){
                            System.out.println("Your chance of surviving is DECENT");
                        }
                        else if(force3<=25){
                            System.out.println("Your chance of surviving is HIGH to GUARANTEED");
                        }
                        System.out.println("The force that your body takes on is " + force3 + "newtons");
                        break;
                    case 4: double stoptime4 = 56;
                        double force4 = yourweight*(60/(2*stoptime4));
                        if(force4>75){
                            System.out.println("Your chance of surviving is IMPOSSIBLE");
                        }
                        else if(force4<=75 && force4>45){
                            System.out.println("Your chance of surviving is LOW");
                        }
                        else if(force4<=45 && force4>25){
                            System.out.println("Your chance of surviving is DECENT");
                        }
                        else if(force4<=25){
                            System.out.println("Your chance of surviving is HIGH to GUARANTEED");
                        }
                        System.out.println("The force that your body takes on is " + force4 + "newtons");
                        break;
                    case 5: double stoptime5 = 71;
                        double force5 = yourweight*(70/(2*stoptime5));
                        if(force5>75){
                            System.out.println("Your chance of surviving is IMPOSSIBLE");
                        }
                       else if(force5<=75 && force5>45){
                            System.out.println("Your chance of surviving is LOW");
                        }
                        else if(force5<=45 && force5>25){
                            System.out.println("Your chance of surviving is DECENT");
                        }
                        else if(force5<=25){
                            System.out.println("Your chance of surviving is HIGH to GUARANTEED");
                        }
                        System.out.println("The force that your body takes on is " + force5 + "newtons");
                        break;
                    default: System.out.println("Not a valid option"); break;
                }
            
            break;
        case 2: System.out.println("You chose crashing a motorcycle");
            System.out.println("Please input your weight and the weight of your motorcycle combined.");
            System.out.println("Please input weight(kg)");
            int yourweight2 = weight.nextInt();
            System.out.println("The speed at which you are travelling at(m/h). These numbers are rounded so :");
            System.out.println("Press 1 if your speed is under 35 miles per hour");
            System.out.println("Press 2 if your speed is 35-44 miles per hour");
            System.out.println("Press 3 if your speed is 45-54 miles per hour");
            System.out.println("Press 4 if your speed is 55-64 miles per hour");
            System.out.println("Press 5 if your speed is over 64 miles per hour");
            
            int yourspeed2 = speed.nextInt();
                switch(yourspeed2){
                    case 1: double stoptime1 = 20;
                        double force = yourweight2*(30/(2*stoptime1));
                        
                        if(force>45){
                            System.out.println("Your chance of surviving is NEAR IMPOSSIBLE");
                        }
                        else if(force<=45 && force>25){
                            System.out.println("Your chance of surviving is MODERATE");
                        }
                        else if(force<=25){
                            System.out.println("Your chance of surviving is HIGH");
                        }
                        System.out.println("The force that your body and motorcycle takes on is " + force + " newtons");
                        break;
                    case 2: double stoptime2 = 34;
                        double force2 = yourweight2*(40/(2*stoptime2));
                        
                        if(force2>45){
                            System.out.println("Your chance of surviving is NEAR IMPOSSIBLE");
                        }
                        else if(force2<=45 && force2>25){
                            System.out.println("Your chance of surviving is MODERATE");
                        }
                        else if(force2<=25){
                            System.out.println("Your chance of surviving is HIGH");
                        }
                        System.out.println("The force that your body and motorcycle takes on is " + force2 + " newtons");
                        break;
                    case 3: double stoptime3 = 41;
                        double force3 = yourweight2*(50/(2*stoptime3));
                        
                        if(force3>45){
                            System.out.println("Your chance of surviving is NEAR IMPOSSIBLE");
                        }
                        else if(force3<=45 && force3>25){
                            System.out.println("Your chance of surviving is MODERATE");
                        }
                        else if(force3<=25){
                            System.out.println("Your chance of surviving is HIGH");
                        }
                        System.out.println("The force that your body and motorcycle takes on is " + force3 + " newtons");
                        break;
                    case 4: double stoptime4 = 56;
                        double force4 = yourweight2*(60/(2*stoptime4));
                        
                        if(force4>45){
                            System.out.println("Your chance of surviving is NEAR IMPOSSIBLE");
                        }
                        else if(force4<=45 && force4>25){
                            System.out.println("Your chance of surviving is MODERATE");
                        }
                        else if(force4<=25){
                            System.out.println("Your chance of surviving is HIGH");
                        }
                        System.out.println("The force that your body and motorcycle takes on is " + force4 + " newtons");
                        break;
                    case 5: double stoptime5 = 71;
                        double force5 = yourweight2*(70/(2*stoptime5));
                        
                        if(force5>45){
                            System.out.println("Your chance of surviving is NEAR IMPOSSIBLE");
                        }
                        else if(force5<=45 && force5>25){
                            System.out.println("Your chance of surviving is MODERATE");
                        }
                        else if(force5<=25){
                            System.out.println("Your chance of surviving is HIGH");
                        }
                        System.out.println("The force that your body and motorcycle takes on is " + force5 + " newtons");
                        break;
                    default: System.out.println("Not a valid option"); break;
                }
            
            
            
            
            break;
        case 3: System.out.println("You chose crashing on a bicycle."
                + "Because the chance of you dying on a bicycle is very very rare, this will calculate the extent of the injury you might sustain.");
            System.out.println("Please input your weight");
            int yourweight3 = weight.nextInt();
            System.out.println("The speed at which you are travelling at.");
            System.out.println("Press 1 if your speed is at cruising speed(slowest possible)");
            System.out.println("Press 2 if your speed is at normal cycling speed");
            System.out.println("Press 3 if your speed is racing/competitive speed");
            System.out.println("Press 4 if your cycling down a mountain");
            
            int yourspeed3 = speed.nextInt();
                switch(yourspeed3){
                    case 1: double stoptime1 = 3;
                        double force = yourweight3*(2.8/(2*stoptime1));
                        
                        if(force>35){
                            System.out.println("Your chance of sustaining a injury needing medical attention is VERY POSSIBLE");
                        }
                        else if(force<=35 && force>15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is MODERATE");
                        }
                        else if(force<=15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is PRETTY LOW");
                        }
                        System.out.println("The force that your body and bikes takes on is " + force + " newtons");
                        break;
                    case 2: double stoptime2 = 6;
                        double force2 = yourweight3*(4.3/(2*stoptime2));
                        
                        if(force2>35){
                            System.out.println("Your chance of sustaining a injury needing medical attention is VERY POSSIBLE");
                        }
                        else if(force2<=35 && force2>15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is MODERATE");
                        }
                        else if(force2<=15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is PRETTY LOW");
                        }
                        System.out.println("The force that your body and bikes takes on is " + force2 + " newtons");
                        break;
                    case 3: double stoptime3 = 14;
                        double force3 = yourweight3*(11.1/(2*stoptime3));
                        
                        if(force3>35){
                            System.out.println("Your chance of sustaining a injury needing medical attention is VERY POSSIBLE");
                        }
                        else if(force3<=35 && force3>15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is MODERATE");
                        }
                        else if(force3<=15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is PRETTY LOW");
                        }
                        System.out.println("The force that your body and bike takes on is " + force3 + " newtons");
                        break;
                    case 4: double stoptime4 = 20;
                        double force4 = yourweight3*(14.4/(2*stoptime4));
                        
                        if(force4>35){
                            System.out.println("Your chance of sustaining a injury needing medical attention is VERY POSSIBLE");
                        }
                        else if(force4<=35 && force4>15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is MODERATE");
                        }
                        else if(force4<=15){
                            System.out.println("Your chance of sustaining a injury needing medical attention is PRETTY LOW");
                        }
                        System.out.println("The force that your body and bike takes on is " + force4 + " newtons");
                        break;
                   
                }
            
            
            break;
        default: System.out.print("If you are not going to input a valid option, go away."); break;
        }
        
        
    }
    
}

