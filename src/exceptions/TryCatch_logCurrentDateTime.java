package exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class TryCatch_logCurrentDateTime {
	
	public static void logExecutedProgram()/* throws IOException */{
		String content = System.getProperty("sun.java.command") + "started at"
				+ LocalDateTime.now() + "\n";
		try {
			Files.writeString(Path.of("executed_programs.txt"), content, StandardOpenOption.APPEND);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Exception behandelt. Jetzt geht es weiter");
		
	}// logExecutedProgram
	
	public static void main(String[] args) {
		logExecutedProgram();
	}

}//logCurrentDateTime
