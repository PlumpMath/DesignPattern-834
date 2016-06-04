package dp.actional.Mediator;

import java.util.ArrayList;

public class HouseMediator extends Mediator{

	private ArrayList<Landlord> landlords = new ArrayList<Landlord>();
	private ArrayList<Renter> renters = new ArrayList<Renter>();
	
	public void registerLandlord(Landlord landlord) {
		this.landlords.add(landlord);
	}
	
	public void registerRenter(Renter renter) {
		this.renters.add(renter);
	}
	
	@Override
	public void operation(Person person, String msg) {
		if (person instanceof Renter) {
			for(Landlord landlord : landlords)
				landlord.getMsg(msg);
		} else if (person instanceof Landlord) {
			for(Renter renter : renters)
				renter.getMsg(msg);
		}
	}

}
