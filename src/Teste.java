public class Teste {
    public static void main(String[] args) {
        String[] pessoas = new String[5];
        pessoas[0] = "davi";
        pessoas[1] = "bruno";
        pessoas[2] = "marcelo";
        pessoas[3] = "DGDark";
        pessoas[4] = "jeff";

//Percorrer a lista e mostrar a quantidade de itens através do contador
        int contador = 0;
        for (String pessoa : pessoas){
            contador++;
            System.out.println("Item " + contador +":" + pessoa);
        }
        System.out.println(pessoas.length);



    }
}

