import java.text.NumberFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char operator;

        int number1, number2, number3, cry, seconds, runs, zenny, cost, hours, minutes, sec, wep, armor, accs;
        String snumber1, sruns, scost, szenny;
        Scanner input = new Scanner(System.in);

        //TF oder BS Gear berechnen
        System.out.println("Vile Predator, Tragic Fairy, Garden of Plenty. Last Updated: 22nd October 2023\n");
        System.out.println("""
                Choose your desired need.
                Type '0': Garden of Plenty(Gluton Zenny farm)
                Type 'D': Dawn of Fate farming(outdated)
                Type 'T': Tragic Fairy
                Type 'V': Vile Predator
                Type 'S': Farming Shards
                """);
        operator = input.next().charAt(0);

        if(operator=='V' || operator=='T'){
            System.out.println("\nHow many Weapons do you need? | (e.g type '2' for 2 weapons)");
            wep = input.nextInt();
        } else {wep=0;}
        if(operator=='V' || operator=='T'){
            System.out.println("\nHow many armor parts do you want to craft? | (e.g type '3' for 3 armor parts)");
            armor = input.nextInt();
        } else {armor=0;}
        if(operator=='V' || operator=='T'){
            System.out.println("\nHow many accessories do you want to craft? | (e.g type '3' for 3 accessories)");
            accs = input.nextInt();
        } else {accs=0;}

        if (operator!='D' && operator!='0' && operator!='S') {
            System.out.println("\nDo you need a custom amount of 'Crystals'(1) or Default(0)?");
            cry = input.nextInt();
        }else if(operator=='S'){
            cry=1;
        } else {
            cry=0;
        }

        if(cry==1){
            System.out.println("\nHow many 'Crystals' do you want? | Type a number");
            number1 = input.nextInt();
        } else if(operator=='T'){
            number1 = (16*wep)+(14*armor)+(12*accs);
        } else if (operator=='V'){
            number1 = (40*wep)+(30*(armor+accs));
        } else if (operator=='D' || operator=='0' || operator=='7') {
                System.out.println("\nHow much Zenny do you need?");
                number1 = input.nextInt();
        } else {
            number1 = 0;
            System.err.println("There is no type " + operator+"!\nPlease check your spelling and use the Uppercase letter");
            System.exit(0);
        }

        //Avg. Zeit pro Run
        if (operator=='D'){
            System.out.println("\nWhat is your average time to complete 'Dawn of Fate' in Seconds?");
        } else if (operator=='V' || operator=='S' || operator=='T'){
            System.out.println("\nWhat is your average time to complete 'Endless Wasteland' in Seconds? | (e.g Type '50' for 50 seconds)");
        } else {
            System.out.println("\nWhat is your average time left in 'Garden of Plenty' in Seconds?");
        }
        number2 = input.nextInt();

        //Avg. Droprate
        if (operator!='D' && operator!='0') {
            System.out.println("\nHow many 'Shard of Corruption' do you expect per run?");
            number3 = input.nextInt();
        } else {
            number3 = 0;
        }

        String filler = "\n------------------------------------------------------------------------";
        System.out.println(" ");
        switch (operator) {
            //Tragic Fairy
            case 'T' -> {
                cost = (number1 * 560000)+(5600000*(wep+armor))+(4800000*accs);
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                int citrus = (55*(armor+accs));
                int flower = (80*wep)+(32*accs);
                snumber1 = NumberFormat.getIntegerInstance().format(number1);
                String snumber11 = NumberFormat.getIntegerInstance().format(number1/10);
                sruns = NumberFormat.getIntegerInstance().format(runs);
                scost = NumberFormat.getIntegerInstance().format(cost);
                szenny = NumberFormat.getIntegerInstance().format(zenny);
                System.out.println("Required Fused Crystals of Corruption: " + snumber11 +
                        "\nRequired Molten Shards of Corruption: " + snumber1 +
                        "\nRequired Runs: " + sruns + " with an average of '" + number3 + "' drops per run"+filler);
                System.out.println("Required materials: "+citrus+"(Citrus Powder) & "+flower+"(Flower Powder)"+
                        "\nRequired Zenny for crafting(Crystals + Gear): "+scost+" Zenny"+filler);
                System.out.println("Required time to farm: "+hours+" hour(s), "+minutes+" minutes and "+sec+" seconds with an average of '"+number2+"' seconds per run"+
                        "\nApproximate Zenny gain(Maze clear): "+szenny+" Zenny"+
                        "\nDISCLAIMER: MAZE CLEAR ZENNY GAIN IS BASED ON RANDOM MATH AND VARIES WITH WEEKEND BONUS!");
            }
            //Dawn of Fate
            case 'D' -> {
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
            case '0' -> {
                runs = number1 / 1137838;
                zenny = runs * 1137838;
                if (zenny < number1) {
                    runs = runs + 1;
                    zenny = runs * 1137838;
                }
                number2 = 120 - number2;
                int exp = 20 * runs;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                System.out.println("Required Runs: " + runs + " with an average of '" + number2 + "' seconds per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes + " minutes and " + sec + " seconds");
                System.out.println("End result: " + zenny + " zenny and " + exp + " spirit exp");
            }
            //Vile Predator
            case 'V' -> {
                cost = number1 * 560000 + (11000000*(armor+wep))+(9000000*accs);
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                int ampoule = (480*wep)+(120*armor)+(60*accs);
                int cells = (20*wep)+(10*armor)+(40*accs);
                snumber1 = NumberFormat.getIntegerInstance().format(number1);
                String snumber11 = NumberFormat.getIntegerInstance().format(number1/10);
                sruns = NumberFormat.getIntegerInstance().format(runs);
                scost = NumberFormat.getIntegerInstance().format(cost);
                szenny = NumberFormat.getIntegerInstance().format(zenny);
                String sampoule = NumberFormat.getIntegerInstance().format(ampoule);
                //double vpruns = ((double) ampoule /120)+((double) cells /12);
                System.out.println("Required Fused Crystals of Corruption: " + snumber11 +
                        "\nRequired Molten Shards of Corruption: " + snumber1 +
                        "\nRequired Runs: " + sruns + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required materials: "+sampoule+"(Mutant Blood Ampoule) & "+cells+"(Vacuum Vein Stem Cells)" +
                        "\nRequired Zenny for crafting(Crystals + Gear): "+scost+" Zenny");
                System.out.println("Required time to farm: "+hours+" hour(s), "+minutes+" minutes and "+sec+" seconds with an average of '"+number2+"' seconds per run"+
                        "\nApproximate Zenny gain(Maze clear): " + szenny+" Zenny"+
                        "\nDISCLAIMER: MAZE CLEAR ZENNY GAIN IS BASED ON RANDOM MATH AND VARIES WITH WEEKEND BONUS!");
            }
            //Selling Shards
            case 'S' -> {
                cost = number1 * 560000;
                number1 = number1 * 10;
                runs = number1 / number3;
                seconds = runs * number2;
                sec = seconds % 60;
                minutes = seconds % 3600 / 60;
                hours = seconds % 86400 / 3600;
                zenny = (int)Math.floor(Math.random()*(155000-110000+1)+110000);
                zenny = zenny * runs;
                snumber1 = NumberFormat.getIntegerInstance().format(number1);
                String snumber11 = NumberFormat.getIntegerInstance().format(number1/10);
                sruns = NumberFormat.getIntegerInstance().format(runs);
                szenny = NumberFormat.getIntegerInstance().format(zenny);
                scost = NumberFormat.getIntegerInstance().format(cost);
                String finCost = NumberFormat.getIntegerInstance().format(cost-zenny);
                System.out.println("Requested amount of Crystals: " + snumber11 +filler+"\nRequired Molten Shards of Corruption: " + snumber1 + "\nRequired Runs: " + sruns + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + hours + " hour(s), " + minutes+" minutes and " + sec+" seconds with an average of '" + number2 + "' seconds per run"+"\nApproximate Zenny gain(Maze clear): " + szenny+" Zenny");
                System.out.println("It would cost: "+scost+" Zenny to craft: "+snumber11+" Crystals"+"\nCrafting cost minus(-) Maze clear earnings: "+finCost+"\nDISCLAIMER: MAZE CLEAR ZENNY GAIN IS BASED ON RANDOM MATH AND VARIES WITH WEEKEND BONUS!");
            }
        }
    }
}