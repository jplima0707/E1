
import java.util.Scanner;
public class E1_JoaoPedroLima
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        double n1;
        double n2;
        double n3;
        double n4;
        double n5;
        double mediaA;
        double mediaB;
        double aux;
        
        System.out.println("Informe n1:");
        n1 = in.nextDouble();
        System.out.println("Informe n2:");
        n2 = in.nextDouble();
        System.out.println("Informe n3:");
        n3 = in.nextDouble();
        System.out.println("Informe n4:");
        n4 = in.nextDouble();
        System.out.println("Informe n5:");
        n5 = in.nextDouble(); 
        
        //ordenamento
         {if (n5 < n4){
            aux = n5;
            n5 = n4;
            n4 = aux;
            }
            if(n5 < n3){
                aux = n5;
                n5 = n3;
                n3 = aux;
            }
             if(n5 < n2){
                aux = n5;
                n5 = n2;
                n2 = aux;
            }
             if(n5 < n1){
                aux = n5;
                n5 = n1;
                n1 = aux;
            }   
            if(n4 < n3){
                aux = n4;
                n4 = n3;
                n3 = aux;
            }
             if(n4 < n2){
                aux = n4;
                n4 = n2;
                n2 = aux;
            }
             if(n4 < n1){
                aux = n4;
                n4 = n1;
                n1 = aux;
            }
             if(n3 < n2){
                aux = n3;
                n3 = n2;
                n2 = aux;
            }    
             if(n3 < n1){
                aux = n3;
                n3 = n1;
                n1 = aux;
            }
             if(n2 < n1){
                aux = n2;
                n2 = n1;
                n1= aux;
            }
            mediaA = (n2 + n3+ n4)/3;
            mediaB = (n5 + n4 + n3)/3;
            System.out.println("media A =" +mediaA);
            System.out.println("media B =" +mediaB);            
        }
    }
}
        

            
               

