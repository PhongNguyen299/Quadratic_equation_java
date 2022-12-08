public class QuadraticEquation {
    double  a,b,c,delta;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = this.b * this.b -  4 * this.a * this.c;
    }

    public double getA() {
        return this.a;
    };

    public double getB() {
        return this.b;
    };

    public double getC() {
        return this.c;
    };

    public double getDiscriminant(){
        return this.delta;
    }

    public double getRoot1() {
        return ((-this.b + Math.pow(this.delta, 0.5)) / 2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.pow(this.delta, 0.5)) / 2 * this.a);
    }

}
