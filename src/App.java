public class App {
    public static void main(String[] args) throws Exception {
        // Videos 
        Video v[] = new Video[3];
        v[0] = new Video("Python 3");
        v[1] = new Video("Java");
        v[2] = new Video("JavaScript 3"); 

        // Inscritos 
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Edson", 0, "M", "edsonsnunes");
        g[1] = new Gafanhoto("Erik", 0, "F", "ErikDias");

        //Visuzalição 
        Visualizacao vis[] =  new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);


        // System.out.println(v[0].toString());
        // System.out.println(g[1].toString());
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
