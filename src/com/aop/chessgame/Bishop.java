package com.aop.chessgame;
public class Bishop extends Coin {
	  public Bishop(boolean isWhite) {
	    super(CoinType.BISHOP, isWhite);
	  }

	  @Override
	  public boolean canMove(int dest, ChessGame game) {
	    // TODO Auto-generated method stub
	    if (isDiagnalAndFree(getPosition(), dest, game)) {
	      return true;
	    }

	    return false;
	  }
	    private boolean isDiagnalAndFree(int position, int dest, ChessGame game) {
	      int currentRow = getRow(position);
	      int currentColumn = getColumn(position);
	      int destRow = getRow(dest);
	      int destColumn = getColumn(dest);
	      if (Math.abs(currentRow - destRow) == Math.abs(currentColumn - destColumn)) {
	        for (int x = Math.min(currentColumn, destColumn) + 1; x < Math.max(currentColumn, destColumn) - 1; x++) {
	          for (int y = Math.min(currentRow, destRow) + 1; y < Math.max(currentRow, destRow) - 1; y++) {
	            // make sure all are free
	            if (game.getCoin(getIndex(x, y)) != null) {
	              return false;
	            }
	          }
	        }
	        return true;
	      } else {
	        return false;
	      }
	    }
	    
	private int getIndex(int row, int column) {
	  return row * 8 + column;
	}  
	}

