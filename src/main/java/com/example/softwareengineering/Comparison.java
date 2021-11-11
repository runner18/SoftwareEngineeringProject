package com.example.softwareengineering;

public class Comparison {
    double[] stat = new double[10];
    int[] index = new int[10];

    Comparison(Player[] players, String name1, String name2, String position) {
        int index1 = 0;
        int index2 = 0;
        int c = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getPersonName().equals(name1)) {
                index1 = i;
            }
            if (players[i].getPersonName().equals(name2)) {
                index2 = i;
            }
        }
        if (position.equals("Hitter")) {
            Hitter hitter1 = (Hitter)players[index1];
            Hitter hitter2 = (Hitter)players[index2];
            stat[c] = Math.max(hitter1.getStat1B(), hitter2.getStat1B());
            if(stat[c] == hitter1.getStat1B()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getStat2B(), hitter2.getStat2B());
            if(stat[c] == hitter1.getStat2B()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getStat3B(), hitter2.getStat3B());
            if(stat[c] == hitter1.getStat3B()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getStatHR(), hitter2.getStatHR());
            if(stat[c] == hitter1.getStatHR()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getStatBB(), hitter2.getStatBB());
            if(stat[c] == hitter1.getStatBB()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(hitter1.getStatK(), hitter2.getStatK());
            if(stat[c] == hitter1.getStatK()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getCalcAVG(), hitter2.getCalcAVG());
            if(stat[c] == hitter1.getCalcAVG()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getCalcOBP(), hitter2.getCalcOBP());
            if(stat[c] == hitter1.getCalcOBP()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getCalcOPS(), hitter2.getCalcOPS());
            if(stat[c] == hitter1.getCalcOPS()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(hitter1.getCalcSLG(), hitter2.getCalcSLG());
            if(stat[c] == hitter1.getCalcSLG()){
                index[c] = 0;
            } else {index[c] = 1;}
        }
        else {
            Pitcher pitch1 = (Pitcher)players[index1];
            Pitcher pitch2 = (Pitcher)players[index2];
            stat[c] = Math.max(pitch1.getStatIp(),pitch2.getStatIp());
            if(stat[c] == pitch1.getStatIp()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(pitch1.getStatW(), pitch2.getStatW());
            if(stat[c] == pitch1.getStatW()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatL(), pitch2.getStatL());
            if(stat[c] == pitch1.getStatL()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(pitch1.getStatCG(), pitch2.getStatCG());
            if(stat[c] == pitch1.getStatCG()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatR(), pitch2.getStatR());
            if(stat[c] == pitch1.getStatR()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatER(), pitch2.getStatER());
            if(stat[c] == pitch1.getStatER()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatB13(), pitch2.getStatB13());
            if(stat[c] == pitch1.getStatB13()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.max(pitch1.getStatK(), pitch2.getStatK());
            if(stat[c] == pitch1.getStatK()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatHR(), pitch2.getStatHR());
            if(stat[c] == pitch1.getStatHR()){
                index[c] = 0;
            } else {index[c] = 1;}
            stat[++c] = Math.min(pitch1.getStatH(), pitch2.getStatH());
            if(stat[c] == pitch1.getStatH()){
                index[c] = 0;
            } else {index[c] = 1;}
        }
    }

    public double[] getStatsArray() {
        return stat;
    }

    public int[] getIndex(){
        return index;
    }
}