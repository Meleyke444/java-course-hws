
//1) 1-den 100-e kimi cüt ededlerin sayını və cemini tapan console proqramı yazın.

package app.lesson05;
public class cut_eded_sayi_cemi {
    public static void main(String[] args) {
        int sum=0;
        int counter=0;
        for (int i=1; i<100; i++){
            if (i%2==0){
                counter++;
                sum=sum+i;
            }
        }
        System.out.println("1-dən 100-e kimi cüt ededlərin sayı:  " + counter);
        System.out.println("1-dən 100-e kimi cüt ededlərin cemi:  " + sum);
    }
}
