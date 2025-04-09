public class PriceException extends Exception{

    @Override
    public String getMessage() {
        return "Невалидна стойност за цена";
    }
}
