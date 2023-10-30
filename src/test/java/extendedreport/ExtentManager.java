package extendedreport;

public class ExtentManager {

	private ExtentLog _log;

	private ExtentManager(){}

	private static final ExtentManager _instance =new ExtentManager();

	public static extendedreport.ExtentLog init(String fileName){
		if(_instance._log==null){
			_instance._log = new extendedreport.ExtentLog(fileName);
			String ss ="true";
			if(ss.equalsIgnoreCase("true")){
				_instance._log.captureScreenshots("FAIL");
			}
		}
		return _instance._log;
	}
	
	public static extendedreport.ExtentLog init(){

		return _instance._log;
	}
}
