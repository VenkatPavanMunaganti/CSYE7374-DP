package edu.neu.csye7374;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum CarCategory {
    Sports,
    SUV,
    Sedan,
    MiniVan,
    Limo;

    public static List<String> getBikeCategoryList() {

        return Stream.of(CarCategory.values()).map(CarCategory::name).collect(Collectors.toList());
    }

    public static String[] getBikeCategoryArray() {
        return Arrays.stream(CarCategory.values()).map(CarCategory::name).toArray(String[]::new);
    }

    public static CarCategory getCarCategory(String s) {
        CarCategory result = null;
        switch (s.toLowerCase()) {
            case "suv":
                result = CarCategory.SUV;
                break;
            case "sports":
                result = CarCategory.Sports;
                break;
            case "minivan":
                result = CarCategory.MiniVan;
                break;
            case "limo":
                result = CarCategory.Limo;
                break;
            default:
                result = CarCategory.Sedan;
                break;
        }
        return result;
    }
}
