package park;

public class ChurrosStore {
	public static void main(String[] args) {
		Churros c1 = new IcecreamChurros();
		Songa sa = new Songa(); // 고객 등장
		sa.buyChurros(c1);
		sa.sayTemp(); // "아이 차가워"
		sa.canTakeout();// "아이스크림이 있어서 포장이 안되네"
		
		Churros c2 = new ChocoChurros();
		sa.buyChurros(c2);
		sa.sayTemp(); // "아이 뜨거워"
		sa.canTakeout();// "초코츄러스는 포장이 되네!"
	}
}