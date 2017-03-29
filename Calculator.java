/**
 * Created by Kristina Blomdahl on 2017-02-22.
 */
public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {// kolla om b är negativt, gör det positivt och polarisera produkten innan return.
        int product = 0;
        boolean negative = false; //variabel som används för att vi ska minnas att vi har ett negativt värde in
        if (b < 0) {//kollar om b är negativt genom att kolla om den är mindre än noll
            negative = true; //Sätt negative till true
            b = Math.abs(b); //gör variabeln positiv dvs större än noll.
        }
        System.out.println("värde på b innan for-loop"+b);
        for (int i = 1; i <= b; i++) {// exempel a=3; b=4; 3*4; a adderas med a b gånger. i är räknare.
            product += a; //produkten skapas genom att vi adderar a med sig själv b gånger.
            System.out.println(" " + i + " " + product);
        } //3*1; 3*2; 3*3; 3*4;
        if(negative) product*=-1; //Om en variabel är negativ måste vi göra produkten negativ
        System.out.println("värde på product innan return"+product);
        return product;
    }

}
