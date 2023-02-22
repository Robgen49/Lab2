import static java.lang.Character.*;

public class Symbols {
    public static void PrintSymbols() {
        for (int i = 0x0400; i < 0x04FF; i++) {
            if (i % 16 == 0)
                System.out.println();
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (int i = 0x20a0; i < 0x20a0+32; i++) {
            if (i % 16 == 0)
                System.out.println();
            System.out.print((char) i + " ");
        }
    }
    public static void PrintStr(String str){
        int romecount = 0;
        int lettercount = 0;
        int upletcount = 0;
        int lowletcount = 0;
        int digitcount = 0;
        for (char c: str.toCharArray()){
            if (isLetter(c) && !(isRome(c))) {
                lettercount++;
                if (isLowerCase(c))
                    lowletcount++;
                else
                    upletcount++;
            }
            if (isRome(c) || (isDigit(c)))
                digitcount++;
            if(isRome(c))
                romecount++;

        }
        System.out.println("Количество букв: " + lettercount);
        System.out.println("Из них строчных: " + lowletcount);
        System.out.println("Заглавных: " + upletcount);
        System.out.println("Количество цифр: " + digitcount);
        System.out.println("Из них арабских: " + (digitcount-romecount));
        System.out.println("Из них неарабских: " + romecount);
        System.out.println("Количество других символов: " + (str.length() - (lettercount + digitcount)));
        System.out.println("Общее количество символов: " + str.length());
    }

    public static boolean isRome(char c){
        String rome = "I X V";
        for(char b: rome.toCharArray())
            if (c == b)
                return true;
        return false;
    }

    public static int Count(String str, String Pattern){
        int num = 0;
        StringBuffer s = new StringBuffer(str);
        while (s.indexOf(Pattern)>=0){
            num++;
            s.deleteCharAt(s.indexOf(Pattern));
            }
        return num;
    }
    public static void Cycle(String str){
        StringBuffer s = new StringBuffer(str);
        do{
            s.append(s.charAt(0));
            s.deleteCharAt(0);
            System.out.println(s);
        }
        while(s.indexOf(str) < 0);
    }
}
