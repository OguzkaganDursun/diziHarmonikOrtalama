public class Main {
    public static void main(String[] args) {
        //Harmonik ortalama = n / (1/x1 + 1/x2 + 1/x3 + 1/xn)
        //n : dizinin eleman sayısı

        int[] dizi = {1, 25, 35, 14, 18, 9, 64};
        double toplam = 0.0;
        double ortalama = dizi.length / toplam;

        for (int i = 0; i < dizi.length; i++)
        {
            toplam += (1.0 / dizi[i]);
        }
        ortalama = dizi.length / toplam;

        System.out.println("Harmonik Ortalama :" + ortalama);
    }
}
