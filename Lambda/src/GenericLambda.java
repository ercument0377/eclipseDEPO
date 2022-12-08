public class GenericLambda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        GenericInterface<String> yazici;
        yazici = (duzKelime) -> {
            String tersKelime = "";
            for (int i = 0; i < duzKelime.length(); i++) {
                tersKelime += duzKelime.charAt(duzKelime.length() - 1 - i);
            }
            return tersKelime;
        };

        GenericInterface<Integer> kare = (sayi1) -> sayi1 * sayi1;

        System.out.println("Girdiginiz sayinin Karesi: " + kare.fonksiyon(12));

        System.out.println("Girdiginiz kelimenin tersi: " + yazici.fonksiyon("Hababam Sinifi"));

    }

    public static void function(GenericInterface<Integer> kare) {

    }

}

@FunctionalInterface
interface GenericInterface<Tur> {
    Tur fonksiyon(Tur parametre);

}
