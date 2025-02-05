import java.util.Scanner;

public class SlrOption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                // Вариант 1: ввод желаемого дохода и количества опозданий
                int desiredIncome = scanner.nextInt();
                int tardinessCount = scanner.nextInt();

                // Рассчитываем, сколько Васе нужно получить с учетом штрафов
                int effectiveIncome = desiredIncome + (tardinessCount / 3) * 20;

                // Считаем минимальное количество строк кода
                int linesOfCodeNeeded = (effectiveIncome / 50) * 100;
                if (effectiveIncome % 50 != 0) {
                    linesOfCodeNeeded += 100;
                }

                System.out.println(linesOfCodeNeeded);
                break;

            case 2:
                // Вариант 2: ввод количества строк кода и желаемого объема зарплаты
                int linesOfCode = scanner.nextInt();
                int targetSalary = scanner.nextInt();

                // Рассчитываем зарплату за написанный код
                int salaryFromCode = (linesOfCode / 100) * 50;

                // Если даже зарплата за код меньше желаемой, выводим ERROR
                if (salaryFromCode < targetSalary) {
                    System.out.println("ERROR");
                } else {
                    // Рассчитываем максимальное количество опозданий
                    int maxTardiness = 0;
                    while (salaryFromCode - (maxTardiness / 3) * 20 >= targetSalary) {
                        maxTardiness++;
                    }
                    System.out.println(maxTardiness - 1);
                }
                break;

            case 3:
                // Вариант 3: ввод количества строк кода и количества опозданий
                int codeLines = scanner.nextInt();
                int tardyCount = scanner.nextInt();

                // Рассчитываем зарплату за написанный код
                int salaryFromCodePart3 = (codeLines / 100) * 50;

                // Рассчитываем штрафы
                int penalty = (tardyCount / 3) * 20;

                // Итоговая зарплата
                int finalSalary = salaryFromCodePart3 - penalty;

                // Если зарплата меньше или равна нулю, выводим 0
                System.out.println(Math.max(finalSalary, 0));
                break;

            default:
                // Если номер варианта расчета не 1, 2 или 3, выводим ERROR
                System.out.println("ERROR");
                break;
        }

        scanner.close();
    }
}
