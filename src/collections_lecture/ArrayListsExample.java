package collections_lecture;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListsExample {
    public static void main(String[] args) {
//        String names;
//        names[1];
        // array list data type 並給予設定值
        ArrayList<String> names= new ArrayList<>();
        names.add("Fer");
        names.add("Justin");
        names.add(0,"Ryan");
        names.add(2,"David");
        //會按照順序排列 index;
        names.add("Sophie");
        //
        for (int i= 0; i< names.size(); i++ ){
            System.out.println(names);
        }

        //will give you each name
        for (String name: names){
            System.out.println("Instructor's name is " + name.toUpperCase());
        }
        //get the last person in thr list
//        System.out.println("the last name = " +  );
//-----------------------------------------------------//
        System.out.println("names = " + names);
        System.out.println("name. size "+names.size());// 總共有多少個
        System.out.println("names.get "+names.get(2));//取得第幾個資訊
        System.out.println("indexOf" + names.indexOf("Ryan"));
        names.add("Vivian");//再加入新物件
        System.out.println(names);
        System.out.println(names.add("Tim"));
        System.out.println(names);


        System.out.println("Does it contain Fer?" + names.contains("Fer"));//是否有這個人？
        System.out.println("Does is contain Justin in the list of 3 ?" + names.get(3).contains("Justin") );//只會給予對或錯

//        names.removeAll(names);移除全部
        names.remove("Tim"); //移除一個 當移除時移除物件名稱
        names.remove(names.indexOf("Vivian")); //移除名字必且是特定
        System.out.println(names.isEmpty());

        System.out.println(names);
    }
}
