import java.util.ArrayList;
import java.util.List;
/**
 * Word Wrapped class
 * @author meli
 *
 */

public class WordWrappedRows {
	private int lenghtRows;
	//private String[] rows;
	private List<String> list= new ArrayList<String>();
	
	public WordWrappedRows(int i) {
		this.lenghtRows=i;
		
	}

	public List<String> getList(String string) {
		System.out.println(string.length()+" longitud de "+ string);
		if (string.length()<lenghtRows){ //string menor que la longitud de row
			list.add(string);
			for(String s:list)
				System.out.println(s);
			System.out.println("size"+list.size());
			
			
		}
		else{
			String[] arrlist = string.split(" ");
			int posString=0;
			int currentlongitud=0;
			int posStart=0;
			if (arrlist[posStart].length()>lenghtRows){ //primer palabra es mas larga que la longitud de row
				int i=0;
				while (i<arrlist[posStart].length()){
					String st= new String();
					while(st.length()<lenghtRows && i<string.length()){
						char charlist = string.charAt(i); 
						st=st+charlist;
						i++;
					}
					list.add(st);
				}
			}else{
				while (posString<arrlist.length){
					while (currentlongitud<lenghtRows && posString<arrlist.length){
						if (arrlist[posString].length()+currentlongitud<=lenghtRows){
							currentlongitud+=arrlist[posString].length()+1;
							posString++;
						}
						else currentlongitud=lenghtRows;
					}
					String st= new String();
					for (int y=posStart;y<posString;y++){
						st= st+arrlist[y];
						if(y!=posString-1){
							st= st+" ";
						}
					}
					list.add(st);
					posStart=posString;
					currentlongitud=0;
				}
			}
		}
		System.out.println("lista ");
		for(String s:list){
			System.out.println(s);
		}
		return list;
		
	}
	
	/*public List<String> getList() {
		return list;

	}*/
	
	
}
