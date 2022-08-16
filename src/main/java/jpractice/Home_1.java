package jpractice;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;

// 이름, 나이, 주소, 이메일, 주민번호 입력받아서 properties에 저장한 후 출력
public class Home_1 {
    public static void main(String[] args) throws Exception{
        String path = "/Users/User/Desktop/practice/File";
        File file = new File(path);
        if (!file.exists()){
            file.mkdir();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String name = st.nextToken();
        int age = Integer.parseInt(st.nextToken());
        String address = st.nextToken();
        String email = st.nextToken();
        String frontId = st.nextToken();
        String backId = st.nextToken();

        path = path + "/home.properties";
        file.createNewFile();
        FileWriter fw = new FileWriter(path);
        fw.write("name="+name+'\n');
        fw.write("age="+age+'\n');
        fw.write("address="+address+'\n');
        fw.write("email="+email+'\n');
        fw.write("ID="+(frontId+backId)+'\n');
        fw.flush();

        br = new BufferedReader(new FileReader(path));
        Properties pro = new Properties();
        pro.load(br);
        Enumeration em = pro.elements();

        while (em.hasMoreElements()){
            String value = (String) em.nextElement();
            System.out.println(value);
        }





    }
}
