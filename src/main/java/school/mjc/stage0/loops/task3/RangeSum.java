package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        if(firstBoarder > 0 && secondBoarder > 0){
            for(int i = firstBoarder; i <= secondBoarder; i++){
            System.out.println(i);
            }
        } else {
            System.out.println(0);
        }
    }
}
