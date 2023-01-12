package CNU_ACA_230112.iterator;

import CNU_ACA_230112.collections.MyCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        MyIterator<String> iter =
            new MyCollection<String>(Arrays.asList("A", "BC", "DEF"))
                    .iterator();

        while(iter.hasNext()){
            String s = iter.next();
            int len = s.length();
            if(len%2==0) continue;
            System.out.println(s);
        }//map, filter, foreach를 사용하진 못하고 있음
        List<String> list = Arrays.asList("A", "BC", "DEF");
//        Iterator<String> ite = list.iterator();
//
//        System.out.println(ite.next());
//        System.out.println(ite.next());
//        System.out.println(ite.next());
//        if (ite.hasNext())
//            ite.next();
//        try {
//            System.out.println(ite.next());
//        } catch (NoSuchElementException e) {
//            System.out.println(e);
//        } finally {
//            return;
//        } //try-catch-finally 적용 해보고 싶어서 해봄 걍

//        while(ite.hasNext()){
//            System.out.println(ite.next());
//        } //무조건 한번 순회방법

    }

}
