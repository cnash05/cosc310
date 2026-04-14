package chapter14;

import java.util.ArrayList;
import java.util.List;
import json.BikeDataReader;
import json.BikeDataRecord;

public class Lab3 {
    public static void main(String[] args) throws Exception {

        ArrayList<BikeDataRecord> allRecords = new ArrayList<>();
        allRecords.addAll(BikeDataReader.parse("json/day1.json"));
        allRecords.addAll(BikeDataReader.parse("json/day2.json"));
        allRecords.addAll(BikeDataReader.parse("json/day3.json"));
        allRecords.addAll(BikeDataReader.parse("json/day4.json"));

        System.out.println("Total records loaded from all 4 days: " + allRecords.size());

        // QUESTION 1: Top 10 highest combined (heartRate × altitude)
       List<BikeDataRecord> sortedCombined = Sorting.mergeSortCombined(allRecords);
        sortedCombined.sort((r1, r2) -> {
            double score1 = r1.getHeartrate() * r1.getAlt();
            double score2 = r2.getHeartrate() * r2.getAlt();
            return Double.compare(score2, score1);  
        });

        System.out.println("\n QUESTION 1: TOP 10 HIGHEST COMBINED (heartRate × altitude)");
        for (int i = 0; i < 10 && i < sortedCombined.size(); i++) {
            System.out.println((i + 1) + ". " + sortedCombined.get(i));
        }

        // QUESTION 2: Heart rate >= 150 bpm
        BikeDataRecord.sortCriteria = 2; 
        List<BikeDataRecord> sortedByHR = Sorting.mergeSort(allRecords);

        // Simple search for high heart rate 
        ArrayList<BikeDataRecord> highHR = Searching.binarySearchHRRange((ArrayList<BikeDataRecord>) sortedByHR, 150);
        for (BikeDataRecord r : sortedByHR) {
            if (r.getHeartrate() >= 150) {
                highHR.add(r);
            }
        }

        System.out.println("\n QUESTION 2: TIMESTAMPS WHERE HEART RATE >= 150 bpm ");
        System.out.println("Total points found: " + highHR.size());
        if (highHR.size() > 0) {
            System.out.println("First 15 matches:");
            for (int i = 0; i < Math.min(15, highHR.size()); i++) {
                System.out.println(highHR.get(i));
            }
        } else {
            System.out.println("No points with heart rate 150 or higher were found in the data.");
        }
    }
}