package com.example;

import java.io.IOException;

public class MP3Cutter {
    public static void main(String[] args) throws IOException, InterruptedException {
        String inputFile = "source.mp3";
        String outputFile = "output_cut.mp3";
        String startTime = "00:00:10"; // start at 10 seconds
        String duration = "00:00:20";  // cut 20 seconds

        ProcessBuilder pb = new ProcessBuilder(
            "ffmpeg", "-y", "-i", inputFile, "-ss", startTime, "-t", duration, "-acodec", "copy", outputFile
        );
        pb.inheritIO();
        Process process = pb.start();
        int exitCode = process.waitFor();

        if (exitCode == 0) {
            System.out.println("Cut MP3 saved: " + outputFile);
        } else {
            System.out.println("Error cutting MP3.");
        }
    }
}