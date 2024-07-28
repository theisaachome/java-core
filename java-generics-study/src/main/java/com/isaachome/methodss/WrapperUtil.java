package com.isaachome.methodss;

import com.isaachome.supertypeandsubtype.Container;

public class WrapperUtil {


    public static <T>void copy(Container<T> source, Container<? super T> dest){
        T data = source.getRef();
        dest.setRef(data);
    }
}
