package com.lucasgueiros.ludovicus.generics;

import com.lucasgueiros.ludovicus.items.Item;

public abstract class Sprite extends Drawable {

  private Pair move;

  public void update () {
    super.position = super.position.sum(move);
  }
  public void unmove() {
    super.position = super.position.subtract(move);
  }

	// generated code

	/**
	* Default Sprite constructor
	*/
	public Sprite(Pair position, Pair size, Pair move) {
		super(position,size);
		this.move = move;
	}

	/**
	* Returns value of move
	* @return
	*/
	public Pair getMove() {
		return move;
	}

	/**
	* Sets new value of move
	* @param
	*/
	public void setMove(Pair move) {
		this.move = move;
	}
}
