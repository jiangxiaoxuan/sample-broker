package org.powertac.samplebroker;

import org.powertac.samplebroker.interfaces.Activatable;
import org.powertac.samplebroker.interfaces.BrokerContext;
import org.powertac.samplebroker.interfaces.DynamicPricingManager;
import org.powertac.samplebroker.interfaces.Initializable;
import org.springframework.stereotype.Service;

@Service
public class DynamicPricingManagerService implements DynamicPricingManager, Initializable, Activatable {
	
	private BrokerContext context;
	
	public DynamicPricingManagerService() {
		super();
	}
	
	@Override
	public void initialize(BrokerContext context) {
		this.context = context;
		System.out.println("dynamic initialize");
	}
	
	@Override
	public void activate(int timeslot) {
		System.out.println("dynamic activate, timeslot: " + timeslot);
	}
}
