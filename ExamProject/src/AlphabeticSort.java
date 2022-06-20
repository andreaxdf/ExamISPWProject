public class AlphabeticSort {

    private AlphabeticSort() {}

    public static void main(String[] args) {
        String[] list = {"Andrea", "Mario", "Gianmatteo", "Davide"};
        alphabeticSort(list);

        for(String s: list) {
            System.out.println(s);
        }
    }

    public static void alphabeticSort(String[] list) {
        String temp;
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = i + 1; j < list.length; j++) {
                if(list[i].compareTo(list[j]) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}