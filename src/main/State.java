package main;

public class State {
	int hp  = 0; //hit point
	int mp  = 0; //magic point
	int atk = 0;//phisical attack
	int dif = 0;//phisical defence
	int mat = 0;//magical attack
	int mdf = 0;//magical defence
	int stk = 0;//item stock
	int mst = 0;//magick stock

	State() {}

	State(BaseState bst) {
		hp = bst.VIT*10;
		mp = (bst.RES+bst.INT)*10;
		atk = bst.STR;
		mat = bst.INT;
		stk = bst.STR+bst.VIT;
		mst = bst.RES;
	}

	State copy() {
		State res = new State();
		res.hp  = hp;
		res.mp  = mp;
		res.atk = atk;
		res.dif = dif;
		res.mat = mat;
		res.mdf = mdf;
		res.stk = stk;
		res.mst = mst;
		return res;
	}

	void add(State st) {
		this.hp  += st.hp;
		this.mp  += st.mp;
		this.atk += st.atk;
		this.dif += st.dif;
		this.mat += st.mat;
		this.mdf += st.mdf;
		this.stk += st.stk;
		this.mst += st.mst;
	}

}
