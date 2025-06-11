package Exercise01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MonogoDbDataServices implements DataServices {

	@Override
	public int[] retriveData() {
		
		return new int[]{11,22,33,44,55};
	}

}
