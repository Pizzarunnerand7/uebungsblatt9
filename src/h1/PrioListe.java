package h1;

import java.util.ArrayList;

public class PrioListe {
	private ArrayList<Patient>myList = new ArrayList<>();
	public void addPatient(Patient p) {
		if(myList.size()==0) {
			myList.add(p);
		}
		else {
			for(int i = 0; i>myList.size(); i++) {
				if(myList.get(i).prio < p.prio) {
					myList.add(i,p);
				}
				else {
					myList.add(p);
				}
			}
		}
	}
	public Patient getNextPatient() {
		Patient p = myList.get(0);
		myList.remove(0);
		return p;
	}
	public int getPosition(Patient p) {
		for(int i=0; i<myList.size(); i++) {
			if(myList.get(i)==p) {
				return i;
			}
		}
		return -1;
	}

}
