package main;

import java.util.ArrayList;
import java.util.List;

public class Character {
	BaseState baseState;
	State iniState;
	State equipState;
	State state;

	List<Item> itemList = new ArrayList<Item>();

	Character(int s, int v, int i, int r, int l) {
		baseState = new BaseState(s,v,i,r,l);
		iniState  = new State(baseState);
		equipState = new State();
		state = iniState.copy();
	}

	void stateUpdate() {

	}

	boolean addItem(Item item) {
		if (item.getWeight() <= state.stk) {
			itemList.add(item);
			state.stk -= item.getWeight();
			return true;
		}
		return false;
	}

	void equipItem(EquipItem item) {
		state.add(item.state);
	}
}
