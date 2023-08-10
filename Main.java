import java.util.Scanner;
class Main{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n=s.nextInt();
        System.out.println();
        hanoi h = new hanoi(n);
        System.out.println("It took: "+h.numMoves+" moves to solve the puzzle");


//        h.hanoi(n,1,3,2);
//        System.out.println("It took: "+h.numMoves+" moves to solve the puzzle");
    }
}