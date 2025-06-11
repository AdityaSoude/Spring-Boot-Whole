package Exercise01;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BussinessCalculationService {
	DataServices dataService;
	
	
	
	public BussinessCalculationService(@Qualifier("MySQLDataServicesq") DataServices dataService) {
		super();
		//System.out.println("This is already intialized");
		this.dataService = dataService;
	}



	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
	
	
}
