
//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) 
//and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
//This is a little harder than it looks and can be done without any loops.
public class MakeBricks {
	public static boolean makeBricks(int small, int big, int goal) {
		int bigTotal = big * 5;
		int sumBricks = small + bigTotal;
		int minBig = goal / 5;
		if (small > goal) {
			return true;
		}
		if (goal > sumBricks) {
			return false;
		}
		if ((goal % (minBig * 5)) > small) {
			return false;
		}
		return true;
	}
}
