package HomeWork4Exception;


public class ExceptionMain {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
        } catch (Throwable e) {
            System.out.println("Перехвачено!");
        }
    }
}
