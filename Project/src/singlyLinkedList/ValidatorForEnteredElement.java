package singlyLinkedList;


public class ValidatorForEnteredElement {

    public static void validatedElement(int element, SinglyLinkedList list) {

        String message = "Please enter a new number ";
        if (element < 0) {
            throw new IllegalArgumentException("Please enter a positive Integer number for the desired element!\n" + message + ": ");
        }
        if (element >= list.getSize()) {
            String messageOutput = "Invalid number for element! The entered number must be " +
                    "between 0 and " + (list.getSize() - 1) + ".\n" + message + ": ";
            throw new IllegalArgumentException(messageOutput);
        }

    }

}
