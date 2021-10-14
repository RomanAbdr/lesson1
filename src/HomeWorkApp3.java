public class HomeWorkApp3 {
    public static void main(String[] args) {
       //arrayReplacement();
       //arrayHundred();
        //arrayMultiply();
        //arrayDiagonal();
        //arrayValue(5,67);
        //arrayExtremum();
        //arrayBalance(new int[]{1, 23, 13, 14, 10, 12});
        //arrayShift(new int[]{0,1,2,3,4}, 3);

    }
    public static void arrayReplacement(){
        int[] array = {0,1,1,0,1,0,0,1,0,0,1,0,1,0,1,0,};
        for(int i = 0; i <= array.length-1; i++){
            if (array[i]==0) {array[i]=1;}
            else {array[i]=0;}
        }
    }
    public static void arrayHundred(){
        int[] array = new int[100];
        int n= 1;
        for (int i = 0; i <= array.length-1; i++){
            array[i] = n;
            n++;
        }
    }
    public static void arrayMultiply() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }
    public static void arrayDiagonal(){
        int[][] array = new int[6][6];
        int j = array.length-1;
        for (int i = 0; i <= array.length-1; i++){
            array[i][i] = 1;
            array[i][j] = 1;
            j--;
        }
    }
    public static void arrayValue (int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
    }
    public static void arrayExtremum(){
        int[] array = {12,35,24,6,87,0,-24,123};
        int x = 0;
        int y = 1;
        int m = 0;
        int n = 1;
        for (int i = 0; i <= array.length; i++){
            if(y<array.length) {
                if (x == y) {y++;}
                else {
                    if (array[x] > array[y]) {y++;}
                    else {x = y;}
                }
            }
        }
        for (int j = 0; j <= array.length; j++){
            if(n<array.length) {
                if (m == n) {n++;}
                else {
                    if (array[m] < array[n]) {n++;}
                    else {m = n;}
                }
            }
        }
        System.out.println("Максимальное число массива: " + array[x]);
        System.out.println("Минимальное число массива: " + array[m]);
    }
    public static boolean arrayBalance(int[] array){
        boolean result = false;
        for (int i = 0; i < array.length; i++){
            int l = i + 1;
            int r = array.length - l;
            int[] array1 = new int[l];
            for(int k = 0; k < array1.length; k++){
                array1[k] = array[k];
            }
            int[] array2 = new int[r];
            for(int z = 0; z < array2.length; z++){
                array2[z] = array[l+z];
            }
            int summl = 0;
            int summr = 0;
            for (int m = 0; m < array1.length; m++){
                summl = summl + array1[m];
            }
            for (int n = 0; n < array2.length; n++){
                summr = summr + array2[n];
            }
            if(summl == summr) {result = true;}
        }
        return result;
    }
    public static void arrayShift (int[] array, int n){
        int p = n;
        if (n < array.length && n > 0){
            for (int i = 0; i < array.length; i++){

                int save = array[p];
                System.out.println(save);
                int z = p+n;
                if (z >= array.length){z = z - array.length;}
                array[z] = save;
                p = p + n;
                if (p >= array.length){p = p - array.length;}
                System.out.println(p);
            }
            for (int j = 0; j < array.length; j++){System.out.println(array[j]);}

        }
        else {System.out.println("Значение n больше длины массива. Установите значение меньше " + array.length);}
        int minus = 0 - array.length;
        System.out.println(minus);
        System.out.println(n);
        if (n > minus && n<0){

        }
        else {System.out.println("Значение n меньше длины массива. Установите значение больше " + minus);}
        if(n == 0){System.out.println("Значение n  не может ровняться 0");}
    }
}
