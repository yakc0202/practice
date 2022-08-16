package jpractice;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class File_1 {
    public static void main(String[] args) throws Exception{
        String path = "/Users/User/Desktop/practice/file1.properties";

        File file = new File(path);
        if (file.createNewFile()){
            file.createNewFile();
        }

        PrintWriter pw = new PrintWriter(path);
        pw.write("lyrics=fucking\n");
        pw.write("title=TOMBOY\n");
        pw.flush();

        Properties pro = new Properties();
        BufferedReader br = new BufferedReader(new FileReader(path));
        pro.load(br);

        Enumeration em = pro.elements();
        while (em.hasMoreElements()){
            String value = (String) em.nextElement();
            System.out.println(value);
        }

    }
}
