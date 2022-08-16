package jpractice.inheritance;

import java.util.ArrayList;

public class total {
    public static void main(String[] args) throws Exception{
        String classlist[] = {"jpractice.inheritance.room1", "jpractice.inheritance.room2"};
        ArrayList arr = new ArrayList();
        for(String classname : classlist){
            mega m = (mega) Class.forName(classname).newInstance();
            arr.add(m);
        }

        for (int i = 0; i < arr.size(); i++) {
            mega mc = (mega) arr.get(i);
            mc.Prin();
        }
    }
}
