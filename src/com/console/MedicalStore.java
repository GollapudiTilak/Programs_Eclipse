package com.console;

import java.util.*;

public class MedicalStore {
    static double total = 0;
    static StringBuilder bill = new StringBuilder();

    static void addItem(String item, double price) {
        bill.append(item).append(" - ₹").append(price).append("\n");
    }

    static void addAndPrint(String item, double price) {
        System.out.println(item + " - ₹" + price);
        total += price;
        addItem(item, price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String again;

        System.out.println("====== WELCOME TO APOLLO MEDICAL STORE ======");

        do {
            System.out.println("\nEnter Category (or type exit):");
            System.out.println("Categories: tablets | syrups | personal | baby | health | Hair-Oil");
            String cate = sc.next();

            if (cate.equalsIgnoreCase("exit")) break;

            switch (cate) {

                case "tablets" -> {
                    System.out.println("Select Tablet:");
                    System.out.println(
                    		"paracetamol | dolo | crocin | calpol | combiflam | brufen | aspirin | disprin | " +
                    		"cetirizine | levocetirizine | allegra | montelukast | " +
                    		"azithromycin | amoxicillin | doxycycline | " +
                    		"pantoprazole | omeprazole | ranitidine | " +
                    		"vitamin-c | becosules | zinc | calcium | vitamin-d | " +
                    		"metformin | glimepiride | insulin-tablet | " +
                    		"amlodipine | atenolol | losartan | " +
                    		"thyroxine | iron | folic-acid"
                    		);

                    String tab = sc.next();

                    switch (tab) {

                    // Fever & Pain
                    case "paracetamol" -> addAndPrint("Paracetamol (10 tabs)", 30);
                    case "dolo" -> addAndPrint("Dolo 650", 45);
                    case "crocin" -> addAndPrint("Crocin Tablets", 35);
                    case "calpol" -> addAndPrint("Calpol Tablets", 32);
                    case "combiflam" -> addAndPrint("Combiflam", 50);
                    case "brufen" -> addAndPrint("Brufen", 55);

                    // Allergy
                    case "cetirizine" -> addAndPrint("Cetirizine", 20);
                    case "levocetirizine" -> addAndPrint("Levocetirizine", 25);
                    case "allegra" -> addAndPrint("Allegra", 60);

                    // Antibiotics
                    case "azithromycin" -> addAndPrint("Azithromycin", 120);
                    case "amoxicillin" -> addAndPrint("Amoxicillin", 90);

                    // Acidity
                    case "pantoprazole" -> addAndPrint("Pantoprazole", 70);
                    case "omeprazole" -> addAndPrint("Omeprazole", 65);

                    // Vitamins
                    case "vitamin-c" -> addAndPrint("Vitamin C", 60);
                    case "becosules" -> addAndPrint("Becosules Capsules", 80);
                    case "zinc" -> addAndPrint("Zinc Tablets", 50);
                    case "calcium" -> addAndPrint("Calcium Tablets", 120);
                    case "vitamin-d" -> addAndPrint("Vitamin D3", 90);

                    // Diabetes
                    case "metformin" -> addAndPrint("Metformin", 110);

                    // BP
                    case "amlodipine" -> addAndPrint("Amlodipine", 75);
                    case "atenolol" -> addAndPrint("Atenolol", 65);

                    default -> System.out.println("Tablet not available");
                }
                }

                case "syrups" -> {
                    System.out.println("Select Syrup:");
                    System.out.println("cough | cold | digestion");

                    String syrup = sc.next();

                    switch (syrup) {
                        case "cough" -> addAndPrint("Cough Syrup (100ml)", 95);
                        case "cold" -> addAndPrint("Cold Relief Syrup (100ml)", 90);
                        case "digestion" -> addAndPrint("Digestive Syrup", 110);
                        default -> System.out.println("Syrup not available");
                    }
                }

                case "personal" -> {
                    System.out.println("Select Personal Care:");
                    System.out.println("sanitizer | mask | handwash");

                    String p = sc.next();

                    switch (p) {
                        case "sanitizer" -> addAndPrint("Hand Sanitizer (100ml)", 50);
                        case "mask" -> addAndPrint("Face Mask (Pack of 10)", 80);
                        case "handwash" -> addAndPrint("Dettol Handwash", 120);
                        default -> System.out.println("Item not available");
                    }
                }

                case "baby" -> {
                    System.out.println("Select Baby Care:");
                    System.out.println("diapers | lotion | powder");

                    String baby = sc.next();

                    switch (baby) {
                        case "diapers" -> addAndPrint("Baby Diapers Pack", 350);
                        case "lotion" -> addAndPrint("Baby Lotion", 180);
                        case "powder" -> addAndPrint("Baby Powder", 120);
                        default -> System.out.println("Item not available");
                    }
                }

                case "health" -> {
                    System.out.println("Select Health Item:");
                    System.out.println("thermometer | bp | glucose");

                    String h = sc.next();

                    switch (h) {
                        case "thermometer" -> addAndPrint("Digital Thermometer", 250);
                        case "bp" -> addAndPrint("BP Monitor Machine", 1500);
                        case "glucose" -> addAndPrint("Glucometer", 1200);
                        default -> System.out.println("Item not available");
                    }
                }
                
                case "hair-oil" -> {
                    System.out.println("Select Medical Hair Oil:");
                    System.out.println("keshking | indulekha | bhringraj | amla | neem | onion | parachute-advansed | navratna");

                    String oil = sc.next();

                    switch (oil) {
                        case "keshking" -> addAndPrint("Kesh King Ayurvedic Hair Oil (100ml)", 320);
                        case "indulekha" -> addAndPrint("Indulekha Bringha Hair Oil (100ml)", 420);
                        case "bhringraj" -> addAndPrint("Bhringraj Hair Oil", 180);
                        case "amla" -> addAndPrint("Amla Hair Oil", 150);
                        case "neem" -> addAndPrint("Neem Hair Oil", 160);
                        case "onion" -> addAndPrint("Onion Hair Oil", 220);
                        case "parachute-advansed" -> addAndPrint("Parachute Advanced Ayurvedic Oil", 200);
                        case "navratna" -> addAndPrint("Navratna Cooling Oil", 190);
                        default -> System.out.println("Hair Oil not available");
                    }
                }

                default -> System.out.println("Category not available");
            }

            System.out.println("\nDo you want to continue? (yes/no)");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));

        printBill();
        sc.close();
    }

    static void printBill() {
        System.out.println("\n=========== APOLLO BILL ===========\n");
        System.out.println(bill.toString());
        System.out.println("-----------------------------------");

        double discountRate = 0;

        // Apply Discount Based on Total
        if (total >= 2000) {
            discountRate = 0.18;
        } else if (total >= 1500) {
            discountRate = 0.12;
        } else if (total >= 1000) {
            discountRate = 0.10;
        }

        double discountAmount = total * discountRate;
        double discountedTotal = total - discountAmount;

        double gst = discountedTotal * 0.05;
        double finalAmt = discountedTotal + gst;

        System.out.printf("SUB TOTAL        : ₹%.2f%n", total);
        System.out.printf("DISCOUNT (%.0f%%) : -₹%.2f%n", discountRate * 100, discountAmount);
        System.out.println("-----------------------------------");
        System.out.printf("AFTER DISCOUNT   : ₹%.2f%n", discountedTotal);
        System.out.printf("GST (5%%)         : ₹%.2f%n", gst);
        System.out.println("-----------------------------------");
        System.out.printf("TOTAL            : ₹%.2f%n", finalAmt);
        System.out.println("-----------------------------------");
        System.out.println("THANK YOU! GET WELL SOON 💊");
    }
}