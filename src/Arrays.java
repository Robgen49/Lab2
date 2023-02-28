public class Arrays {
    public static int geometric_mean(){
        //double a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double a[] = {3,3};
        for (double x: a) {
            if (x <= 0) {
                System.out.println("Числа должны быть положительными!");
                return -1;
            }
        }
        double geomean = 1;
        for (double x: a){
            geomean *= x;
        }
        System.out.print("Среднее геометрическое: " + Math.sqrt(geomean));
        return 1;
    }

    public static int geometric_mean2(){
        //double a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double count = 0;
        double a[] = {-3,-3};
        double geomean = 1;
        for (double x: a){
            if (x<0) {
                geomean *= x;
                count++;
            }
        }
        if (geomean > 0)
            System.out.print("Среднее геометрическое: " + Math.pow(geomean, 1/count));
        else
            System.out.print("Количество отрицательных элементов должно быть четным");
        return 1;
    }
}
