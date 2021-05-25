
(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern A        Pattern B  Pattern C    Pattern D
1       	1 2 3 4 5 6       1 	1 2 3 4 5 6
1 2     	1 2 3 4 5       2 1   	  1 2 3 4 5
1 2 3   	1 2 3 4       3 2 1         1 2 3 4
1 2 3 4 	1 2 3       4 3 2 1           1 2 3
1 2 3 4 5 	1 2 	  5 4 3 2 1 	    	    1 2
1 2 3 4 5 6 	1 	6 5 4 3 2 1 	            1


SOLUTION

	public class Main
	{
	public static void main(String[] args) {
    System.out.println("Pattern A");
    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
	System.out.println("Pattern B");
    for (int i = 1; i <= 6; i++) {
        for (int j = 1; j <= 7 - i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    System.out.println("Pattern C");
    for (int i = 1; i <= 6; i++) {
        for (int k = 1; k <= 6 - i; k++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    System.out.println("Pattern D");
    for (int i = 1; i <= 6; i++) {
        for (int k = i; k > 1; k--) {
            System.out.print("  ");
        }
        for (int j = 1; j <= 7 - i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

	}
