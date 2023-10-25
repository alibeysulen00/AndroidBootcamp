package com.example.androidbootcamp.quiz2;

public class Quiz2 {
    // 1. Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri döndüren ( return ) bir metot yazdırın.
    // Mile = Km x 0.621


    public Double kmToMilConverter(Double km){
        Double mil;
        Double constant = 0.621;
        mil = km * constant;

        return mil;
    }


    //2. Kenarları parametre olarak girilen ve dikdörtgenin alanını hesaplayan bir metod yazın

    public void rectangleAreaCalculate(int edge1, int edge2){
        int result;
        result = edge1 * edge2;
        System.out.println("Dikdörtgenin Alanı : "+result);
    }

    // 3. Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren(return) metodu yazın

    public int factorialCalculate(int count){
        int factorialResult = 1; // çarpma işleminde 1, etkisiz eleman oalcağı için başlangıç değeri 1 olarak ayarlandı

        if(count == 0){
           factorialResult = 1;
        }
        else {

            for(int i = 1; i<=count; i++){
                factorialResult *= i;
            }
        }

        return factorialResult;


    }


    // 4. Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu gösteren bir metod yazın

    public void findE(String word){
        int count = 0;
        word = word.toLowerCase(); // kelime içinde büyük e harflerinide fazladan işlem yapmadan bulmak için tüm harfleri küçük yaptım
        for(int i = 0; i<word.length(); i++){

            if(word.charAt(i) == 'e'){
                count++;
            }

        }

        System.out.println("Kelime içinde : " +count+ " adet e harfi vardır");


    }


    // 5. Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri döndüren metod yazınız
    // İç açılar toplamı = ((Kenar sayısı - 2 )x180) / Kenar sayısı

    public int interiorAngleCalculate(int edgeCount){
        int interiorAngleResult;
        interiorAngleResult = (((edgeCount - 2) * 180)/edgeCount );

        return interiorAngleResult;
    }


    //6. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod yazınız
    // 1 günde 8 saat çalışılabilir
    // Çalışma saati ücreti : 40 TL
    // Mesai saati ücreti : 80 TL
    //150 saat üzeri mesai sayılır

    public int salaryAccount(int numberOfDays){
        // Maksimum 30 gün hesaplanacak şekilde ayarlama yapıyorum
        int totalPrice;                         // kazanılan toplam para
        int dailyWage = 40;                         // günlük kazanılan para
        int overTime = 80;                          // mesai saat ücreti
        int workingHouseTotal = numberOfDays * 8;   // toplam çalışılan saat
        int overTimeTotalPrice = 0;                 // mesai saatlerinin ücretleri ayrı hesaplanacak

        if(numberOfDays > 30){  // 1 aylık hesaplama yapmak için bir koşul kullandım
            System.out.println("Yalnızca aylık hesaplama yapabilirsiniz");
            return 0;
        }else{

            if(workingHouseTotal <= 150){ // eğer 150 saatten az çalışılmış ise normal ücretten hesaplama yaptım
                System.out.println("Mesaiye kalmadınız, ücretiniz normal saat ücreti ile hesaplanacak");
                totalPrice = workingHouseTotal * dailyWage;

                return totalPrice;

            }
            else{ // eğer 150 saatten fazla ise 150 saati normal ücret ile, kalan saatleri de mesai ücreti ile çarptım
                System.out.println("Mesaiye kaldınız, ücretiniz mesai saatleri göz önüne alınarak hesaplanacak");
                overTimeTotalPrice = (workingHouseTotal - 150) * overTime;
                System.out.println("Mesai yaparak toplamda :  "+ overTimeTotalPrice+ " TL kazandınız"  );
                totalPrice = (150 * dailyWage) + overTimeTotalPrice;

                return totalPrice;
            }

        }

    }

    // 7. Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu yazınız
    // 1 saat = 50 TL
    // 1 saat aşımından sonra her 1 saat 10 TL

    public int carparkingFee(int hour){
        int hourPrice = 50;
        int timeOutPrice = 10;
        int totalPrice = 0;

        if(hour == 1){
            totalPrice = hourPrice;
            return totalPrice;
        } else if (hour > 1) {
            totalPrice = (timeOutPrice * (hour-1)) + hourPrice; // 1. saat için 50 tl ödedeği için zaman aşımı parasını hesaplamak için saat - 1 işlemi yaptım
            System.out.println("1 saatten fazla kaldınız ");
            return totalPrice;
        }
        else {
            System.out.println("Hesaplanamadı");
            return 0;
        }
    }




}
