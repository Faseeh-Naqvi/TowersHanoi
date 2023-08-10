import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        hanoi h = new hanoi();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        System.out.println();
        int n=s.nextInt();

        h.hanoi(n,1,3,2);
        System.out.println("It took: "+h.numMoves+" moves to solve the puzzle");
    }
}