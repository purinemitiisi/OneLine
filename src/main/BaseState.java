package main;

public class BaseState {
	int STR = 0;//strength
	int VIT = 0;//vitality
	int INT = 0;//intelligence
	int RES = 0;//resistance
	int LUK = 0;//luck

	BaseState() {}

	BaseState(int s, int v, int i, int r, int l) {
		STR = s;
		VIT = v;
		INT = i;
		RES = r;
		LUK = l;
	}

}
