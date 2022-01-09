/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author lorra
 */
public class CalculadoraMultiplos {
    private double numero1;
    private double numero2;
    private double numero3;
    public int r;
    public int e;
    public int w;
    private double mmc2, mmc3, mdc2, mdc3;

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    public void setMmc2(double mmc2) {
       this.mmc2 = mmc2;
    }

    public void setMmc3(double mmc3) {
        this.mmc3 = mmc3;
    }

    public void setMdc2(double mdc2) {
        this.mdc2 = mdc2;
    }

    public void setMdc3(double mdc3) {
        this.mdc3 = mdc3;
    }

    public double getMmc2() {
        return mmc2;
    }

    public double getMmc3() {
        return mmc3;
    }

    public double getMdc2() {
        return mdc2;
    }

    public double getMdc3() {
        return mdc3;
    }
    
    public int calcularMdc2 (){        
    // https://www.blogcyberini.com/2018/03/algoritmo-de-euclides-implementacoes-e.html
    //Algoritmo de Euclides iterativo

        while(numero2 != 0){
            int r = (int) (numero1 % numero2);
            numero1 = numero2;
            numero2 = r;
        }
        return (int)numero1;
    }
    
public int calcularMmc2(){
    //https://www.blogcyberini.com/2018/03/algoritmo-para-calcular-o-mmc.html
        while(numero2 != 0){
            int r = (int) (numero1 % numero2);
            numero1 = numero2;
            numero2 = r;
            return (int) numero1;
           
             
        }
         r = (int) (numero1 * (numero2 / numero1));
            e = (int) (numero1 * (numero2 / numero2));
      w= r + e;  
      return w;
    }   
}
