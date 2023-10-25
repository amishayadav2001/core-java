package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.model.Country;

public class CountryRegionTest {
	public static void main(String[] args) {
		List<Country> countries = Arrays.asList(
		        new Country("IT", "Italy", 1),
				new Country("JP", "Japan", 3),
				new Country("US", "United States of America", 2), 
				new Country("CA", "Canada", 2),
				new Country("CN", "China", 3), 
				new Country("IN", "India", 3), 
				new Country("AU", "Australia", 3),
				new Country("ZW", "Zimbabwe", 4), 
				new Country("SG", "Singapore", 3),
				new Country("UK", "United Kingdom", 1), 
				new Country("FR", "France", 1), 
				new Country("DE", "Germany", 1),
				new Country("ZM", "Zambia", 4), 
				new Country("EG", "Egypt", 4), 
				new Country("BR", "Brazil", 2),
				new Country("CH", "Switzerland", 1), 
				new Country("NL", "Netherlands", 1),
				new Country("MX", "Mexico", 2), 
				new Country("KW", "Kuwait", 4), 
				new Country("IL", "Israel", 4),
				new Country("DK", "Denmark", 1), 
				new Country("HK", "HongKong", 3), 
				new Country("NG", "Nigeria", 4),
				new Country("AR", "Argentina", 2), 
				new Country("BE", "Belgium", 1));

		Map<Integer, String> regionMap = new HashMap<>();
		regionMap.put(1, "Europe");
		regionMap.put(2, "Americas");
		regionMap.put(3, "Asia");
		regionMap.put(4, "Middle East and Africa");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Region ID: ");
		int regionID = sc.nextInt();

		if (regionMap.containsKey(regionID)) {
			ArrayList<String> countryNames = new ArrayList<>();
			for (Country country : countries) {
				if (country.getRegionId() == regionID) {
					countryNames.add(country.getCountryName());
				}
			}
			System.out.println("Countries in this region are: " + countryNames);
		} else {
			System.out.println("Invalid Region ID");
		}

		Map<String, String> countryCodeMap = new HashMap<>();
		for (Country country : countries) {
			countryCodeMap.put(country.getCountryCode(), country.getCountryName());
		}
		
		System.out.println("Enter the Country Code: ");
		String countryCode = sc.next();

		if (countryCodeMap.containsKey(countryCode)) {
			String countryName = countryCodeMap.get(countryCode);
			System.out.println("Country Name: " + countryName);
		} else {
			System.out.println("Invalid Country Code");
		}
		
		Map<Integer, Integer> regionCountMap = new HashMap<>();
        for (Country country : countries) {
            int regionId = country.getRegionId();
            regionCountMap.put(regionId, regionCountMap.getOrDefault(regionId, 0)+1);
        }

        System.out.println("Enter the Region ID: ");
        int regionId = sc.nextInt();

        if (regionMap.containsKey(regionID)) {
            int countryCount = regionCountMap.getOrDefault(regionID, 0);
            String regionName = regionMap.get(regionID);
            System.out.println("Region: " + regionName);
            System.out.println("Number of Countries: " + countryCount);
        } else {
            System.out.println("Invalid Region ID");
        }
    }
}

