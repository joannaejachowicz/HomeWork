public class Zadanie1petla {
    public static void main(String[] args) {
        String revert = "JOANNA";
        char[] w = revert.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i= revert.length()-1; i>=0;i--){
            sb.append(w[i]);
        }

        System.out.println(sb.toString());

    }
}
