
package boletin4_1;

public class Coche {
    //atributos
    private int velocidade;
    //constructores
    public Coche(){
        velocidade=0;
    }
    public Coche (int vel){
        velocidade=vel;
    }
    //metodos de acceso
    public int getvelocidade(){
        return velocidade;
    }
    public void setvelocidade(int vel){
        velocidade=vel;
    }
    public void acelerar (int valor){
        int acelerar = velocidade+valor;
        System.out.println("acelerar = "+(velocidade+valor));
    }
    public void frenar(int menos){
        int frenar = velocidade-menos;
        System.out.println("frenar = "+(velocidade-menos));
    }
        
}

