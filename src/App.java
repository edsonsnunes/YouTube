public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("teste 1");
        v[1] = new Video("teste 2");
        v[2] = new Video("teste 3"); 

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Edson", 0, "M", "edsonsnunes");
        g[1] = new Gafanhoto("Erik", 0, "F", "ErikDias");


        System.out.println(v[0].toString());
        System.out.println(g[1].toString());
    }
}
