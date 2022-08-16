package jpractice;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;
import java.util.StringTokenizer;

public class Test_1 {
    public static void main(String[] args) throws Exception{
        // 경로 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String path = null;
        File file;
        StringTokenizer st = new StringTokenizer(br.readLine(), "/");
        String arr[] = new String[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
            if (path == null){
                path = '/' + arr[i];
            }else{
                path = path + '/' + arr[i];
            }
//            System.out.println(path);
            file = new File(path);
            if (!file.exists()){
                file.mkdir();
            }
        }
        // 파일 만들기
        System.out.print("file name: ");
        path = path + '/' + br.readLine();
        System.out.println(path);
        file = new File(path);
        if (!file.createNewFile()){
            file.createNewFile();
        }

        st = new StringTokenizer(br.readLine());
        String userid = st.nextToken();
        String passwd = st.nextToken();
        String email = st.nextToken();

//        System.out.println(userid);
//        System.out.println(passwd);
//        System.out.println(email);

        PrintWriter pw = new PrintWriter(path);
        if (userid.equals("name")){
            pw.write("name="+userid+'\n');
//            pw.flush();
        }
        if (passwd.equals("pw")){
            pw.write("passwd="+passwd+'\n');
//            pw.flush();
        }
        if (email.equals("gmail")){
            pw.write("email="+email+'\n');
        }
        pw.flush();

        Properties pro = new Properties();
        br = new BufferedReader(new FileReader(path));
        pro.load(br);
        Enumeration em = pro.elements();
        while(em.hasMoreElements()){
            String value = (String) em.nextElement();
            System.out.println(value);
        }

//        for (int i = 0; i < arr.length; i++) {
//            File file = new File(path);
//            if ()
//        }
//        if (!file.exists()){
//            file.mkdirs();
//        }
//
//        br = new BufferedReader(new InputStreamReader(System.in));
//        path = path + br.readLine();
    }
}
