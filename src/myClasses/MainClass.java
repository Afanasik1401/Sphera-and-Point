package myClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] argv) throws InputMismatchException, ArrayIndexOutOfBoundsException, NumberFormatException
    {
        try
        {
            float[] G = new float[6];
            ArrayList<Point> aL = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите координаты центра сферы  и координаты точки на сфере");
            for (int i = 0; i < 6; i++) {
                if (sc.hasNextFloat())
                {
                    G[i] =  sc.nextFloat();;         // 0-2 - координаты центра
                } else
                {
                    System.out.println("Вы ввели не целое число");
                    return;
                }
            }
            Sphera centr = new Sphera(G[0], G[1], G[2], G[3], G[4], G[5]); // создала сферу
            System.out.println("Наша сфера");
            System.out.println(centr.toString());
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\darya\\IdeaProjects\\Точки\\src\\myClasses\\data.txt"));
            String w = reader.readLine();
            while (w != null) {
                String[] coef = w.trim().split(" +");
                G[3]= Float.parseFloat(coef[0]);
                G[4]= Float.parseFloat(coef[1]);
                G[5] = Float.parseFloat(coef[2]);
                Point tochka = new Point( G[3], G[4], G[5]);
                aL.add(tochka);
                w = reader.readLine();
            }
            reader.close();
            System.out.println("Точки внутри сферы");
            for (Point s : aL) {

                if ((centr.belongTo(s.getX(),s.getY(),s.getZ())) == -1)
                    System.out.println(s.toString());
            }
            System.out.println("Точки на сфере");
            for (Point s : aL) {

                if ((centr.belongTo(s.getX(),s.getY(),s.getZ())) == 0)
                    System.out.println(s.toString());
            }
            System.out.println("Точки вне сферы");
            for (Point s : aL) {

                if ((centr.belongTo(s.getX(),s.getY(),s.getZ())) == 1)
                    System.out.println(s.toString());
            }
        }
       catch (IOException e) {
            System.out.println("Ошибка");
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели не цифру!");
            return;

        } catch (NumberFormatException ex) {
            System.out.println("Вы указали не цифру в файле!");

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Вы вышли за границы массива!");

        }
    }
}

