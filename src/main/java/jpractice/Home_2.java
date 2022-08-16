package jpractice;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;

public class Home_2 {
    public static void main(String[] args) throws Exception{
        String path = "/Users/User/Desktop/practice/File";
        File file = new File(path);
        if (file.exists()){
            file.delete();
        } else {
            file.mkdir();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String name = st.nextToken();
        int age = Integer.parseInt(st.nextToken());
        String address = st.nextToken();
        String email = st.nextToken();
        String id1 = st.nextToken();
        int id2 = Integer.parseInt(st.nextToken());

        path = path + "/home2.properties";
        if (file.createNewFile()){
            file.delete();
        } else{
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(path);
        fw.write("name="+name+'\n');
        fw.write("age="+age+'\n');
        fw.write("address="+address+'\n');
        fw.write("email="+email+'\n');
        fw.write("number="+(id1+id2)+'\n');
        fw.flush();

        Properties pro = new Properties();
        br = new BufferedReader(new FileReader(path));
        pro.load(br);

        Enumeration em = pro.elements();
        while(em.hasMoreElements()){
            String value = (String) em.nextElement();
            System.out.println(value);
        }
    }
}
