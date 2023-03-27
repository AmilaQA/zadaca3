import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {

        // Task 1
        // Napravite program kojem mozete pri pokretanju reci koliki niz zelite zatim
        // da popunite niz sa int brojevima.
        // Zatim ispisite sve brojeve po jedan broj po redu (println) ,
        // na ispisu svih brojeva kod mora ispisati obrnuti  redosljed(ne index) u nizu ,
        // te da li je broj paran ili ne kao i da li je veci od 10.
        Scanner reader = new Scanner(System.in);
        // int[] myIntArray = {1, 2, 3, 4};
        System.out.println("Koliki niz zelite? ");

        // Console READ user value
        int lengthOfArray = reader.nextInt();
        int[] numberOfIntegers = new int[lengthOfArray];

        // enter and populate elements
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Unesite element niza ?");
            int elementOfArray = reader.nextInt();
            numberOfIntegers[i] = elementOfArray;
        }
        // print elements
        for (int i = lengthOfArray; i > 0; i--) {
            String description = "";
            if (numberOfIntegers[i - 1] % 2 == 0) {
                description = " - paran broj";
            } else {
                description = " - neparan broj";
            }
            if (numberOfIntegers[i - 1] > 10) {
                description += " i veci od 10";
            } else {
                description += " i manji od 10";
            }
            System.out.println(numberOfIntegers[i - 1] + description);
        }

        // Task 2 Napravite program koji moze za niz od 10 brojeva da ispise:
        //First number in array: 123
        //Second number in array: 23
        //Third number in array: 3
        //itd itd.
        //i da se ovakav ispis moze koristiti do 15 elementa u nizu.

        int[] arrayOfNums = {123, 23, 10, 240, 117, 33, 78, 65, 32, 44, 91, 24, 93, 4, 5};
        String[] positionInArray = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh",
                "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};

        for (int i = 0; i < arrayOfNums.length; i++) {
            System.out.printf("%s number in array: %s", positionInArray[i], arrayOfNums[i]);
            System.out.println('\n');
        }

        //task 3 Napravite program koji ce obrnuti redosljed niza odnosno:
        //1 2 3 4 5 6 7   postaje 7 6 5 4 3 2 1
        //i da moze primiti bilo koji niz i obrnuti ga.

        System.out.println("Koji niz zelite? ");
        //Console READ user value
        int lengthOfArray1 = reader.nextInt();
        int[] numberOfIntegers1 = new int[lengthOfArray1];

        // enter and populate elements
        for (int i = 0; i < lengthOfArray1; i++) {
            System.out.println("Unesite elemente niza ?");
            int elementOfArray1 = reader.nextInt();
            numberOfIntegers1[i] = elementOfArray1;
        }
        int [] reversedArray = new int[lengthOfArray1];
        for (int i = lengthOfArray1; i > 0; i--) {
            reversedArray[lengthOfArray1 - i] = numberOfIntegers1[i - 1];
        }

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }

        // task 4 Napravite program koji provjerava da li je rijec palindrom
        // inace mozete koristiti metodu toCharArray() da string pretvorite u niz char-ova.
        System.out.println("Unesite rijec za koju zelite provjeriti da li je palindrom ? ");
        //Console READ user value
        String word = reader.next();
        char[] wordArray = word.toCharArray();
        boolean isPalindrom = true;

        for (int i = 0, j = (wordArray.length - 1); i < (wordArray.length); i++, j--) {
            if (wordArray[i] != wordArray[j]) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom == true) {
            System.out.println("The word is palindrome!");
        } else
            System.out.println("The word is not a palindrome!");

        // Task 5 Napravite program  kojem cemo reci opseg za koji ce morat ispisati sve parne brojeve
        // u koje ne ulaze brojevi kojima postavljamo opseg
        //npr
        //Please enter lower number in range:
        //10
        //Please enter larger number in range:
        //16
        //System-Out: Even numbers for range: 10 to 16 are:
        //   12,14
        System.out.println("Please enter lower number in range: ");
        int lowerRange = reader.nextInt();
        System.out.println("Please enter larger number in range: ");
        int largerRange = reader.nextInt();
        String evenNumbers = "";
        for (int i = lowerRange + 1; i < largerRange; i++) {
            if (i % 2 == 0) {
                evenNumbers += i + ", ";
            }
        }
        System.out.println("Even numbers for range: " + lowerRange + " to " + largerRange + " are: ");
        System.out.println(evenNumbers);

        // Task 6. Napravite program koji ce objediniti tri  niza u jedan veliki niz.
        // examples of 3 Arrey
        // Should be populated from console
        System.out.println("Task 6");
        System.out.println("\n");
        int firstArray[] = {1, 2};
        int secondArray[] = {3, 4, 5, 6};
        int thirdArray[] = {7, 8, 9};

        int lengthOfTotalArray = firstArray.length + secondArray.length + thirdArray.length;
        int totalArray[] = new int[lengthOfTotalArray];
        // enter and populate elements
        for (int i = 0; i < firstArray.length; i++) {
            totalArray[i] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            totalArray[i + firstArray.length] = secondArray[i];
        }

        for (int i = 0; i < thirdArray.length; i++) {
            totalArray[i + firstArray.length + secondArray.length] = thirdArray[i];
        }

        for (int i = 0; i < totalArray.length; i++) {
            System.out.println(totalArray[i]);

        }

        // Task 7. NApravite program koji ce sabrati dva niza zajedno, ukoliko je jedan niz veci od drugo
        // taj broj se samo prepise
        // Npr: {1,3,5,6} , {1,1,1,1,1,1,1}
        // Output: 2,4,6,7,1,1,1
        System.out.println("Task 7");
        System.out.println("\n");
        System.out.println("Zbir nizova: {1,3,5,6} i {1,1,1,1,1,1,1} je niz: ");
        int arrayA[] = {1,3,5,6};
        int arrayB[] = {1,1,1,1,1,1,1};

        if (arrayA.length > arrayB.length)
        {
            for (int i = 0; i < arrayB.length; i++) {
                arrayA[i] += arrayB[i];
            }
            // print
            for (int i = 0; i < arrayA.length; i++) {
                System.out.println(arrayA[i]);
            }
        }
        else
        {
            for (int i = 0; i < arrayA.length; i++) {
                arrayB[i] += arrayA[i];
            }
            // print
            for (int i = 0; i < arrayB.length; i++) {
                System.out.println(arrayB[i]);
            }
        }

        // Task 8
        // Napravite program koji niz stringova filtrira i izbacuje iz niza bilo koji string
        // koji sadrzi neki od samoglasnika: a e i o u (Obratite paznju da radi i za velika i mala slova)
        // mozete koristiti metodu na stringu neku koju nadjete ako vam moze pomoci

        System.out.println("Task 8");
        System.out.println("\n");
        String[] arrayOfString = {"Car", "Monkey", "Doll", "Dry", "Fly", "Fry", "tEst"};
        String[] arrayOfStringWithoutVowels = new String[arrayOfString.length];

        int lenghtOfFinalArray = 0;
        for (int i = 0; i <= arrayOfString.length - 1; i++) {
            if (!arrayOfString[i].toLowerCase().contains("a") && !arrayOfString[i].toLowerCase().contains("e") && !arrayOfString[i].toLowerCase().contains("i") && !arrayOfString[i].toLowerCase().contains("o") && !arrayOfString[i].toLowerCase().contains("u"))
            {
                arrayOfStringWithoutVowels[i] = arrayOfString[i];
                lenghtOfFinalArray++;
            }
        }
        String[] finalArray_withoutNullValues = new String[lenghtOfFinalArray];
        for (int j=0, i = 0; j <= arrayOfStringWithoutVowels.length - 1; j++ )
        {
            if (arrayOfStringWithoutVowels[j] != null)
            {
                finalArray_withoutNullValues[i] = arrayOfStringWithoutVowels[j];
                i++;
            }
        }

        // print
        for (int j=0; j <= finalArray_withoutNullValues.length - 1; j++ )
        {
            System.out.println(finalArray_withoutNullValues[j]);
        }

        // Task 9
        // Napravite program koji ce izracunati total kada se svaki element iz jednog niza
        // sabere sa svakim elementom iz drugog niza.
        //npr:
        //[2,4,6]
        //[3,5,8]
        //Total sabiranja: 84
        int[] array1 = {2, 4, 6};
        int[] array2 = {3, 5, 8};
        int sum = 0;
        System.out.println("\n");
        System.out.println("Task 9");
        System.out.println("\n");
        for (int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
               sum+= array1[i] + array2[j];
            }
        }
        System.out.println("Sum of two arrays is: " + sum);
    }
}


