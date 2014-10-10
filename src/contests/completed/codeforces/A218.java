package contests.completed.codeforces;

import java.io.*;
import java.util.*;

public class A218
{	
	public void solve() throws IOException 
	{
		int n = nextInt();
		int k = nextInt();
		
		int[] counts = new int[k];
		for(int x = 0; x < n; x++)
			counts[x % k] += 2 - nextInt();
		
		int change = 0;
		for(int x = 0; x < k; x++)
			change += Math.min(counts[x], n / k - counts[x]);
		System.out.println(change);
	}

	public BufferedReader br;
	public StringTokenizer st;
	public PrintWriter out;

	public String nextToken() throws IOException {
		while(st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}

		return st.nextToken();
	}
	
	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	public long nextLong() throws  IOException {
		return Long.parseLong(nextToken());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}

	public void run() throws IOException 
	{	
		boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		oj = true;
		br = new BufferedReader( new InputStreamReader( oj ? System.in : new FileInputStream("input.txt")));
		out = new PrintWriter( oj ? System.out : new FileOutputStream("output.txt"));
		solve();
		out.close();
	}

	public static void main(String[] args) throws IOException 
	{
		new A218().run();
	}
}