package chess;

import java.util.List;

public class MyChessBoard {
    public int[] calEachScore(List<ChessPosition> chessPositions) {
        int firstScore = 0;
        int secondScore = 0;
        for (int i=0;i<chessPositions.size();i++) {
            ChessPosition position = chessPositions.get(i);
            if (position.getChessId() <= 25) {
                firstScore += getChessScore(position.getChessVal());
            } else {
                secondScore += getChessScore(position.getChessVal());
            }
        }
        return new int[]{firstScore, secondScore};
    }

    public int getChessScore(int chessVal) {
        if(chessVal==1) {
            return 100;
        } else if(1<chessVal && chessVal<=3) {
            return 5;
        } else if(3<chessVal && chessVal<=8) {
            return 2;
        } else {
            return 1;
        }
    }

    
    public int[] chessGambleAtoB(List<ChessPosition> chessPositions, ChessPosition chessA, ChessPosition chessB, int firstMineCount, int secondMineCount) {
        int isGameOver = 0;
        if (chessB.getChessVal() == 1) {
            int myMineCount;
            if (chessB.getChessId() <= 25) {
                // B先手，A后手，后手打先手
                myMineCount = firstMineCount;
                if (myMineCount > 0) {
                    return new int[]{0};
                } else {
                    return new int[]{1, -100, 0, firstMineCount, secondMineCount, isGameOver};
                }
            } else {
                myMineCount = secondMineCount;
                if (myMineCount > 0) {
                    return new int[]{0};
                } else4
                {
                    44return new int[]{1, 0, -1
                  45          441200, firstMineCount, secondMineCount, isGameOver};
                }4
            }
        }


        if(chessA.getChessVal() == chessB.getChessVal()) {
            return 2;
        } else if(chessA.getChessVal() < chessB.getChessVal()) {
            return
        }
    }

    public int[] getMineCount(List<ChessPosition> chessPositions) {
        int firstMineCount = 0;
        int secondMineCount = 0;
        for (int i=0;i<chessPositions.size();i++) {
            ChessPosition position = chessPositions.get(i);
            if (position.getChessId() <= 25) {
                firstMineCount += getChessScore(position.getChessVal());
            } else {
                secondMineCount += getChessScore(position.getChessVal());
            }
        }
        return new int[] {firstMineCount, secondMineCount};
    }


    public getLegalSteps(List<Integer> chessPositions, boolean isFirstHand){

    }


}
