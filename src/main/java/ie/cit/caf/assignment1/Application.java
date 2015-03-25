package ie.cit.caf.assignment1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args)
	{
String chObjectFile = args [0];

System.out.printf("Processing Object file %s...\n",chObjectFile);


try {ChObject chObject = new ObjectMapper().readValue(new File(chObjectFile), ChObject.class);
		

System.out.println("\n"+chObject.toString());
}
catch(JsonParseException e) {
System.out.println("Error parsing the file.");
}
catch (JsonMappingException e) {
System.out.println("Error mapping to Java object.");
}
catch(IOException e) {
System.out.println("Unknown I/O error.");
}}
	

public void run(String... args) throws Exception {
setupDb(args[0]);

String objectsDirectory = args[1];

createIndexes();
//process artists
List<Path> files = FileFinder.getFileList(objectsDirectory, "*.json");
for (Path f : files) {
ChObject chobject = new ObjectMapper().readValue(f.toFile(), ChObject.class);
}}


private void createIndexes() {
	// TODO Auto-generated method stub
	
}


private void setupDb(String string) {
	// TODO Auto-generated method stub
	
	
}}