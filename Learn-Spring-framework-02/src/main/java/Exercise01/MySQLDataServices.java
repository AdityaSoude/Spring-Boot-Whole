package Exercise01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataServicesq")
public class MySQLDataServices implements DataServices {

	@Override
	public int[] retriveData() {
		
		return new int[]{1,2,3,4,5};
	}

}
