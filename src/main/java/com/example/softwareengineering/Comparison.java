/**
 * Softball Statistics Inventory Manager
 * Software to calculate and crunch various softball statistics to streamline the analysis process
 * Comparison.java - Class to handle comparisons between two players
 * Course: Software Engineering
 * Instructor: Dr. Malik
 * Date: November 21, 2021
 * Authors: Thane Class, Alex Diehl, Alex Duke, and Stacey Walters
 */

package com.example.softwareengineering;

public class Comparison {
    double[] stat = new double[10]; //Initializing an array to hold up to ten statistics
    int[] index = new int[10]; //Initialzing an array to hold index

    /**
     * Comparison Constructor Method
     * Constructor for Comparison class
     * @param players - imported players array
     * @param name1 - selected name of player one
     * @param name2 - selected name of player two
     * @param position - selected position to compare
     */
    public Comparison(Player[] players, String name1, String name2, String position) {
        int playerOneID = 0; //Initializing playerIDs to zero
        int playerTwoID = 0;
        int c = 0;
        for (int i = 0; i < players.length; i++) {  //Traverse array of players until player one's name is found, then set ID to playerOneID
            if (players[i].getPersonName().equals(name1)) {
                playerOneID = i;
            }
            if (players[i].getPersonName().equals(name2)) { //Traverse array of players until player two's name is found, then set ID to playerTwoID
                playerTwoID = i;
            }
        }
        if (position.equals("Hitter")) { //Determines if position is hitter
            Hitter hitter1 = (Hitter)players[playerOneID]; //Declares hitter1 and hitter2 as respective players via playerID
            Hitter hitter2 = (Hitter)players[playerTwoID];

            stat[c] = Math.max(hitter1.getStat1B(), hitter2.getStat1B()); //Checks the highest 1B stat
            if (stat[c] == hitter1.getStat1B()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getStat2B(), hitter2.getStat2B()); //Checks highest 2B stat
            if (stat[c] == hitter1.getStat2B()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getStat3B(), hitter2.getStat3B()); //Checks highest 3B stat
            if (stat[c] == hitter1.getStat3B()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getStatHR(), hitter2.getStatHR());  //Checks highest HR stat
            if (stat[c] == hitter1.getStatHR()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getStatBB(), hitter2.getStatBB()); //Checks highest BB stat
            if (stat[c] == hitter1.getStatBB()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(hitter1.getStatK(), hitter2.getStatK()); //Checks lowest K stat
            if (stat[c] == hitter1.getStatK()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getCalcAVG(), hitter2.getCalcAVG()); //Checks highest AVG stat
            if (stat[c] == hitter1.getCalcAVG()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getCalcOBP(), hitter2.getCalcOBP()); //Checks highest OBP stat
            if (stat[c] == hitter1.getCalcOBP()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getCalcOPS(), hitter2.getCalcOPS()); //Checks highest OPS stat
            if (stat[c] == hitter1.getCalcOPS()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(hitter1.getCalcSLG(), hitter2.getCalcSLG()); //Checks highest SLG stat
            if (stat[c] == hitter1.getCalcSLG()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }
        } else { //If not hitter, must be pitcher
            Pitcher pitch1 = (Pitcher)players[playerOneID]; //Declares pitcher by respective playerID
            Pitcher pitch2 = (Pitcher)players[playerTwoID];

            stat[c] = Math.max(pitch1.getStatIp(),pitch2.getStatIp()); //Checks highest IP stat
            if (stat[c] == pitch1.getStatIp()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(pitch1.getStatW(), pitch2.getStatW()); //Checks highest W stat
            if (stat[c] == pitch1.getStatW()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatL(), pitch2.getStatL()); //Checks highest L stat
            if (stat[c] == pitch1.getStatL()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(pitch1.getStatCG(), pitch2.getStatCG()); //Checks highest CG stat
            if (stat[c] == pitch1.getStatCG()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatR(), pitch2.getStatR()); //Checks highest R stat
            if (stat[c] == pitch1.getStatR()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatER(), pitch2.getStatER()); //Checks highest ER stat
            if (stat[c] == pitch1.getStatER()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatB13(), pitch2.getStatB13()); //Checks highest B13 stat
            if (stat[c] == pitch1.getStatB13()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.max(pitch1.getStatK(), pitch2.getStatK()); //Checks highest K stat
            if (stat[c] == pitch1.getStatK()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatHR(), pitch2.getStatHR()); //Chechks highest HR stat
            if (stat[c] == pitch1.getStatHR()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }

            stat[++c] = Math.min(pitch1.getStatH(), pitch2.getStatH()); //Checks highest H stat
            if (stat[c] == pitch1.getStatH()) { //Sets the index as 0 or 1 depending which player has better stat
                index[c] = 0;
            } else {
                index[c] = 1;
            }
        }
    }

    /**
     * GetStatsArray Accessor Method
     * Retrieves the array containing the statistics
     * @return - array of statistics, resperesented as doubles
     */
    public double[] getStatsArray() {
        return stat;
    }

    /**
     * GetIndex Accessor Method
     * Retrieves the current index
     * @return index represented as an integer array
     */
    public int[] getIndex() {
        return index;
    }
}