package ie.cit.caf.assignment1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) {

		try {

			//Parsing the objects from the different files in the 440 folder

			String objectsFile = args[0];
			List<Path> files = FileFinder.getFileList(objectsFile, "*.json");
			for (Path f : files) {
				try {
					ChObject objects = new ObjectMapper().readValue(f.toFile(), ChObject.class);
					System.out.printf("Processing Object file: %s...", objectsFile);
				System.out.println(objects.toString() + "\n");
				} catch (Exception e) {
					System.out.println("Error with: " + f.getFileName());
				}
				
			}
		} 
		catch (JsonParseException e) {
			System.out.println("Error parsing the file.");
		} catch (JsonMappingException e) {
			System.out.println("Error mapping to Java object.");
		} catch (IOException e) {
			System.out.println("Unknown I/O error.");
		}

	}

}

