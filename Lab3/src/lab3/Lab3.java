/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;


import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author s0257480
 */
public class Lab3
{
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) throws java.io.FileNotFoundException, java.io.IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("C:/matrices_values.txt"));
        String line = null;
        while ( ( line = reader.readLine() ) != null )
        {

            System.out.println(line);
        }
    }
}
