package ra.model;

public class Calculator<T> {
    static double sum(double a, double b){
        return a+b;
    }
   static double sum(double a, double b,double c){
        return a+b +c;
    }
    static double sum(double a, double b,double c ,double d){
        return a+b+c+d;
    }
    static double sum(double a, double b,double c, double d, double e){
        return a+b+c+d+e;
    }

    public String toStringFake(T t){
        return t.toString();
    };

}
