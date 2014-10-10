package contests.completed.icpc;

import java.io.*;
import java.util.*;

public class AlfredoPizza
{	
	public void solve() throws IOException 
	{
	  int r = nextInt();
	  int pizza = 1;
	  while (r != 0) {
	   int w = nextInt();
	   int l = nextInt();
	   double diag = Math.pow((long)w * w + (long)l * l, 0.5);
	   if (diag <= 2 * r) {
	     System.out.format("Pizza %d fits on the table.\n", pizza);
	   } else {
	     System.out.format("Pizza %d does not fit on the table.\n", pizza);
	   }
	   pizza++;
	   r = nextInt();
	  }
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
		new AlfredoPizza().run();
	}
}