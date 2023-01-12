package CNU_ACA_230112.collections;

import CNU_ACA_230112.iterator.MyIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyCollection<T> {
    private List<T> list;

    public MyCollection(List<T> list){
        this.list = list;
    }

    public MyCollection<T> filter(Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        foreach(d -> {
            if(predicate.test(d)) newList.add(d);
        });
        return new MyCollection<>(newList);
    }

    public <U> MyCollection<U> map(Function<T, U> function) {
        List<U> newList = new ArrayList<>();
        foreach(d -> newList.add(function.apply(d)));
        return new MyCollection<>(newList);
    }

    public int size() {
        return list.size();
    }

    public void foreach(Consumer<T> consumer){
        for(int i=0;i<list.size();i++){
            T data= list.get(i);
            consumer.accept(data);
        }
    }

    public MyIterator<T> iterator(){
        return new MyIterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public T next() {
                return list.get(index++);
            }
        };
    }
}
