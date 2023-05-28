package exercicios;

public class exercicio08 {
    public static void main(String[] args) {
//        8. Faça um programa para:
//a) Ler um valor x qualquer
//b) Calcular Y = (x+1)+(x+2)+(x+3)+(x+4)+(x+5)+…(x+100). 
        int x = 10;
        int y = 0;
        
        for(int i = 1; i<=100; i++){
            y += (x+i);
            System.out.println(y +"("+x+"+"+i+")");
        }
        
        System.out.println("\n"+y);
    }
}
