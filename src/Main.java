import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;

        double number1, number2, number3, gear, result, temp;
        Scanner input = new Scanner(System.in);

        //TF oder BS Gear berechnen
        System.out.println("Choose your desired gear." + "\nEither press 1 for Tragic Fairy or 2 for Broken Savior");
        operator = input.next().charAt(0);

        //Was genau gebraucht wird
        System.out.println("Do you need full gear?\nYes('1') or No('0')?");
        gear = input.nextDouble();

        //Anzahl der Crystals
        if(gear==0){
            System.out.println("How many 'Crystals' do you need?");
            number1 = input.nextDouble();
        } else {
            number1 = 240;
        }

        //Avg. Zeit pro Run
        if(!(operator == 0)){
            System.out.println("What is your average time to complete 'Field of Raid' in Seconds?");
        } else {
            System.out.println("What is your average time to complete 'Blooming Road EP4' in Seconds?");
        }
        number2 = input.nextDouble();


        //Avg. Droprate
        System.out.println("How many pieces do you expect per run?");
        number3 = input.nextDouble();

        //Noch mal neu bedenken was für Features nützlich sein könnten
        switch (operator) {
            //Tragic Fairy
            case '1':
                //Anzahl pieces, Runs
                number1 = number1 * 10;
                temp = number1 / number3;
                result = temp * number2;
                result = result / 60;
                System.out.println("Required pieces: "+ number1 + "\nRequired Runs: " + temp + " with an average of '" + number3 + "' drops per run");
                System.out.println("Required time to farm: " + result + " with an average of '" + number2 + "' seconds");
                if(gear==1){
                    System.out.println("Required powder: 498(Flower) & 960(Citrus)");
                }
                break;

            case '2':
                break;
        }
    }
}