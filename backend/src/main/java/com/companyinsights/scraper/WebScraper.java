package com.companyinsights.scraper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScraper {

    public static String fetchAbout(String companyName) {
        try {
            String url = "https://en.wikipedia.org/wiki/" + companyName.replace(" ", "_");

            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .get();

            for (Element p : doc.select("p")) {
                if (!p.text().isEmpty()) {
                    return p.text();
                }
            }

            return "No description found";

        } catch (Exception e) {
            e.printStackTrace();
            return "Error fetching data";
        }
    }
}