package com.isaachome.supertypeandsubtype;

public class Container <T>{
    private T ref;
    public Container(T ref) {this.ref = ref;}

    public T getRef() {
        return ref;
    }

    public void setRef(T ref) {
        this.ref = ref;
    }

    public static  double sum(Container<? extends Number> n1, Container<? extends  Number> n2) {
        double sum = n1.getRef().doubleValue() + n2.getRef().doubleValue();
        return sum;
    }
    public static double  sumWildCard(Container<?> n1 , Container<?> n2){
       return 0.0;
    }
    public static <U> void  copy(Container<U> source,Container< ? super U> dest){
       U data = source.getRef();
       dest.setRef(data);
    }

    public static void main(String[] args) {
        Container rawContainer = new Container("Hello");
        Container<String> stringContainer = new Container<String>("World");
        rawContainer = stringContainer;
        stringContainer = rawContainer;

        Container<?> unknownContainer = new Container<>("Hello");
//        String stringContainerII = unknownContainer.getRef();
        Object objectContainer = unknownContainer.getRef();
        // upper bound
        sum(new Container<Integer>(10), new Container<Integer>(20));
        // using wildcard to add Integer and String
       var result= sumWildCard(new Container<Integer>(10), new Container<String>("hello"));
        System.out.println(result);

    }
}
