import java.awt.*;

public class Complex {

    private double Re;
    private double Im;

    public Complex(double Re, double Im) {
        this.Re = Re;
        this.Im = Im;
    }


    public  Complex Addition(Complex c2) {
        return new Complex(this.Re + c2.Re, this.Im + c2.Im);
    }

    public  Complex Dif(Complex c2) {
        return new Complex(this.Re - c2.Re, this.Im - c2.Im);
    }


    public  Complex Mult(Complex c2) {
        return new Complex(this.Re * c2.Re - this.Im * c2.Im, this.Re * c2.Im + this.Im * c2.Re);
    }

    public String toString(){
        if (Im >= 0) {
            return Re + "+" + Im + "i";
        }
        else
            return Re + "-" + Im + "i";
    }

}
