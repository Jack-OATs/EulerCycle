import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args)throws FileNotFoundException {
        FileReader fr;

        if(args.length != 1) {
            System.out.println("Error 412 -> Precondition Failed : Invalid Number Of Files");
        }
        else{
            fr = new FileReader(args[0]);
        }

    }
}
