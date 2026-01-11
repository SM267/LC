import java.util.*;

class prefixresiduecount {
	public int psc(String s) {
		boolean[] seen = new boolean[26];
		int distinct = 0;
		int prefixsum;
		int count = 0;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			int index = ch - 'a';
			if (!seen[index]) {
				seen[index] = true;
				distinct++;
			}
			prefixsum = i + 1;
			if (distinct == prefixsum % 3) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String n = sc.nextLine();
		prefixresiduecount a = new prefixresiduecount();
		System.out.println(a.psc(n));
	}
}
