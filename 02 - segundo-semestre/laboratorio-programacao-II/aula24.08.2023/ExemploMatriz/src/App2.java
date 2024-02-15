public class App2 {
    public static void main(String[] args) throws Exception {
        int[][][] teste = new int[3][3][3];
        int c = 0;
        for(int x =0; x < 3;x++){
            System.out.println("");
            for(int y =0; y <3;y++){
                System.out.println("");
                for(int z =0; z<3;z++){
                    teste[x][y][z] = z;
                    System.out.println(teste[x][y][z]);
                    c++;
                }
            }

        }
        System.out.println(c);
    }
}
