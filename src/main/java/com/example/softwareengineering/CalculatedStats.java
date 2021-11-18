/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * CalculatedStats.java - Calculates statistics from various imported statistics for both Pitchers and Hitters
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

import static java.lang.Math.round;

public class CalculatedStats {
    /**
     * CalculateAverage Method
     * Calculates the AVG statistics for a Hitter
     * @param hits - imported hits statistics as a double
     * @param atBats - imported atBats statistics as a double
     * @return - AVG value for a Hitter as a double
     */
    public double calculateAverage(double hits, double atBats) {
        return round((hits / atBats) * 1000.0) / 1000.0;
    }

    /**
     * CalculateOBP Method
     * Calculates the OBP statistic for a Hitter
     * @param hits - imported hits statistic
     * @param walks - imported walks statistic
     * @param hitByPitch - imported hitsByPitch statistic
     * @param atBats - imported atBats statistic
     * @return - OBP value for a Hitter as a double
     */
    public double calculateOBP(double hits, double walks, double hitByPitch, double atBats) {
        return round(((hits + walks + hitByPitch) / (walks + hitByPitch + atBats)) * 1000.0) / 1000.0;
    }

    /**
     * CalculateSLG Method
     * Calculates the SLG statistic for a Hitter
     * @param singles - imported singles statistic
     * @param doubles - imported doubles statistic
     * @param triples - imported triples statistic
     * @param homeruns - imported homeruns statistic
     * @param atBats - imported atBats statistic
     * @return - SLG value for a Hitter as a double
     */
    public double calculateSLG(double singles, double doubles, double triples, double homeruns, double atBats) {
        return round(((singles + doubles*2 + triples*3 + homeruns*4) / atBats) * 1000.0) / 1000.0;
    }

    /**
     * CalculateOPS Method
     * Calculates the OPS value for a Hitter
     * @param singles - imported single statistic
     * @param doubles - imported doubles statstic
     * @param triples - imported triples statistic
     * @param homeruns - imported homeruns statistic
     * @param hits - imported hits statistic
     * @param walks - imported walks statistic
     * @param hitByPitch - imported hitByPitch statistic
     * @param atBats - imported atBats statistic
     * @return - OPS value for a Hitter as a double
     */
    public double calculateOPS(double singles, double doubles, double triples, double homeruns, double hits, double walks, double hitByPitch, double atBats) {
        return(round((calculateOBP(hits, walks, hitByPitch, atBats) + calculateSLG(singles, doubles, triples, homeruns, atBats)) * 1000.0) / 1000.0);
    }

    /**
     * CalculateERA Method
     * Calculates the ERA value for a Pitcher
     * @param earnedRuns - imported earnedRuns statistic
     * @param inningsPitched - imported inningsPitched statistic
     * @return - ERA value for a Pitcher as a double
     */
    public double calculateERA(double earnedRuns, double inningsPitched) {
        return round((earnedRuns / inningsPitched) * 1000.0) / 1000.0;
    }
}
