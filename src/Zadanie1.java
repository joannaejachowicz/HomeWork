public class Zadanie1 {
    public static void main(String[] args) {

        String z ="Joanna";
        char[] w = z.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(w[5]).append(w[4]).append(w[3]).append(w[2]).append(w[1]).append(w[0]);
        System.out.println(sb.toString());



    }

}
