package LoggingWithLombok;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Demo {
	public static void main(String[] args) {
		String variable = "SLF4J Rocks!!!";
		log.error("Printing variable value: {}", variable);

		System.out.println(
				"<--------------------------------------------------------------------------------------------->");

		log.error("An exception occurred!", new Exception("Custom exception"));

		System.out.println(
				"<--------------------------------------------------------------------------------------------->");

		log.error("{}, {}! An exception occurred!", "Hello", "World", new Exception("Custom exception"));

		System.out.println(
				"<--------------------------------------------------------------------------------------------->");

		log.trace("trace log message");
		log.debug("debug log message");
		log.info("info log message");
		log.warn("warn log message");
		log.error("error log message");
	}
}
