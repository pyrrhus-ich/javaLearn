package filehandling;

/**
 * Wenn mal wieder unklar ist wo Java die File sucht.
 */

import java.io.File;

public class Ausgeben_wo_Java_Files_sucht {

	public static void main(String[] args) {
		System.out.println( new File( "").getAbsolutePath());

	}

}
