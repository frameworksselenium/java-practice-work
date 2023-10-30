package patterns.registryLogExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class Log4JLog implements ILog{

	public void log(String status, String message) {
		try {
			long thredID = Thread.currentThread().getId();
			Logger log = Log4JLog.getThreadLogger("11","TC01");
			log.info(thredID +" _ " + status + ":" + message);
		} catch (Exception ex) {
			throw new Exceptions(ex);
		}
	}

	public static Logger getThreadLogger(String str, String tc){

		if(tc.contains(("_")))
		{
			String tcs[]= tc.split("_");
			tc = tcs[0];
		}
		org.apache.log4j.Logger log = Logger.getLogger(tc);
		Properties props=new Properties();
		props.setProperty("log4j.appender.file","org.apache.log4j.DailyRollingFileAppender");
		props.setProperty("log4j.appender.stdout","org.apache.log4j.ConsoleAppender");
		props.setProperty("log4j.appender.file.DatePattern","'.'yyyy-MM-dd");
		props.setProperty("log4j.appender.file.layout","org.apache.log4j.PatternLayout");
		props.setProperty("log4j.appender.file.File",".//target//" + tc+ ".log");
		props.setProperty("log4j.appender.file.layout.ConversionPattern","%p - %d{dd-MM-yyyy HH:mm:ss} - %C{1} - %M - %m%n");
		props.setProperty("log4j.appender.stdout.layout","org.apache.log4j.PatternLayout");
		props.setProperty("log4j.appender.stdout.layout.ConversionPattern","%5p %d{h:mm a}  %M - %m%n");
		props.setProperty("log4j.logger." + tc,"DEBUG, file, stdout");
		PropertyConfigurator.configure(props);
		return log;

	}
}
