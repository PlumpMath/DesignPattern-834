package dp.actional.Mediator;

public class MediatorMain {

	public static void main(String[] args) {
		HouseMediator mediator = new HouseMediator();
		Landlord landlord1 = new Landlord("zhang san", mediator);
		Landlord landlord2 = new Landlord("wang wu", mediator);
		
		Renter renter1 = new Renter("zhao liu", mediator);
		Renter renter2 = new Renter("qin qi", mediator);
		
		mediator.registerLandlord(landlord1);
		mediator.registerLandlord(landlord2);
		mediator.registerRenter(renter1);
		mediator.registerRenter(renter2);
		
		landlord1.sendMsg("msg1");
		landlord2.sendMsg("msg2");
		renter1.sendMsg("msg3");
		renter2.sendMsg("msg4");
	}

}
