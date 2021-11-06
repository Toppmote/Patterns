import multiton.Configuration;
import multiton.ConfigurationType;
import org.junit.jupiter.api.Test;

public class TestMultiton {

    @Test
    void testMultiton() {
        System.out.println("-----------MULTITON TEST-----------");
        Configuration testConfiguration = Configuration
                .getInstance(ConfigurationType.TEST_CONFIGURATION);
        Configuration anotherTestConfiguration = Configuration
                .getInstance(ConfigurationType.TEST_CONFIGURATION);
        if (testConfiguration == anotherTestConfiguration)
            System.out.println("Test Configurations are the same!");
        else
            System.out.println("Test configurations are different");
        System.out.println();

        Configuration enterpriseConfiguration = Configuration
                .getInstance(ConfigurationType.ENTERPRISE_CONFIGURATION);
        Configuration anotherEnterpriseConfiguration = Configuration
                .getInstance(ConfigurationType.ENTERPRISE_CONFIGURATION);
        if (enterpriseConfiguration == anotherEnterpriseConfiguration)
            System.out.println("Enterprise Configurations are the same!");
        else
            System.out.println("Enterprise configurations are different");
        System.out.println();

        Configuration trialConfiguration = Configuration
                .getInstance(ConfigurationType.TRIAL_CONFIGURATION);
        Configuration anotherTrialConfiguration = Configuration
                .getInstance(ConfigurationType.TRIAL_CONFIGURATION);
        if (trialConfiguration == anotherTrialConfiguration)
            System.out.println("Trial Configurations are the same!");
        else
            System.out.println("Trial configurations are different");
        System.out.println("-----------------------------------");
    }

}
