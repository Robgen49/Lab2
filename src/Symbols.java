import static java.lang.Character.*;

public class Symbols {
    public static void PrintSymbols(int i, int str, int st) {
        int countn = 0;
        int count = 1;
        while(i <= 0x04FF && countn<str && str > 0 && st > 0) {
            System.out.print((char) i + " ");
            if (count == st){
                System.out.println();
                count = 1;
                countn++;
                i++;
                continue;
            }
            count++;
            i++;
        }

    }
    public static void PrintMoney(int i, int str, int st){
        int countn = 0;
        int count = 1;
        while(i <= 0x20bf && countn<str && str > 0 && st > 0) {
            System.out.print((char) i + " ");
            if (count == st){
                System.out.println();
                count = 1;
                countn++;
                i++;
                continue;
            }
            count++;
            i++;
        }
    }
    public static void PrintStr(String str){
        int romecount = 0;
        int lettercount = 0;
        int upletcount = 0;
        int lowletcount = 0;
        int digitcount = 0;
        for (char c: str.toCharArray()){
            if (isLetter(c) && !(IsRome(c))) {
                lettercount++;
                if (isLowerCase(c))
                    lowletcount++;
                else
                    upletcount++;
            }
            if (IsRome(c) || (isDigit(c)))
                digitcount++;
            if(IsRome(c))
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
    public static  boolean IsRome(char c){
        String rome = new String();
        int k = 8528;
        for (int i = 0x2160; i < 0x216f; i++) {
            rome += (char) i;
        }
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
