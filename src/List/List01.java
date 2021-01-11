package List;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("super");
        list.add(1);

        System.out.println("list集合的长度："+list.size());//输出集合的长度

        for (int i=0;i<list.size();i++){
            System.out.println("list集合的第"+i+"个指为："+list.get(i));
        }
    }
}
