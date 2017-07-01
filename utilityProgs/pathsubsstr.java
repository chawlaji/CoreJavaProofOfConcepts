package utilityProgs;

public class pathsubsstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String queryPath="ApplicationForm/InternationalPVPApplicationBag/InternationalPVPApplication[2]/ApplicationCategory=Protection&EAS_ATTRIBUTE_SEPARATOR&DUSReportTakeOverRequestIndicator=true&EAS_ATTRIBUTE_SEPARATOR&IPOfficeCode/text()";
		
		int count=0;
		for(int i=0;i<queryPath.length();i++){
			char c = queryPath.charAt(i);
		//	System.out.println(c);
			if (c == '='){
			count=++count;		
			}
		}
		
		System.out.println(count);
		System.out.println(queryPath.indexOf("&"));
		if(count>1){
			if (queryPath.contains("=") && (!queryPath.contains("[xsi:type=") || (queryPath.indexOf("=") != queryPath.lastIndexOf("=")))){
				queryPath = queryPath.substring(0, queryPath.indexOf("&"));
				System.out.println("1");
			}
		}else{
			if (queryPath.contains("=") && (!queryPath.contains("[xsi:type=") || (queryPath.indexOf("=") != queryPath.lastIndexOf("=")))){
				queryPath = queryPath.substring(0, queryPath.indexOf("="));
				System.out.println("2");
			}
		}
		System.out.println(queryPath);*/
		
		/*String path="PotatoCharacteristicItemCategory[xsi:type=USPotatoMarketClassCategoryType]/value=1_yellow flesh tablestock";
	String nestvalue= null;
	nestvalue= path.substring(path.lastIndexOf("=")+1);  
	path = path.substring(0, path.lastIndexOf("]")+1);
		
		System.out.println(1+" "+nestvalue);
		System.out.println(path);*/
	
	String value="USPotatoMarketClassCategoryType]/value=5_russet tablestock";
	String pathnew="/PotatoCharacteristicItemCategory[xsi:type";
	String ValueN[]= null;
	if(value.contains("]/value=")){
		ValueN=value.split("]");
		
	}
	pathnew=pathnew + "=" +ValueN[0] +"]";
	
	
	System.out.println(ValueN[1]);

	System.out.println(pathnew);

	
	}

}
