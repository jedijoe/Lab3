package lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3
{
   public static void main(String args[])
   {
      int a, b, x, y, i, i1, i2, i3, r1, r2;
      double sum = 0 ;

      //First matrix ---------------------------------------------------//
      String filename = "H:/Matrix1.txt"; // file that has the first matrix (update path)
      System.out.print("Matrix1 = ");
      a = readingMatrixSizeA(filename);
      System.out.print(" by ");
      b = readingMatrixSizeB(filename);
      System.out.println();

      double first[][] = new double[a][b];
      for ( i = 0 ; i < a ; i++ )
      {
         for ( i1 = 0 ; i1 < b ; i1++ )
         {   first[i][i1] = readingTheMatrix(filename,i,i1);  }
      }
      //----------------------------------------------------------------//


      //Second Matrix---------------------------------------------------//
      filename = "H:/Matrix2.txt"; // file that has the second matrix (update path)
      System.out.print("Matrix2 = ");
      x = readingMatrixSizeA(filename);
      System.out.print(" by ");
      y = readingMatrixSizeB(filename);
      System.out.println();
      if ( b != x )
      {   System.out.println("Matrices multiplication is not possible.");   }
      else
      {

      }
   }

   public static int readingMatrixSizeA( String thefile )
    {
    int a=0;
    try {
            // since we don't know the size of the matrix, store the values in an array list
            // so that it will grow automatically as we read in the matrix
            ArrayList< ArrayList< Double > > dynamicArray = new ArrayList< ArrayList< Double > >();

            // connect a scanner to the file
            Scanner fileReader = new Scanner(new File(thefile));

            // while there is a row of values to parse
            while(fileReader.hasNext())
            {
                // get the next line of the file
                String input = fileReader.nextLine();
                String[] values = input.split(" ");
                ArrayList< Double > row = new ArrayList< Double >();

                for(int index = 0; index < values.length; ++index)
                {row.add(Double.parseDouble(values[index]));}
                dynamicArray.add(row);
            }
            a = dynamicArray.size();

            System.out.print(a);
        }
    catch (FileNotFoundException e)
        {
            System.out.println("Failed to read in file: " + thefile + "!  Reason: " + e.getLocalizedMessage());
        }
    return a;
    }

   public static int readingMatrixSizeB( String thefile )
    {
    int b=0;
    try {
            // since we don't know the size of the matrix, store the values in an array list
            // so that it will grow automatically as we read in the matrix
            ArrayList< ArrayList< Double > > dynamicArray = new ArrayList< ArrayList< Double > >();

            // connect a scanner to the file
            Scanner fileReader = new Scanner(new File(thefile));

            // while there is a row of values to parse
            while(fileReader.hasNext())
            {
                // get the next line of the file
                String input = fileReader.nextLine();
                String[] values = input.split(" ");
                ArrayList< Double > row = new ArrayList< Double >();
                for(int index = 0; index < values.length; ++index)
                {row.add(Double.parseDouble(values[index]));}
                dynamicArray.add(row);
            }
            b = dynamicArray.get(0).size();
            System.out.print(b);
        }
    catch (FileNotFoundException e)
        {
            System.out.println("Failed to read in file: " + thefile + "!  Reason: " + e.getLocalizedMessage());
        }
    return b;
    }

   public static double readingTheMatrix( String thefile, int a, int b)
    {
           
    }
}
