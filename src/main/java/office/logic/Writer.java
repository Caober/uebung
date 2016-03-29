package office.logic;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by e_kek on 29.03.2016.
 */
public class Writer
{
        String Pfad = ".\\TestUebung.txt";
        BufferedWriter writer;

    public void Export() throws IOException
    {
        writer = new BufferedWriter(new FileWriter(new File(Pfad)));


        writer.write("Das ist die erste Zeile");
        writer.newLine();
        writer.flush();



    }




}
