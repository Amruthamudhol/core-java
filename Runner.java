
import java.util.Optional;

public class Runner {

    public static void main(String[] args) {

        OptionalLearner optionalLearner = new OptionalLearner();

        Optional<Long> optional = optionalLearner.getMobileNumber("Ravi");

        if (optional.isPresent())
		{

            Long mobileNumber = optional.get();

            System.out.println("Mobile Number : " + mobileNumber);

        }
		else {

            System.out.println("mobile number not exists");
        }
    }
}