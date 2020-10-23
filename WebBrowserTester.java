package com.xworkz.anonymousclass;

public class WebBrowserTester {
	
	public static void main(String[] args) {

		WebBrowser webBrowser = new WebBrowser() {
			
			@Override
			public void browsers() {
				System.out.println("Browsers are used for accessing information over the internet."
						+ "Some popular web browsers are chrome , mozilla firefox , internet explorer  , etc...");
	
			}
	
			
			@Override
			public void searchEngines() {
				System.out.println("Search engines are used for searching for information."
						+ "Some popular search engines are google,yahoo,etc...");
			
			}
			
			@Override
			public void searchHistory() {
				System.out.println("Viewing and deleting search history");
	
			}
			
	};
	webBrowser.browsers();
	webBrowser.searchEngines();
	webBrowser.searchHistory();
	
	}
}
