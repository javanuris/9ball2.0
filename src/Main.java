import java.util.Scanner;

/**
 * Created by Admin on 14.03.2016.
 */
public class Main {

  static  Field field;
    public static void main(String [] args){
      field = new Field();
        field.playerData();
        for(int  i = 0; i<=8 ; i++){
            System.out.print(" "+field.getPlayerOne().getBalls(i)+" |");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        for(int  i = 0; i<=8 ; i++){
            System.out.print(" "+field.getPlayerTwo().getBalls(i)+" |");
        }
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Введите целое число: ");
            if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число

                field.mainLogicGame(field.getPlayerOne(), sc.nextInt());
                for(int  i = 0; i<=8 ; i++){
                    System.out.print(" "+field.getPlayerOne().getBalls(i)+" |");
                }
                System.out.println();
                System.out.println("-------------------------------------");
                for(int  i = 0; i<=8 ; i++){
                    System.out.print(" "+field.getPlayerTwo().getBalls(i)+" |");
                }
            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
    }

    }


