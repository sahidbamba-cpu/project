public class Towers {
    private int numDiscs;

    public Towers(int n){
        this.numDiscs= n;

        this.movesDiscs(this.numDiscs, 1,3,2);
    }

    private void  movesDiscs(int num, int fromPeg, int toPeg, int tempPeg){
        if(num > 0){
            movesDiscs(num-1,  fromPeg, tempPeg, toPeg);
            System.out.println("move a disc from peg "+ fromPeg + " toPeg "+ toPeg);

            movesDiscs(num-1, tempPeg, toPeg, fromPeg);
        }
    }
}
