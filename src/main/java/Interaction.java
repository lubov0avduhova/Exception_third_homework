import Exceptions.*;

import java.text.ParseException;
import java.util.Scanner;

public class Interaction {

    UserInfo userInfo;
    Scanner in;
    WrongUserInfoCodeException wrongUserInfoCodeException;
    DataBirthdayException dataBirthdayException;
    NumberException numberException;
    GenderInteraction genderInteraction;

    Interaction() {
        userInfo = new UserInfo();
        wrongUserInfoCodeException = new WrongUserInfoCodeException();
        dataBirthdayException = new DataBirthdayException();
        numberException = new NumberException();
        genderInteraction = new GenderInteraction();
    }

    public void runApp() {
        while (true) {
            System.out.println("Введите строку в формате: \n" +
                    "\"Фамилия Имя Отчество дата рождения номер телефона пол(f либо m)\": ");
            in = new Scanner(System.in);
            userInfo.splitString(in.nextLine());

            if (wrongUserInfoCodeException.countEnough(userInfo.getUserInfo())) {
                System.out.println("Ошибка! Вы ввели меньше или больше данных, чем требуется");
            } else {
                try {
                    dataBirthdayException.checkDate(userInfo.getUserInfobyIndex(3));
                    numberException.checkNumber(userInfo.getUserInfobyIndex(4));
                    genderInteraction.checkMale(userInfo.getUserInfobyIndex(5));
                    return;
                } catch (ParseException ex) {
                    System.out.println("Ошибка! Введите корректную дату");
                } catch (NumberFormatException ex) {
                    System.out.println("Ошибка! Введите номер без знаков");
                } catch (GenderException ex) {
                    System.out.println("Ошибка! Вы выбрали неверный пол");
                }
            }
        }
    }
}
