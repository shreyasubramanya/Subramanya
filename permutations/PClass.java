import java.util.ArrayList;

public class PClass {

    public void parse(String start) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int i = 0;

        for (String retval : start.split(",")) {
            numbers.add(Integer.parseInt(retval));
            i++;
        }
        al.add(numbers);

        compile(numbers, al);

        System.out.print(al);
    }

    public void compile(ArrayList<Integer> numbers, ArrayList<ArrayList<Integer>> al) {
        Integer recursecount = numbers.size() - 1;
        second(numbers, recursecount, al);
        for (int i = 0; i < numbers.size(); i++) {

        }

    }

    public void second(ArrayList<Integer> numbers, Integer recursecount, ArrayList<ArrayList<Integer>> al) {
        // al.add(new ArrayList<Integer>());
        for (int outer = 0; outer < numbers.size() - 1; outer++) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < outer + 1; i++) {
                tmp.add(numbers.get(i));

            }
            al.add(tmp);

        }

        flip(numbers);
        if (recursecount == 0) {
            return;
        } else {
            recursecount--;

            second(numbers, recursecount, al);
        }
    }

    public void flip(ArrayList<Integer> numbers) {
        ArrayList<Integer> flip = new ArrayList<Integer>(numbers);
        for (int i = 0; i < numbers.size() - 1; i++) {
            flip.set(i, numbers.get(i + 1));
        }
        flip.set(numbers.size() - 1, numbers.get(0));

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, flip.get(i));
        }
    }
}