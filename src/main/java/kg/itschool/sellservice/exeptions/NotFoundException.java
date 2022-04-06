package kg.itschool.sellservice.exeptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends RuntimeException{
    String title;

    public NotFoundException(String message, String title) { // конструктор класса
        super(message);
        this.title = title;
    }
}
