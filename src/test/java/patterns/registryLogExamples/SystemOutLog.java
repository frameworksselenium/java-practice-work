package patterns.registryLogExamples;

public class SystemOutLog implements ILog{

	public void log(String status, String message) {
		System.out.println(status + ":" + message);
	}
}
