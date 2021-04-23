import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReader {
    private int n;
    private int[][] adj;
    private int cnt;

    public FileReader(String path)throws FileNotFoundException {
        File file = new File(path);
        if(!file.isFile()) {
            System.out.println("Error 406 -> Not Acceptable : File Is Not Of Valid Type");
            System.exit(0);
        }
        else {
            Scanner fIn = new Scanner(new File(path));
            n = fIn.nextInt();
            adj = new int[n][n];
            for(int i = 0; i < adj.length; i++) {
                for(int j = 0; j < adj[i].length; j++){
                    adj[i][j] = fIn.nextInt();
                    if(adj[i][j] == 1) { cnt++; }
                }
                if(!isRowEuler()) {
                    System.out.println("Data Entered Appears To Not Be A Euler's Cycle.");
                    System.exit(0);
                }
            }
            System.out.println("Data Entered Appears To Be A Euler's Cycle.");
        }
    }

    public int getN() {
        return n;
    }

    public boolean isRowEuler() {
        return cnt % 2 == 0;
    }
}
