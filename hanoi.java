
class hanoi {


    /**
     * Using stacks actually moving the information.
     */

    /**
    tower tower1 = new tower();
    tower tower2 = new tower();
    tower tower3 = new tower();


    public <E> void Hanoi(int n, int start, int end) {

        tower1.setTowerNum(1);
        tower2.setTowerNum(2);
        tower3.setTowerNum(3);


    if(start==1){//pushes the numbers that represent the blocks in the tower. least at top and greatest at bottom.
        for (int i = n; i>0;i--){
            tower1.push(i);
        }

    }

    if(start==2){//pushes the numbers that represent the blocks in the tower. least at top and greatest at bottom.
        for (int i = n; i>0;i--){
            tower2.push(i);
        }
    }

    if(start==3){//pushes the numbers that represent the blocks in the tower. least at top and greatest at bottom.
        for (int i = n; i>0;i--){
            tower3.push(i);
        }
    }

    move(n,tower1,tower2,tower3);

    }

    public void move(int n, tower start,tower other, tower end){
        String moveList="";

        if(n==1){
            end.push(start.pop());
            moveList= moveList+start.getTowerNum()+"-->"+end.getTowerNum()+" ";
        }


    }


     *\

    /**
     * Using print, just saying what moves to take.
     */

    int numMoves=0;

    public void hanoi(int n, int start,int end, int mid){
        if(n==1){
            System.out.println("Move Disc from "+start+" --> "+end+"\n");
            numMoves++;
        }
        else{
            hanoi((n-1),start,mid,end);
            System.out.println("Move Disc from "+start+" --> "+end+"\n");
            hanoi((n-1),mid,end,start);
            numMoves++;
        }


    }





}