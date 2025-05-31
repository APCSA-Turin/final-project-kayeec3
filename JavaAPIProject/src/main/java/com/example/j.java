// package com.example;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.Scanner;

// import org.json.JSONObject;

// import java.io.IOException;
// import java.io.FileReader;
// import java.io.FileWriter;

// public class API {
//     public static String getData(String apiKey) throws Exception {
//              Scanner scanner = new Scanner(System.in);
//             String apiKey = "MksqFow96LdSKQkfQq3pnMbByg7MbGlvihVTpjMt";
//             System.out.println("--- NASA Astronomy Picture of the Day ---");
//             System.out.println("When is your birthday? YYYY-MM-DD"); //https://api.nasa.gov/planetary/apod?api_key=XISnv7hp6NJ3jw7MmXjCdmcfOcxMCRUmrA3uftCz&date=2025-05-19
//             String date = scanner.nextLine();
//             apiKey = apiKey + "&date=" + date ;
//             String jsonData = APODFetcher.fetchAPODData(apiKey);

//             JSONObject json = new JSONObject(jsonData);
//             String title = json.getString("title");
//             String explanation = json.getString("explanation");
//             String mediaType = json.getString("media_type");
//             String url = json.getString("url");

//             System.out.println("--- NASA Astronomy Picture of the Day ---");
//             System.out.println("Title: " + title);
//             System.out.println("Media Type: " + mediaType);
//             System.out.println("URL: " + url);
//             System.out.println("\nExplanation:\n" + explanation);
//     }

// public static void FileLoader() {
//         try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);  // Print each line to the console
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

// public static void FileSaver() {
//         saveData("this is test ");
//     }
//     public static void saveData(String data) {
//         try (FileWriter writer = new FileWriter("output.txt")) {
//             writer.write(data);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
