package org.powertac.samplebroker;

import org.powertac.samplebroker.interfaces.Activatable;
import org.powertac.samplebroker.interfaces.BrokerContext;
import org.powertac.samplebroker.interfaces.Initializable;
import org.powertac.samplebroker.interfaces.SkeletonManager;
import org.springframework.stereotype.Service;

@Service
public class SkeletonManagerService implements SkeletonManager, Initializable, Activatable {
	
	private BrokerContext context;
	
	public SkeletonManagerService() {
		super();
	}
	
	@Override
	public void initialize(BrokerContext context) {
		this.context = context;
		// System.out.println("skeleton initialize");
	}
	
	@Override
	public void activate(int timeslot) {
		// System.out.println("skeleton activate, timeslot: " + timeslot);
	}
	
	// Handle a message.
	// The list of message type that can be handled are listed in:
	// https://github.com/powertac/common/tree/master/src/main/java/org/powertac/common
	// The handleMessage method are determine by broker-core at runtime using Java reflection.
	public synchronized void handleMessage (/** TODO(xjiang): the message type and name*/) {
	}
}
