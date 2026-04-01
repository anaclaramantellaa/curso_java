package dowhile;

public class DoWhile5 {
    public static void main(String[] args){
             int tempo = 200;
             int carro = 0;

             while(carro <= tempo){
                try{
                    Thread.sleep(1000);
                    System.out.println("Acelerando o carro numa velocidade de " + carro );
                    carro++;
                } catch (InterruptedException e){
                    System.out.println("Ops! Houve algum erro..." + e);
                } 
             }
             System.out.println("Fim de viagem!!");
         }
}
