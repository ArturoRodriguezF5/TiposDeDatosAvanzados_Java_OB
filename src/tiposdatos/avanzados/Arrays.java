package tiposdatos.avanzados;

public class Arrays {
    public static void main(String[] args) {
        int array1[] = new int[5];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        for (int num : array1) {
            System.out.println(num);
        }
        // Array inicializado.
        int array2[] = {5, 4, 3 ,2 ,1, 0, 2, 3, 5};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        // Array bidimiencional
        int arrayBidi[][] = {{1, 2, 3, 4, 5},{1,1,2}};
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
            System.out.println(arrayBidi[i][j]);
            }
        }
    }
}
