package h2;

public class Passenger {
	public String name;
	public int planned;
	public int visited;
	public boolean ticket;
	public Passenger(String n, boolean t, int p) {
		this.name=n;
		this.ticket=t;
		this.planned=p;
		this.visited = 0;
	}

}
