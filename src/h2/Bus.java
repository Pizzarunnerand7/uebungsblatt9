package h2;

import java.util.ArrayList;

public class Bus {
	ArrayList<Passenger> passengers;
	public Bus() {
		passengers = new ArrayList<>();
	}
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	private void exitBus() {
		for(int i = 0;i<passengers.size();i++) {
			if(passengers.get(i).planned==passengers.get(i).visited) {
				passengers.remove(i);
			}
		}
	}
	public void nextStop(Passenger[] boarding) {
		for (int i=0 ; i<passengers.size();i++) {
			passengers.get(i).visited++;
		}
		exitBus();
		for(int i=0; i<boarding.length;i++) {
			enterBus(boarding[i]);
		}
	}
	public void nextStop() {
		for (int i=0 ; i<passengers.size();i++) {
			passengers.get(i).visited++;
		}
		exitBus();
	}
	public ArrayList<Passenger>  findPassengersWithoutTickets() {
		ArrayList <Passenger>removed=new ArrayList<>();
		for(int i=0;i<passengers.size();i++) {
			if(passengers.get(i).ticket=false) {
				removed.add(passengers.get(i));
				passengers.remove(i);
			}
		}
		return removed;
	}
	public void transferPassengers(Bus otherBus,String[] passengerNames) {
		for(int i=0;i<passengers.size();i++) {
			for(int j=0;j<passengerNames.length;j++) {
				if(passengers.get(i).name==passengerNames[j]) {
					otherBus.passengers.add(passengers.get(i));
					this.passengers.remove(i);
				}
			}
		}
	}
	

}
