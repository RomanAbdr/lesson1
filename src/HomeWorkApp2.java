public class HomeWorkApp2 {

    public static void main(String[] args){
        summ(5,10);
        sign(-10);
        signbool(0);
        numbline("Строка", 5);
        System.out.println(years(300));
    }
    public static boolean summ(int a, int b){
        if (a+b>=10 && a+b<=20) return true;
           else return false;
    }
    public static void sign(int a){
        if (a>=0){System.out.println("Число положительное");}
          else {System.out.println("Число отрицательное");}
    }
    public static boolean signbool(int a){
        if (a<0) return true;
          else return false;}
    public static void numbline(String n, int a){
        for(int i = 1;i <= a;i++){
            System.out.println(n);
        }
    }

    public static boolean years(int a) {
     if(a%400 == 0) return true;
       else{if(a%100==0) return false;
         else {
           if (a%4==0) return true;
             else return false;
              }
           }
    }

}
