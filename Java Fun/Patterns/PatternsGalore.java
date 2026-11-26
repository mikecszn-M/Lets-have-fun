public class PatternsGalore {
	public static void main(String... args) {
		for (int row = 1; row <= 8; row++) {
			for (int column = row; column <= 8; column++) {
				System.out.print(column);
}
		System.out.println();
}
		for (int row = 8; row >= 1; row--) {
			for (int column = row; column <= 8; column++) {
				System.out.print(column);
}
	System.out.println();
}

}
}