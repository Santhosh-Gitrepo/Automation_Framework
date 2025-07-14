package TestScripts;

import java.io.IOException;
import Utils.TestLogger;

public class TestScript1
{
public static void main(String[] args) throws IOException, InterruptedException
{
	TestLogger logger = new TestLogger();
	logger.log("Done");
	Thread.sleep(20000);
	logger.log("Hello");
}
}
