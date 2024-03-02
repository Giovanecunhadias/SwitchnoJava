import java.util.Scanner;

public class num{
    public static void main(String[] args) {
        class Switch{
            public void utitlizando_o_switch(){
                Scanner input = new Scanner(System.in);
                System.out.print("Digigte um número: ");
                int n = input.nextInt();
                System.out.print("Digite o valor ao qual você deseja subtrair: ");
                int sub = input.nextInt();

                n -= sub;
                switch (n) {
                    case 0:
                        System.out.println("É zero!!!!!");
                    break;
                    case 1:
                        System.out.println("É um!!!!");
                    break;
                    case 3:
                        System.out.println("É três !!!!!");
                    break;
                    case 2:
                        System.out.println("É dois !!!!!");
                    break;
                }   
            }
        }
        Switch caso;
        caso = new Switch();
        caso.utitlizando_o_switch();
    }
}