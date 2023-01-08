import java.util.Scanner;

class Main {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static void main(String[] args) {

        char operator;

        int number1, number2, number3, cry, seconds, runs, zenny, cost, hours, minutes, sec;
        Scanner input = new Scanner(System.in);

        //TF oder BS Gear berechnen
        System.out.println("Tragic Fairy & Dawn of Fate only. More coming soon!\n");
        System.out.println("""
                Choose your desired need.
                Type '1': Tragic Fairy full gear
                Type '2': Tragic Fairy full gear without accessories
                Type '3': Tragic Fairy Weapon only
                Type '4': Tragic Fairy Accessories
                Type '5': Tragic Fairy Gear only\n"""+ YELLOW_BACKGROUND + BLACK +"""
                Type '6': Dawn of Fate farming"""+ RESET);
        operator = input.next().charAt(0);

        if (operator!='6') {
            System.out.println("\nDo you need a custom amount of 'Crystals'(1) or Default(0)?");
            cry = input.nextInt();
        } else {
            cry=0;
        }

        if(cry==1){
            System.out.println("\nHow many 'Crystals' do you need?");
            number1 = input.nextInt();
        } else if(operator=='1'){
            number1 = 240;
        } else if (operator=='2'){
            number1 = 144;
        } else if (operator=='3'){
            number1 = 32;
        } else if (operator=='4'){
            number1 = 96;
        } else if (operator=='5') {
            number1 = 112;
        } else if (operator=='6') {
                System.out.println("\nHow much Zenny do you need?");
                number1 = input.nextInt();
        } else {
            number1 = 0;
            System.err.println("Something went wrong. There is no type " + operator+"!");
            System.exit(0);
        }

        //Avg. Zeit pro Run
        if (operator!='6') {
            System.out.println("\nWhat is your average time to complete 'Field of Raid' in Seconds?");
        } else {
            System.out.println("\nWhat is your average time to complete 'Dawn of Fate' in Seconds?");
        }
        number2 = input.nextInt();

        //Avg. Droprate
        if (operator!='6') {
            System.out.println("\nHow many pieces do you expect per run?");
            number3 = input.nextInt();
        } else {
            number3 = 0;
        }

        System.out.println(" ");
        //Noch mal neu bedenken was für Features nützlich sein könnten
        switch (operator) {
            //Tragic Fairy full gear
            case '1' -> {
                //Berechnen
                cost = number1 * 560000 + 72800000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                System.out.println("Required crystals: " + number1 / 10 + "\nRequired pieces: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Required powder: 498(Flower) & 960(Citrus)\nRequired Zenny for crafting(Crystals + Gear): "+cost+"\nApproximate Zenny gain: " + zenny);
            }
            case '2' -> {
                //Berechnen
                cost = number1 * 560000 + 44000000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                System.out.println("Required crystals: " + number1 / 10 + "\nRequired pieces: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Required powder: 210(Flower) & 480(Citrus)\nRequired Zenny for crafting(Crystals + Gear): "+cost+"\nApproximate Zenny gain: " + zenny);
            }
            case '3' -> {
                cost = number1 * 560000 + 8800000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                System.out.println("Required crystals: " + number1 / 10 + "\nRequired pieces: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Required powder: 210(Flower) & 0(Citrus)\nRequired Zenny for crafting(Crystals + Gear): "+cost+"\nApproximate Zenny gain: " + zenny);
            }
            case '4' -> {
                cost = number1 * 560000 + 28800000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                System.out.println("Required crystals: " + number1 / 10 + "\nRequired pieces: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Required powder: 288(Flower) & 480(Citrus)\nRequired Zenny for crafting(Crystals + Gear): "+cost+"\nApproximate Zenny gain: " + zenny);
            }
            case '5' -> {
                cost = number1 * 560000 + 35200000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                System.out.println("Required crystals: " + number1 / 10 + "\nRequired pieces: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Required powder: 0(Flower) & 480(Citrus)\nRequired Zenny for crafting(Crystals + Gear): "+cost+"\nApproximate Zenny gain: " + zenny);
            }
            //Dawn of Fate
            case '6' -> {
                //How much fluid is needed
                int temp = number1;
                number1 = number1 / 7500;
                number3 = (int)Math.floor(Math.random()*(160-120+1)+120);
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(195000-172000+1)+172000);
                zenny = zenny * runs;
                System.out.println("Required Mysterious Fluid: " + number1 + "\nRequired Runs: " + runs + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run");
                System.out.println("Approximate Zenny gain: " + zenny + "\nEnd result: " + temp +" + "+ zenny + " = " + (zenny +temp));
            }
        }
    }
}