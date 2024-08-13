package String;

public class sortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        distplacement(str);
    }

    public static void distplacement(String str) {
        int x1 = 0, y1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            if (dir == 'S') {
                y1 = y1 - 1;
            } else if (dir == 'N') {
                y1 = y1 + 1;
            } else if (dir == 'E') {
                x1 = x1 + 1;
            } else {
                x1 = x1 - 1;
            }
        }
        int x2 = x1 * x1;
        int y2 = y1 * y1;

        System.out.print("Distance Is " + (float) Math.sqrt(x1 + y2));
    }
}
