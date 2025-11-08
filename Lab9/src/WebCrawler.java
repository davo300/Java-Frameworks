import java.util.Scanner;
import java.util.ArrayList;
import java.net.URL;
import java.io.*;
import java.net.MalformedURLException;


public class WebCrawler {
	public static void main(String[] args) {
		// Write a main method that reads a URL from the user and passes it to crawler method.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String URL = input.nextLine();
		input.close();
		crawler(URL);
	}
	/**
	 *
	 * @param startingURL: the starting URL that you want to crawl.
	 *
	 */
	public static void crawler(String startingURL) {
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();

		listOfPendingURLs.add(startingURL);

		while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {

			String urlString = listOfPendingURLs.remove(0);
			listOfTraversedURLs.add(urlString);
			System.out.println("Crawl " + urlString);

			ArrayList<String> subURL = getSubURLs(urlString);
			for (String s : subURL) {
				if (!listOfTraversedURLs.contains(s) && !listOfPendingURLs.contains(s))
					listOfPendingURLs.add(s);
			}
		}
    System.out.println("The number of traversed URLs is: "+ listOfTraversedURLs.size());

		System.out.println("The number of pending URLs is: "+listOfPendingURLs.size());


	}
	/**
	 *
	 * @param urlString: input URL for which you want the get the subURLs. The
	 * method will read the URL file, look for any texts starting with http: and
	 * ends with \ and put it in the arraylist.
	 * @return arraylist of URL mentioned in the file.
	 */

	public static ArrayList<String> getSubURLs(String urlString) {
		ArrayList<String> list = new ArrayList<>();

       //finish this method as described in the instructions
		try {
		URL u = new URL(urlString);
		Scanner input = new Scanner(u.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						list.add(line.substring(current, endIndex));
						current = line.indexOf("http", endIndex);
					} else
						current = -1;
				}
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.print("Invalid URl\n");
		} catch(IOException e) {
			System.out.print("Input/Output error\n");
		} catch (Exception e) {
			System.out.print("Some other error\n");
		}
	
		
		
	return list;
	}
}
