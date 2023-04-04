// Using continue with a label.
class ContinueLabel {
public static void main(String args[]) {
outer: for (int i=1; i<5; i++) {
	for(int j=1; j<5; j++) {
		if(j > i) {
			System.out.println();
			continue outer;
		}
		System.out.print(" " + (i * j));
	}
}


}
}
