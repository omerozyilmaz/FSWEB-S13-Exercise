# FSWEB-S13-Exercise
1-) getFirstAndLastDigitSum isminde bir method yazmanız istenmektedir. Bu metod bir adet int parametre alır.
- Method aldığı int değerin ilk rakamı ile son rakamını toplayıp, toplam değerini geri döndürmelidir.
- Örneğin;
* 1234567 => 7 + 1 = 8
* 45897 => 4 + 7 = 11
* 874521 => 8 + 1 = 9

2-) hasSameLastDigit isminde bir method yazmanız istenmektedir. int tipinde parametreler almalıdır.(2 parametrede alabilir, 3 parametrede, 5 parametrede)
- Methoda gelen parametlerdeki sayılardan herhangi ikisinin son rakamı aynıysa method true dönmeli. Eğer hiçbir parametrenin son rakamı aynı değilse method false dönmelidir.
- Örneğin;
* 12, 23, 35, 16, 17 => false
* 12, 23, 35, 13, 16, 17 => true(13 ve 23 ün son rakamı aynı)
* 10, 87, 23, 44, 56, 90 => true (10 ve 90)

3-) getLargestPrime isminde bir method yazmanız istenmektedir. int tipinde tek bir parametre almalıdır.
- Method gelen parametrenin içerisindeki en büyük asal böleni bulmalı ve bu değeri döndürmelidir.
- Örneğin;
* getLargestPrime(21) => 7(3*7)
* getLargestPrime(217) => 31 (7*31)
* getLargestPrime(45) => 5(3*3*5)
* getLargestPrime(0) => -1(Invalid)
* getLargestPrime(-1) => -1(Invalid)

OOP Intro
- BankAccount isminde bir sınıf oluşturunuz.
- BankAccount sınıfının 5 tane instance variable değeri olmalı.
- accountNumber, accountBalance, customerName, email, password(bu değişkenlerin typeları ne olmalı ?)
- Tüm sınıf değişkenleriniz encapsulation kuralına uygun yazılmalıdır.(Her bir değişken için getter ve setter metodlarını ekleyiniz.)
- BankAccount sınıfı içerisinde 2 tane method tanımlamalısınız. withdraw(para çekme) ve deposit(para yatırma).
- withdraw methodu parametre almalı ve aldığı parametre değerini accountBalance değerinden çıkarmalıdır.(accountBalance kesinlikle 0'dan küçük olamaz)
- withdraw metoduna gelen parametre accountBalance değerinden büyükse kullanıcıya bir uyarı verilmeli(System.out mesajı)
- deposit methodu parametre almalı ve aldığı parametre değerini accountBalance değerine eklemelidir. 

