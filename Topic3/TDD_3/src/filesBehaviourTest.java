import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class to prove the File Behaviour
 * @author meli
 *
 */

public class filesBehaviourTest {
	
	FilesManagerBehaviour fileManager;
	@Test
	public void testFirstRun() {
		fileManager= new FilesManagerBehaviour(15);
		assertEquals(0,fileManager.getRecentFilesList().size());
	}
	@Test
	public void testOpenAFileRun(){
		String directorio = System.getProperty("user.dir");  
		System.out.println(directorio);
		try {
			fileManager.OpenAFile(directorio+"/start.txt");
			assertEquals(1,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	@Test
	public void testOpenAnExistingFileRun() {
		String directorio = System.getProperty("user.dir");  
		System.out.println(directorio);
		try {
			fileManager.OpenAFile(directorio+"/start.txt");
			assertEquals(1,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOpenAnotherFileFileRun() {
		String directorio = System.getProperty("user.dir");  
		System.out.println(directorio);
		try {
			fileManager.OpenAFile(directorio+"/start2.txt");
			assertEquals(2,fileManager.getRecentFilesList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
