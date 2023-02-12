public class Main {
    public static void main(String[] args) {
        int count = 112; // начальная сумма на счете в рублях
        int addCount = 1236; // сумма пополнения счета в рублях
        int bonus = 0; // количество бонусных рублей
        if (addCount > 0) { //  сумма пополнения была положительная
            if (addCount > 1000) { // более чем на 1000 рублей
                bonus = addCount / 100;
            }
            count = count + bonus + addCount;
            System.out.println("На вашем счёте: " + count + " рублей. " + "Ваш бонус: " + bonus + " рублей.");
        } else {
            System.out.println("Сумма пополнения  может быть только положительной или равна нулю!");
        }
    }
}



