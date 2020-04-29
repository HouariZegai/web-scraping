package com.houarizegai.webscraping.amazon;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonBookScraper {
    public static void main(String[] args) throws IOException {
        String url = "https://www.amazon.com/Best-Sellers-Kindle-Store-Computer-Programming/zgbs/digital-text/156140011";
        Document page = Jsoup.connect(url).userAgent("JSoup scraper").get();

        String bookTitleSelector = "p13n-sc-truncate";
        // Get the books name using the html class selector
        Elements bookElements = page.getElementsByClass(bookTitleSelector);

        List<String> booksTitle = bookElements.stream()
                .map(element -> element.text())
                .collect(Collectors.toList());

        booksTitle.forEach(System.out::println);
    }
}
