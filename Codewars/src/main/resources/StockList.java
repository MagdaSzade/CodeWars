
public class StockList {
	// 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
			String result = "";
			if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) {
				return "";
			}
			for (String category : lstOf1stLetter) {
				int sum = 0;
				for (String element : lstOfArt) {
					String firstLetter = element.substring(0,1);
					if (category.equals(firstLetter)) {
						int index = element.indexOf(" ");
						String quantity = element.substring(index + 1);
						try {
							sum += Integer.parseInt(quantity);
						} 
						catch (NumberFormatException e) {
						}
					}
				}
				if (result.contentEquals("")) {
					result += "(" + category + " : " + sum + ")";
				} else {
					result += " - (" + category + " : " + sum + ")";	
				}
			}
			return result;
		}
}
