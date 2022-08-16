package jpractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class ArrHash {
    static ArrayList arr = new ArrayList();

    String name;
    int age;
    String address;
    String email;

    public ArrHash(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrHash ah;
        Hashtable ht = new Hashtable();
        System.out.print("number: ");
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            String address = st.nextToken();
            String email = st.nextToken();
            arr.add(new ArrHash(name, age, address, email));
            ht.put(name,arr.get(i));
        }

        System.out.print("search name: ");
        br = new BufferedReader(new InputStreamReader(System.in));
        String search = br.readLine();
        if(ht.containsKey(search)){
            ArrHash arrh = (ArrHash) ht.get(search);
            System.out.println(arrh.name+ arrh.age+ arrh.address+ arrh.email);
        }

    }
}
