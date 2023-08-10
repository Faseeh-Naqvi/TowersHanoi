
class hanoi {


    /**
     * Using stacks actually moving the information.
     */


    tower tower1 = new tower();
    tower tower2 = new tower();
    tower tower3 = new tower();
    int start =1;
    int end=3;



    public hanoi(int n) {

        tower1.setTowerNum(1);
        tower2.setTowerNum(2);
        tower3.setTowerNum(3);


    //pushes the numbers that represent the blocks in the tower. least at top and greatest at bottom.
        for (int i = n; i>0;i--){
            tower1.push(i);
        }

    move(n,tower1,tower2,tower3);
    tower1.display();
    tower2.display();
    tower3.display();






    }

    int numMoves=0;
    public void move(int n, tower start,tower other, tower end){

        if(n==1){
            end.push(start.pop());
            //System.out.println("Move Disc from "+start.getTowerNum()+" --> "+end.getTowerNum()+"\n");
            numMoves++;
        }
        else {
            move((n-1),start,end,other);
            end.push(start.pop());
            //System.out.println("Move Disc from "+start.getTowerNum()+" --> "+end.getTowerNum()+"\n");
            numMoves++;
            move((n-1),end,other,start);
        }


    }










    /**
     * Using print, just saying what moves to take.
     */
//    int numMoves=0;
//
//    public void hanoi(int n, int start,int mid, int end){
//        if(n==1){
//            System.out.println("Move Disc from "+start+" --> "+end+"\n");
//            numMoves++;
//        }
//        else{
//            hanoi((n-1),start,end,mid);
//            System.out.println("Move Disc from "+start+" --> "+end+"\n");
//            hanoi((n-1),end,mid,start);
//            numMoves++;
//        }
//
//
//    }
//
//
//


}