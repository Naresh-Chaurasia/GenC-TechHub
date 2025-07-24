package com.json.student;

import com.jayway.jsonpath.JsonPath;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentJsonPathReader {

    public static void main(String[] args) {
        try {
            // Read the JSON file in memory of your program.
            File jsonFile = new File("src/test/java/com/json/student/student.json");

            // Read basic student info
            String studentId = JsonPath.read(jsonFile, "$.studentId");
            String firstName = JsonPath.read(jsonFile, "$.firstName");
            String lastName = JsonPath.read(jsonFile, "$.lastName");
            int age = JsonPath.read(jsonFile, "$.age");

            // Read address details
            String city = JsonPath.read(jsonFile, "$.address.city");
            String state = JsonPath.read(jsonFile, "$.address.state");

            // Read course names
            List<String> courseNames = JsonPath.read(jsonFile, "$.courses[*].courseName");

            // Read enrollment status
            boolean isEnrolled = JsonPath.read(jsonFile, "$.isEnrolled");

            // Print extracted values
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Age: " + age);
            System.out.println("City: " + city + ", State: " + state);
            System.out.println("Courses Enrolled: " + courseNames);
            System.out.println("Enrolled: " + isEnrolled);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}