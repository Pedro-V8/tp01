package principal;

import java.util.Scanner;

public class Main
{
    public static double maxTemp(double arrmd[]){
        double max = -70;
        for(int i = 0; i < arrmd.length; i++){
            if(arrmd[i] > max){
                max = arrmd[i];
            }
        }
        return max;
    }

    public static double minTemp(double arrmd[]){
        double min = 70;
        for(int i = 0; i < arrmd.length; i++){
            if(arrmd[i] < min){
                min = arrmd[i];
            }
        }
        return min;
    }
    public static double averageTemp(double arrmd[]) {
        double sum = 0;
        double media = 0;
        if(arrmd.length == 31){
            for(int i = 0; i < arrmd.length; i++){
                sum += arrmd[i];
            }
            media = sum / 31;
        }
        if(arrmd.length == 30){
            for(int i = 0; i < arrmd.length; i++){
                sum += arrmd[i];
            }
            media = sum / 30;
        }
        if(arrmd.length == 29){
            for(int i = 0; i < arrmd.length; i++){
                sum += arrmd[i];
            }
            media = sum / 29;
        }
        if(arrmd.length == 28){
            for(int i = 0; i < arrmd.length; i++){
                sum += arrmd[i];
            }
            media = sum / 28;
        }
        return media;
    }
    public static double [] colectTemp(double arrmd[]){
        Scanner ler = new Scanner(System.in);
        double temp;
        for(int i = 0; i < arrmd.length; i++) {
            System.out.print("Digite a temperatura do dia " + (i+1) + ": ");
            temp = ler.nextDouble();
            arrmd[i] = temp;
        }
        return arrmd;
    }
public static void main(String[] args) {
    double[] jan2011 = new double[31];
    double[] fev2011 = new double[28];
    double[] mar2011 = new double[31];
    double[] abr2011 = new double[30];
    double[] mai2011 = new double[31];
    double[] jun2011 = new double[30];
    double[] jul2011 = new double[31];
    double[] ago2011 = new double[31];
    double[] set2011 = new double[30];
    double[] out2011 = new double[31];
    double[] nov2011 = new double[30];
    double[] dez2011 = new double[31];
    double[] jan2012 = new double[31];
    double[] fev2012 = new double[29];
    double[] mar2012 = new double[31];
    double[] abr2012 = new double[30];
    double[] mai2012 = new double[31];
    double[] jun2012 = new double[30];
    double[] jul2012 = new double[31];
    double[] ago2012 = new double[31];
    double[] set2012 = new double[30];
    double[] out2012 = new double[31];
    double[] nov2012 = new double[30];
    double[] dez2012 = new double[31];

    double[] jan2013 = new double[31];
    double[] fev2013 = new double[28];
    double[] mar2013 = new double[31];
    double[] abr2013 = new double[30];
    double[] mai2013 = new double[31];
    double[] jun2013 = new double[30];
    double[] jul2013 = new double[31];
    double[] ago2013 = new double[31];
    double[] set2013 = new double[30];
    double[] out2013 = new double[31];
    double[] nov2013 = new double[30];
    double[] dez2013 = new double[31];

    double[] jan2014 = new double[31];
    double[] fev2014 = new double[28];
    double[] mar2014 = new double[31];
    double[] abr2014 = new double[30];
    double[] mai2014 = new double[31];
    double[] jun2014 = new double[30];
    double[] jul2014 = new double[31];
    double[] ago2014 = new double[31];
    double[] set2014 = new double[30];
    double[] out2014 = new double[31];
    double[] nov2014 = new double[30];
    double[] dez2014 = new double[31];

    double[] jan2015 = new double[31];
    double[] fev2015 = new double[28];
    double[] mar2015 = new double[31];
    double[] abr2015 = new double[30];
    double[] mai2015 = new double[31];
    double[] jun2015 = new double[30];
    double[] jul2015 = new double[31];
    double[] ago2015 = new double[31];
    double[] set2015 = new double[30];
    double[] out2015 = new double[31];
    double[] nov2015 = new double[30];
    double[] dez2015 = new double[31];

    double[] jan2016 = new double[31];
    double[] fev2016 = new double[29];
    double[] mar2016 = new double[31];
    double[] abr2016 = new double[30];
    double[] mai2016 = new double[31];  
    double[] jun2016 = new double[30];
    double[] jul2016 = new double[31];
    double[] ago2016 = new double[31];
    double[] set2016 = new double[30];
    double[] out2016 = new double[31];
    double[] nov2016 = new double[30];
    double[] dez2016 = new double[31];

    double[] jan2017 = new double[31];
    double[] fev2017 = new double[28];
    double[] mar2017 = new double[31];
    double[] abr2017 = new double[30];
    double[] mai2017 = new double[31];
    double[] jun2017 = new double[30];
    double[] jul2017 = new double[31];
    double[] ago2017 = new double[31];
    double[] set2017 = new double[30];
    double[] out2017 = new double[31];
    double[] nov2017 = new double[30];
    double[] dez2017 = new double[31];

    double[] jan2018 = new double[31];
    double[] fev2018 = new double[28];
    double[] mar2018 = new double[31];  
    double[] abr2018 = new double[30];
    double[] mai2018 = new double[31];
    double[] jun2018 = new double[30];
    double[] jul2018 = new double[31];
    double[] ago2018 = new double[31];
    double[] set2018 = new double[30];
    double[] out2018 = new double[31];
    double[] nov2018 = new double[30];
    double[] dez2018 = new double[31];

    double[] jan2019 = new double[31];
    double[] fev2019 = new double[28];
    double[] mar2019 = new double[31];  
    double[] abr2019 = new double[30];  
    double[] mai2019 = new double[31];
    double[] jun2019 = new double[30];
    double[] jul2019 = new double[31];
    double[] ago2019 = new double[31];
    double[] set2019 = new double[30];
    double[] out2019 = new double[31];
    double[] nov2019 = new double[30];
    double[] dez2019 = new double[31];

    double[] jan2020 = new double[31];
    double[] fev2020 = new double[29];
    double[] mar2020 = new double[31];
    double[] abr2020 = new double[30];
    double[] mai2020 = new double[31];
    double[] jun2020 = new double[30];
    double[] jul2020 = new double[31];
    double[] ago2020 = new double[31];
    double[] set2020 = new double[30];
    double[] out2020 = new double[31];
    double[] nov2020 = new double[30];
    double[] dez2020 = new double[31];
    Scanner ler = new Scanner(System.in);
    int ano , mes;
    ano = ler.nextInt();
    mes = ler.nextInt();
    double mediaM;
    double minT , maxT;
    if(ano == 2011 && mes == 1) {
        jan2011 = colectTemp(jan2011);
        mediaM = averageTemp(jan2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 2) {
        fev2011 = colectTemp(fev2011);
        mediaM = averageTemp(fev2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 3) {
        mar2011 = colectTemp(mar2011);
        mediaM = averageTemp(mar2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 4) {
        abr2011 = colectTemp(abr2011);
        mediaM = averageTemp(abr2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 5) {
        mai2011 = colectTemp(mai2011);
        mediaM = averageTemp(mai2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 6) {
        jun2011 = colectTemp(jun2011);
        mediaM = averageTemp(jun2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2011 && mes == 7) {
        jul2011 = colectTemp(jul2011);
        mediaM = averageTemp(jul2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 8) {
        ago2011 = colectTemp(ago2011);
        mediaM = averageTemp(ago2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 9) {
        set2011 = colectTemp(set2011);
        mediaM = averageTemp(set2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 10) {
        out2011 = colectTemp(out2011);
        mediaM = averageTemp(jan2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 11) {
        nov2011 = colectTemp(nov2011);
        mediaM = averageTemp(nov2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2011 && mes == 12) {
        dez2011 = colectTemp(dez2011);
        mediaM = averageTemp(dez2011);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2011);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2011);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
    if(ano == 2012 && mes == 1) {
        jan2012 = colectTemp(jan2012);
        mediaM = averageTemp(jan2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 2) {
        fev2012 = colectTemp(fev2012);
        mediaM = averageTemp(fev2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 3) {
        mar2012 = colectTemp(mar2012);
        mediaM = averageTemp(mar2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 4) {
        abr2012 = colectTemp(abr2012);
        mediaM = averageTemp(abr2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 5) {
        mai2012 = colectTemp(mai2012);
        mediaM = averageTemp(mai2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 6) {
        jun2012 = colectTemp(jun2012);
        mediaM = averageTemp(jun2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2012 && mes == 7) {
        jul2012 = colectTemp(jul2012);
        mediaM = averageTemp(jul2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 8) {
        ago2012 = colectTemp(ago2012);
        mediaM = averageTemp(ago2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 9) {
        set2012 = colectTemp(set2012);
        mediaM = averageTemp(set2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 10) {
        out2012 = colectTemp(out2012);
        mediaM = averageTemp(jan2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 11) {
        nov2012 = colectTemp(nov2012);
        mediaM = averageTemp(nov2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2012 && mes == 12) {
        dez2012 = colectTemp(dez2012);
        mediaM = averageTemp(dez2012);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2012);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2012);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }


    if(ano == 2013 && mes == 1) {
        jan2013 = colectTemp(jan2013);
        mediaM = averageTemp(jan2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 2) {
        fev2013 = colectTemp(fev2013);
        mediaM = averageTemp(fev2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 3) {
        mar2013 = colectTemp(mar2013);
        mediaM = averageTemp(mar2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 4) {
        abr2013 = colectTemp(abr2013);
        mediaM = averageTemp(abr2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 5) {
        mai2013 = colectTemp(mai2013);
        mediaM = averageTemp(mai2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 6) {
        jun2013 = colectTemp(jun2013);
        mediaM = averageTemp(jun2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2013 && mes == 7) {
        jul2012 = colectTemp(jul2013);
        mediaM = averageTemp(jul2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 8) {
        ago2013 = colectTemp(ago2013);
        mediaM = averageTemp(ago2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 9) {
        set2013 = colectTemp(set2013);
        mediaM = averageTemp(set2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 10) {
        out2013 = colectTemp(out2013);
        mediaM = averageTemp(jan2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 11) {
        nov2013 = colectTemp(nov2013);
        mediaM = averageTemp(nov2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2013 && mes == 12) {
        dez2013 = colectTemp(dez2013);
        mediaM = averageTemp(dez2013);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2013);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2013);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }


    if(ano == 2014 && mes == 1) {
        jan2014 = colectTemp(jan2014);
        mediaM = averageTemp(jan2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 2) {
        fev2014 = colectTemp(fev2014);
        mediaM = averageTemp(fev2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 3) {
        mar2014 = colectTemp(mar2014);
        mediaM = averageTemp(mar2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 4) {
        abr2014 = colectTemp(abr2014);
        mediaM = averageTemp(abr2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 5) {
        mai2014 = colectTemp(mai2014);
        mediaM = averageTemp(mai2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 6) {
        jun2014 = colectTemp(jun2014);
        mediaM = averageTemp(jun2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2014 && mes == 7) {
        jul2014 = colectTemp(jul2014);
        mediaM = averageTemp(jul2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 8) {
        ago2014 = colectTemp(ago2014);
        mediaM = averageTemp(ago2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 9) {
        set2014 = colectTemp(set2014);
        mediaM = averageTemp(set2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 10) {
        out2014 = colectTemp(out2014);
        mediaM = averageTemp(jan2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 11) {
        nov2014 = colectTemp(nov2014);
        mediaM = averageTemp(nov2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2014 && mes == 12) {
        dez2014 = colectTemp(dez2014);
        mediaM = averageTemp(dez2014);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2014);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2014);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
    
    if(ano == 2015 && mes == 1) {
        jan2015 = colectTemp(jan2015);
        mediaM = averageTemp(jan2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 2) {
        fev2015 = colectTemp(fev2015);
        mediaM = averageTemp(fev2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 3) {
        mar2015 = colectTemp(mar2015);
        mediaM = averageTemp(mar2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 4) {
        abr2015 = colectTemp(abr2015);
        mediaM = averageTemp(abr2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 5) {
        mai2015 = colectTemp(mai2015);
        mediaM = averageTemp(mai2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 6) {
        jun2015 = colectTemp(jun2015);
        mediaM = averageTemp(jun2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2015 && mes == 7) {
        jul2015 = colectTemp(jul2015);
        mediaM = averageTemp(jul2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 8) {
        ago2015 = colectTemp(ago2015);
        mediaM = averageTemp(ago2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 9) {
        set2015 = colectTemp(set2015);
        mediaM = averageTemp(set2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 10) {
        out2015 = colectTemp(out2015);
        mediaM = averageTemp(jan2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 11) {
        nov2015 = colectTemp(nov2015);
        mediaM = averageTemp(nov2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2015 && mes == 12) {
        dez2015 = colectTemp(dez2015);
        mediaM = averageTemp(dez2015);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2015);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2015);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
    
    if(ano == 2016 && mes == 1) {
        jan2016 = colectTemp(jan2016);
        mediaM = averageTemp(jan2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 2) {
        fev2016 = colectTemp(fev2016);
        mediaM = averageTemp(fev2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 3) {
        mar2016 = colectTemp(mar2016);
        mediaM = averageTemp(mar2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 4) {
        abr2016 = colectTemp(abr2016);
        mediaM = averageTemp(abr2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 5) {
        mai2016 = colectTemp(mai2016);
        mediaM = averageTemp(mai2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 6) {
        jun2016 = colectTemp(jun2016);
        mediaM = averageTemp(jun2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2016 && mes == 7) {
        jul2016 = colectTemp(jul2016);
        mediaM = averageTemp(jul2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 8) {
        ago2016 = colectTemp(ago2016);
        mediaM = averageTemp(ago2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 9) {
        set2016 = colectTemp(set2016);
        mediaM = averageTemp(set2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 10) {
        out2016 = colectTemp(out2016);
        mediaM = averageTemp(jan2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 11) {
        nov2016 = colectTemp(nov2016);
        mediaM = averageTemp(nov2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2016 && mes == 12) {
        dez2016 = colectTemp(dez2016);
        mediaM = averageTemp(dez2016);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2016);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2016);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    

    if(ano == 2017 && mes == 1) {
        jan2017 = colectTemp(jan2017);
        mediaM = averageTemp(jan2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 2) {
        fev2017 = colectTemp(fev2017);
        mediaM = averageTemp(fev2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 3) {
        mar2017 = colectTemp(mar2017);
        mediaM = averageTemp(mar2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 4) {
        abr2017 = colectTemp(abr2017);
        mediaM = averageTemp(abr2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 5) {
        mai2017 = colectTemp(mai2017);
        mediaM = averageTemp(mai2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 6) {
        jun2017 = colectTemp(jun2017);
        mediaM = averageTemp(jun2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2017 && mes == 7) {
        jul2017 = colectTemp(jul2017);
        mediaM = averageTemp(jul2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 8) {
        ago2017 = colectTemp(ago2017);
        mediaM = averageTemp(ago2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 9) {
        set2017 = colectTemp(set2017);
        mediaM = averageTemp(set2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 10) {
        out2017 = colectTemp(out2017);
        mediaM = averageTemp(jan2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 11) {
        nov2017 = colectTemp(nov2017);
        mediaM = averageTemp(nov2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2017 && mes == 12) {
        dez2017 = colectTemp(dez2017);
        mediaM = averageTemp(dez2017);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2017);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2017);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
    
    if(ano == 2018 && mes == 1) {
        jan2018 = colectTemp(jan2018);
        mediaM = averageTemp(jan2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 2) {
        fev2018 = colectTemp(fev2018);
        mediaM = averageTemp(fev2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 3) {
        mar2018 = colectTemp(mar2018);
        mediaM = averageTemp(mar2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 4) {
        abr2018 = colectTemp(abr2018);
        mediaM = averageTemp(abr2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 5) {
        mai2018 = colectTemp(mai2018);
        mediaM = averageTemp(mai2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 6) {
        jun2018 = colectTemp(jun2018);
        mediaM = averageTemp(jun2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2018 && mes == 7) {
        jul2018 = colectTemp(jul2018);
        mediaM = averageTemp(jul2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 8) {
        ago2018 = colectTemp(ago2018);
        mediaM = averageTemp(ago2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 9) {
        set2018 = colectTemp(set2018);
        mediaM = averageTemp(set2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 10) {
        out2018 = colectTemp(out2018);
        mediaM = averageTemp(jan2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 11) {
        nov2018 = colectTemp(nov2018);
        mediaM = averageTemp(nov2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2018 && mes == 12) {
        dez2018 = colectTemp(dez2018);
        mediaM = averageTemp(dez2018);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2018);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2018);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
    if(ano == 2019 && mes == 1) {
        jan2019 = colectTemp(jan2019);
        mediaM = averageTemp(jan2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 2) {
        fev2019 = colectTemp(fev2019);
        mediaM = averageTemp(fev2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 3) {
        mar2019 = colectTemp(mar2019);
        mediaM = averageTemp(mar2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 4) {
        abr2019 = colectTemp(abr2019);
        mediaM = averageTemp(abr2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 5) {
        mai2019 = colectTemp(mai2019);
        mediaM = averageTemp(mai2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 6) {
        jun2019 = colectTemp(jun2019);
        mediaM = averageTemp(jun2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2019 && mes == 7) {
        jul2019 = colectTemp(jul2019);
        mediaM = averageTemp(jul2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 8) {
        ago2019 = colectTemp(ago2019);
        mediaM = averageTemp(ago2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 9) {
        set2019 = colectTemp(set2019);
        mediaM = averageTemp(set2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 10) {
        out2019 = colectTemp(out2019);
        mediaM = averageTemp(jan2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 11) {
        nov2019 = colectTemp(nov2019);
        mediaM = averageTemp(nov2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2019 && mes == 12) {
        dez2019 = colectTemp(dez2019);
        mediaM = averageTemp(dez2019);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2019);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2019);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    

    if(ano == 2020 && mes == 1) {
        jan2020 = colectTemp(jan2020);
        mediaM = averageTemp(jan2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jan2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jan2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 2) {
        fev2020 = colectTemp(fev2020);
        mediaM = averageTemp(fev2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(fev2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(fev2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 3) {
        mar2019 = colectTemp(mar2020);
        mediaM = averageTemp(mar2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mar2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mar2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 4) {
        abr2020 = colectTemp(abr2020);
        mediaM = averageTemp(abr2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(abr2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(abr2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 5) {
        mai2020 = colectTemp(mai2020);
        mediaM = averageTemp(mai2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(mai2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(mai2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 6) {
        jun2020 = colectTemp(jun2020);
        mediaM = averageTemp(jun2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jun2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jun2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }   
    if(ano == 2020 && mes == 7) {
        jul2020 = colectTemp(jul2020);
        mediaM = averageTemp(jul2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(jul2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(jul2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 8) {
        ago2020 = colectTemp(ago2020);
        mediaM = averageTemp(ago2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(ago2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(ago2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 9) {
        set2020 = colectTemp(set2020);
        mediaM = averageTemp(set2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(set2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(set2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 10) {
        out2020 = colectTemp(out2020);
        mediaM = averageTemp(jan2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(out2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(out2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 11) {
        nov2020 = colectTemp(nov2020);
        mediaM = averageTemp(nov2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(nov2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(nov2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    if(ano == 2020 && mes == 12) {
        dez2020 = colectTemp(dez2020);
        mediaM = averageTemp(dez2020);
        System.out.printf("A média é: %.2f\n", mediaM);
        minT = minTemp(dez2020);
        System.out.printf("A menor temperatura foi: " + minT + "\n");
        maxT = maxTemp(dez2020);
        System.out.printf("A maior temperatura foi: " + maxT + "\n");
    }
    
    
     
    
    
    
}

}
