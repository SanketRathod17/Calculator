public class Calculator {
    public int Add(String a) {
        String carr[] = a.split(",|/|[|]|//");
        int sum = 0;
        if (a.isEmpty()) {
            return 0;
        } else if (carr.length == 1) {
            return Integer.parseInt(a);
        } else {
            for (int i = 0; i < carr.length; i++) {
                if (Integer.parseInt(carr[i]) > 1000) {

                } else {
                    sum = sum + Integer.parseInt(carr[i]);
                }

            }
            return sum;


        }
    }
}
