public class helloWorld {

    public static void main(String[] args) {

        //System.out.println("Hello World!");
        //args é um array que recebe argumentos eneste caso estamos invocando duas posições do array, nos permitindo informar dois dados na hora de executar.
        //System.out.println("Olá " + args[0] + " " + args[1]); 

        String ambiente = args[0];
        //System.out.println(ambiente);

        if(ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        } else if(ambiente.equalsIgnoreCase("TEST")) {
            System.out.print("Executando em TEST");
        } else {
            System.out.println(ambiente);
        }
        
    }
    
}