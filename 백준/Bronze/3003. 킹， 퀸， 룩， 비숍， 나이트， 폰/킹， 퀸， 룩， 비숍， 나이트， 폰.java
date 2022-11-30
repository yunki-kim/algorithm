import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        king -= Integer.parseInt(stringTokenizer.nextToken());
        queen -= Integer.parseInt(stringTokenizer.nextToken());
        rook -= Integer.parseInt(stringTokenizer.nextToken());
        bishop -= Integer.parseInt(stringTokenizer.nextToken());
        knight -= Integer.parseInt(stringTokenizer.nextToken());
        pawn -= Integer.parseInt(stringTokenizer.nextToken());

        System.out.print(king + " ");
        System.out.print(queen + " ");
        System.out.print(rook + " ");
        System.out.print(bishop + " ");
        System.out.print(knight + " ");
        System.out.println(pawn);
    }
}