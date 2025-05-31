package com.example;

import org.json.JSONObject;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class API {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String apiKey = "MksqFow96LdSKQkfQq3pnMbByg7MbGlvihVTpjMt";
            System.out.println("--- NASA Astronomy Picture of the Day ---");
            System.out.println("When is your birthday? YYYY-MM-DD"); //https://api.nasa.gov/planetary/apod?api_key=XISnv7hp6NJ3jw7MmXjCdmcfOcxMCRUmrA3uftCz&date=2025-05-19
            String date = scanner.nextLine();

            apiKey = apiKey + "&date=" + date;
            String jsonData = APODFetcher.fetchAPODData(apiKey);

            JSONObject json = new JSONObject(jsonData);
            String title = json.getString("title");
            String explanation = json.getString("explanation");
            String mediaType = json.getString("media_type");
            String url = json.getString("url");

            System.out.println("--- NASA Astronomy Picture of the Day ---");
            System.out.println("Title: " + title);
            System.out.println("Media Type: " + mediaType);
            System.out.println("URL: " + url);
            System.out.println("\nExplanation:\n" + explanation);
            int y1 = Integer.valueOf(date.substring(0, 4));
            int m1 = Integer.valueOf(date.substring(5, 7));
            int d1 = Integer.valueOf(date.substring(8, 10));
            LocalDate today = LocalDate.now();
            System.out.println(y1 + ", "+ m1 + ", "+ d1);
            // int y2 = Integer.valueOf(today.substring(0, 3));
            // int m2 = Integer.valueOf(today.substring(5, 6));
            // int d2 = Integer.valueOf(date.substring(8, 9));
            LocalDate startDate = LocalDate.of(y1, m1, d1);
            LocalDate endDate = LocalDate.now();

            Period period = Period.between(startDate, endDate);

            int years = period.getYears();
            int months = period.getMonths();
            int days = period.getDays();

            System.out.println("Years: " + period.getYears());
            System.out.println("Months: " + period.getMonths());
            System.out.println("Days: " + period.getDays());
            
            
        } catch (Exception e) {
            System.err.println("Failed to fetch APOD: " + e.getMessage());
        }
    }
}