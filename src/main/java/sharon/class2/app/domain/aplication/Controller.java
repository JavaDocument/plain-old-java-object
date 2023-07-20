package sharon.class2.app.domain.aplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.arraycopy;
import static sharon.class2.app.domain.aplication.Service.inputResult;
import static sharon.class2.app.domain.global.EmployeesData.EmployeeList;

public class Controller {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void start() {

        inputResult(EmployeeList(), getNickname());
        getMail(EmployeeList(), getNickname());

    }

    public static String getNickname() {
        String newNickname = null;
        System.out.print("닉네임을 입력하세요: ");
        try {
            newNickname = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newNickname;
    }

    public static String[][] getMail(String[][] employees, String newNickname) {

        System.out.print("메일을 입력하세요: ");
        String newEmail = null;
        try {
            newEmail = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return addIntoEmployeeList(newNickname, newEmail, employees);
    }

    private static String[][] addIntoEmployeeList(String newNickname, String newEmail, String[][] employees) {
        String[][] newEmployeeList = new String[employees.length + 1][2];
        arraycopy(employees, 0, newEmployeeList, 0, employees.length);
        newEmployeeList[employees.length][0] = newEmail;
        newEmployeeList[employees.length][1] = newNickname;

        return newEmployeeList;
    }
}
