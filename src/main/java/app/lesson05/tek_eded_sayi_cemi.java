package app.lesson05;

//1-den 100-e kimi tek ededlerin sayını və cemini tapan console proqramı yazın.

public class tek_eded_sayi_cemi {
    public static void main(String[] args) {
        int odd_counter=0;
        int odd_sum=0;
        for (int i=1; i<100; i++){
            if (i%2!=0){
                odd_counter++;
                odd_sum = odd_sum + i; // veya odd_sum+=i ;
            }
        }
        System.out.println("1-den 100-e kimi tek ededlerin sayı: " + odd_counter);
        System.out.println("1-den 100-e kimi tek ededlerin cemi: " + odd_sum);
    }
}
