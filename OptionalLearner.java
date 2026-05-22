
import java.util.Optional;

public class OptionalLearner {

    public Optional<Long> getMobileNumber(String name)
	{

        System.out.println("running getMobileNumber");

        if (name != null) 
		{

            if ("Ravi".equalsIgnoreCase(name))
			{

                return Optional.of(9988776655L);

            } 
			else if ("Anu".equalsIgnoreCase(name)) 
			{

                return Optional.of(8877665544L);
            }
        }

        return Optional.empty();
    }
}