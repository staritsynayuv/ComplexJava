public class Complex {

    private double re;
    private double im;

    public Complex(double Re, double Im) {
        this.re = Re;
        this.im = Im;
    }


    public  Complex add(Complex c2) {
        return new Complex(this.re + c2.re, this.im + c2.im);
    }

    public  Complex subtract(Complex c2) {
        return new Complex(this.re - c2.re, this.im - c2.im);
    }


    public  Complex multiply(Complex c2) {
        return new Complex(this.re * c2.re - this.im * c2.im, this.re * c2.im + this.im * c2.re);
    }

    public String toString(){
        if (im >= 0) {
            return re + "+" + im + "i";
        }
        else
            return re + "-" + im + "i";
    }

}
