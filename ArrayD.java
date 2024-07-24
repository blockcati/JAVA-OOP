
public class ArrayD {
    public ArrayD() {
    }

    public static void main(String[] args) {
        String[][] cars = new String[][]{{"Bmw", "Mustak", "Honda"}, {"Anique", "Uzair", "Saad"}, {"Ali", "Bc", "MC"}};

        for(int i = 0; i < cars.length; ++i) {
            System.out.println();

            for(int j = 0; j < cars[i].length; ++j) {
                System.out.println(cars[i][j] + " ");
            }
        }

    }
}
