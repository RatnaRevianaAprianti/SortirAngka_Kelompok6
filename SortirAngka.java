//tugas alghoritma struktur data
//kelompok 6

import java.util.Scanner;
public class SortirAngka
{
public static void main(String args[])
    {
		Scanner keyboard = new Scanner(System.in);
        int numbers[]=new int[6];
        int arranged[]=new int[6];
        int n;
        int option;

        //masukkan input
        System.out.println("masukkan 6 angka: ");
        for (int i=0;i<numbers.length;i++)
        {
            System.out.print(" ");
            numbers[i] = keyboard.nextInt();
        }
        System.out.println();

        //alghortima sortir array
        for(int j=0;j<numbers.length;j++)
        {
            n=0;
            for(int r=0;r<numbers.length;r++)
            {
                if(numbers[j]>numbers[r])
                {
                    n++;
                }
            }
            while (arranged[n] == numbers[j]) n++;
            arranged[n]=numbers[j];
        }

        //pilih urutan naik atau turun
        System.out.print("ketik 0 untuk urutan naik atau ketik 1 untuk urutan turun: ");
        option = keyboard.nextInt();

        //proses hasil inputan pengguna
        if(option == 0)
        {
            for(n=0;n<arranged.length;n++)
            {
                System.out.print(arranged[n]+" ");
            }
        }
        else if(option == 1)
        {
            for(n=5;n>-1;n--)
            {
                System.out.print(arranged[n]+" ");
            }
        }
    }
}