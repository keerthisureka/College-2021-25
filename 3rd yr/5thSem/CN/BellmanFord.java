import java.util.Scanner;

public class BellmanFord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of vertices: ");
		int num = sc.nextInt();
		int ad[][] = new int[num][num];
		System.out.println("Enter the adjacency matrix: ");
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				ad[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter the source node: ");
		int source = sc.nextInt();
		
		belford(ad, num, source);
	}
	
	private static void belford(int[][] ad, int num, int source) {
		int d[] = new int[num];
		for(int i=0; i<num; i++) {
			d[i] = 999;
		}
		
		d[source] = 0;
		for(int i=0; i<num-1; i++) {
			for(int u=0; u<num; u++) {
				for(int v=0; v<num; v++) {
					if(d[u] != 999) {
						if(d[v] > d[u] + ad[u][v])
							d[v] = d[u] + ad[u][v];
					}
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			System.out.println("Distance of source " + source + " to " + i + " is " + d[i]);
		}
	}
}



/* SAMPLE OUTPUT:
Enter the number of vertices: 4
Enter the adjacency matrix: 
0 2 5 3
2 0 999 1
5 999 0 4
3 1 4 0
Enter the source node: 1
Distance of source 1 to 0 is 2
Distance of source 1 to 1 is 0
Distance of source 1 to 2 is 5
Distance of source 1 to 3 is 1
*/
