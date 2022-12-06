public class Teste {
    public static void main(String[] args) {
        // Criar Videos 
        Video v[] = new Video[3];
        v[0] = new Video("Python");
        v[1] = new Video("Java");
        v[2] = new Video("JavaScript"); 

        // Criar Inscritos no canal
        Inscritos g[] = new Inscritos[2];
        g[0] = new Inscritos("Edson", 0, "M", "edsonsnunes");
        g[1] = new Inscritos("Erik", 0, "F", "ErikDias");

        // Criar Visuzalições e avaliar videos
        Visualizacao vis[] =  new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);

        //Prints dos videos
        System.out.println("***Video***");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println();

        // Prints dos inscritos
        System.out.println("***Inscritos***");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println();

        // Prints das visualizações
        System.out.println("***Visualizações***");
        System.out.println(vis[0].toString());
        System.out.println();
        System.out.println(vis[1].toString());
    }
}
