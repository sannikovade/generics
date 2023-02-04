public class Main {
    public static void main(String[] args) {

        MagicBox<String> boxOfClothes = new MagicBox<>(3);
        MagicBox<Integer> boxOfNumbers = new MagicBox<>(5);

        boxOfClothes.add("shirt");
        boxOfClothes.add("jeans");
        boxOfClothes.add("jacket");
        boxOfClothes.add("dress");
        System.out.println(boxOfClothes.toString());
        String pieceOfClothing = boxOfClothes.pick();
        System.out.println("Here's your " + pieceOfClothing);

        boxOfNumbers.add(6);
        boxOfNumbers.add(56);
        Integer number = boxOfNumbers.pick();
        System.out.println(number);
    }
}