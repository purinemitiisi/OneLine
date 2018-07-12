package main;

public class Player {
	Character chara;

	Player(int s, int v, int i, int r, int l) {
		chara = new Character(s,v,i,r,l);
	}

	boolean equip(EquipItem item) {
		return true;
	}


}
