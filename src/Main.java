import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        calc(input);
    }

    public static String calc(String input) {
        input = input.toUpperCase();
        input = input.trim();
        String[] parts = input.split(" ");
            determinateArabicVar x = new determinateArabicVar();
            determinateArabicVar y = new determinateArabicVar();
            boolean rome1 = x.assignIsRome(parts[0]);
            boolean rome2 = y.assignIsRome(parts[2]);
            determinateArabicVar f = new determinateArabicVar();
            determinateArabicVar s = new determinateArabicVar();
            String answer = "";
        switch (parts[1]) {
            case "*":
                break;
            case "/":
                break;
            case "+":
                break;
            case "-":
                break;
            default:
                try {
                    throw new SomeException("т.к. строка не является математической операцией ");
                } catch (SomeException e) {
                    throw new RuntimeException(e);
                }
        }



            if ((rome1 && rome2) == true) {
                int a = x.assignRome(parts[0]);
                int b = y.assignRome(parts[2]);
                int c = 0;
                switch (parts[1]) {
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        c = a / b;
                        break;
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = a - b;
                        break;
                }
                if (c < 0) {
                    try {
                        throw new SomeException("т.к. в римской системе нет отрицательных чисел");
                    } catch (SomeException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    String one = f.firstRome(c);
                    String two = s.secondRome(c);
                    answer = one + two;
                    System.out.println(answer);
                    return answer;
                }
            } else if (((x.assign(parts[0])) * (x.assign(parts[2]))) != 0) {
                int a = x.assign(parts[0]);
                int b = y.assign(parts[2]);
                int c = 0;
                switch (parts[1]) {
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        c = a / b;
                        break;
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = a - b;
                        break;
                }
                answer = answer + c;
                System.out.println(answer);
                return answer;
            }

            else {
                try {
                    throw new SomeException("т.к. используются одновременно разные системы счисления");
                } catch (SomeException e) {
                    throw new RuntimeException(e);
                }
            }

        }


    }

    class SomeException extends Throwable {
        SomeException(String message) {
            super(message);
        }
    }


    class determinateArabicVar {
        String firstRome(int var) {
            var = var / 10;
            String fRome = "";
            switch (var) {
                case 1:
                    fRome = "X";
                    break;
                case 2:
                    fRome = "XX";
                    break;
                case 3:
                    fRome = "XXX";
                    break;
                case 4:
                    fRome = "XL";
                    break;
                case 5:
                    fRome = "L";
                    break;
                case 6:
                    fRome = "LX";
                    break;
                case 7:
                    fRome = "LXX";
                    break;
                case 8:
                    fRome = "LXXX";
                    break;
                case 9:
                    fRome = "XC";
                    break;
                case 10:
                    fRome = "C";
                    break;
            }
            return fRome;
        }

        String secondRome(int var) {
            var = var % 10;
            String fRome = "";
            switch (var) {
                case 1:
                    fRome = "I";
                    break;
                case 2:
                    fRome = "II";
                    break;
                case 3:
                    fRome = "III";
                    break;
                case 4:
                    fRome = "IV";
                    break;
                case 5:
                    fRome = "V";
                    break;
                case 6:
                    fRome = "VI";
                    break;
                case 7:
                    fRome = "VII";
                    break;
                case 8:
                    fRome = "VIII";
                    break;
                case 9:
                    fRome = "IX";
                    break;
            }
            return fRome;
        }


        boolean assignIsRome(String var) {
            boolean isRome = false;
            switch (var) {
                case "I":
                    isRome = true;
                    break;
                case "II":
                    isRome = true;
                    break;
                case "III":
                    isRome = true;
                    break;
                case "IV":
                    isRome = true;
                    break;
                case "V":
                    isRome = true;
                    break;
                case "VI":
                    isRome = true;
                    break;
                case "VII":
                    isRome = true;
                    break;
                case "VIII":
                    isRome = true;
                    break;
                case "IX":
                    isRome = true;
                    break;
                case "X":
                    isRome = true;
                    break;
                default:
                    isRome = false;
                    break;
            }
            return isRome;
        }

        int assign(String var) {
            int intVar = 0;
            switch (var) {
                case "1":
                    intVar = 1;
                    break;
                case "2":
                    intVar = 2;
                    break;
                case "3":
                    intVar = 3;
                    break;
                case "4":
                    intVar = 4;
                    break;
                case "5":
                    intVar = 5;
                    break;
                case "6":
                    intVar = 6;
                    break;
                case "7":
                    intVar = 7;
                    break;
                case "8":
                    intVar = 8;
                    break;
                case "9":
                    intVar = 9;
                    break;
                case "10":
                    intVar = 10;
                    break;
                case "0":
                    intVar = 0;
                    break;
            }
            return intVar;
        }

        int assignRome(String var) {
            int intVar = 0;
            switch (var) {
                case "I":
                    intVar = 1;
                    break;
                case "II":
                    intVar = 2;
                    break;
                case "III":
                    intVar = 3;
                    break;
                case "IV":
                    intVar = 4;
                    break;
                case "V":
                    intVar = 5;
                    break;
                case "VI":
                    intVar = 6;
                    break;
                case "VII":
                    intVar = 7;
                    break;
                case "VIII":
                    intVar = 8;
                    break;
                case "IX":
                    intVar = 9;
                    break;
                case "X":
                    intVar = 10;
                    break;
                case "0":
                    intVar = 0;
                    break;
            }
            return intVar;
        }
    }


