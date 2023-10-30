package patterns.registryLogExamples;

import java.util.LinkedList;
import java.util.List;

public class Logger {
	private final List<ILog> _logs = new LinkedList<ILog>();
	private static Logger _instance;

	private Logger() {
	}

	public static Logger getInstance() {
		if (_instance == null) {
			_instance = new Logger();
		}
		return _instance;
	}

	public void log(String status, String message) {
		Logger self = getInstance();
		for (ILog log : self._logs) {
			try{
				log.log(status, message);
			} catch (Exception ex) {
				self._logs.remove(log);
				throw new Exceptions(ex.getMessage());
			}
		}
	}

	public Logger register(ILog log) {
		Logger self = getInstance();
		for (ILog i : self._logs) {
			if(i == log)  {
				throw new Exceptions("Can not register the same log twice");
			}
		}
		self._logs.add(log);
		return self;
	}

}