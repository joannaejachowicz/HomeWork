public class Zadanie3petla {
    public static void main(String[] args) {
        int liczbyCalkowite[] = {1, 1, 2, 2, 2, 2, 2, 3, 4, 5, 5, 5, 5, 5, 7, 8, 8, 8, 9, 8};

        int [] tablica10Elementowa = new int[10];
        for(int element:liczbyCalkowite){
            tablica10Elementowa[element - 1] = tablica10Elementowa[element - 1] + 1;
        }

        for (int i=0; i<=9; i++){
            System.out.print("Liczba cyfr " + (i+1) +":");
            System.out.println(tablica10Elementowa[i]);
        }
    }
}
