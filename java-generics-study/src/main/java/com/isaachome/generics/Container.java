package com.isaachome.generics;

public class Container {
    private Object ref;
    public Container(Object ref) {
        this.ref = ref;
    }

    public Object getRef() {
        return ref;
    }

    public void setRef(Object ref) {
        this.ref = ref;
    }

    public static void main(String[] args) {
        Container c = new Container("Hello World");
        c.setRef("My World");
        String result =(String) c.getRef();

        Container container = new Container("Hello Kitty");
        container.setRef(100);
        String result2 =(String) container.getRef();
        System.out.println(result2);

    }
}
