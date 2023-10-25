package com.example.androidbootcamp.quiz2;

public class Quiz2Main {

    public static void main(String[] args) {

        //Quiz2 sınıfından nesne oluşturucaz
        Quiz2 quiz2 = new Quiz2();

        System.out.println("----------------------------Km-Mil dönüştürme fonksiyonu------------------------------------------------------------------");


        System.out.println("Mil : "+ quiz2.kmToMilConverter(5.6));

        System.out.println("-----------------------------------Dikdörtgen alan fonksiyonu-----------------------------------------------------------");


        quiz2.rectangleAreaCalculate(8, 10);

        System.out.println("----------------------------------Faktöriyel Hesabı Fonksiyonu------------------------------------------------------------");


        System.out.println("Faktöriyel sonucu : " + quiz2.factorialCalculate(5));

        System.out.println("--------------------------------------Kelime içinde E harfi bulma Fonksiyonu--------------------------------------------------------");

        quiz2.findE("DenEmE");

        System.out.println("--------------------------------------Maaş hesabı--------------------------------------------------------");

        System.out.println("Maaşınız : "+ quiz2.salaryAccount(20));

        System.out.println("-----------------------------------------Otopark Ücreti-----------------------------------------------------");

        System.out.println("Ödenecek Tutar :"+ quiz2.carparkingFee(4));


    }

}
