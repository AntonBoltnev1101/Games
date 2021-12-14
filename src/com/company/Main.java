package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        int firstPlayer = 0;
        int secondPlayer = 0;

        System.out.println();
        System.out.println("Если хотите сыграть в игру \"УГАДАЙ ЧИСЛО\", нажмите 1.".toUpperCase(Locale.ROOT) + " || "
                + "Если хотите сыграть в игру \"ШАРИКИ\", нажмите 2.\n".toUpperCase(Locale.ROOT));
        System.out.print("Выберите игру: ".toUpperCase(Locale.ROOT));
        int chooseGame = Integer.parseInt(reader.readLine());

        if (chooseGame == 1) {
            System.out.println("Вы выбрали игру \"УГАДАЙ ЧИСЛО\"".toUpperCase(Locale.ROOT));
        } else if (chooseGame == 2) {
            System.out.println("Вы выбрали игру \"Шарики\"".toUpperCase(Locale.ROOT));
        } else
            return;


        //"УГАДАЙ ЧИСЛО"
        if (chooseGame == 1) {
            Thread.sleep(2000);
            System.out.println("Играет первый игрок.".toUpperCase(Locale.ROOT));
            Thread.sleep(2000);


            for (int k = 0; k < 6; k++) {
                if (k == 0) {
                    System.out.println("Первый раунд".toUpperCase(Locale.ROOT));

                }
                if (k == 1) {
                    System.out.println("Второй раунд".toUpperCase(Locale.ROOT));

                }
                if (k == 2) {
                    System.out.println("Третий раунд".toUpperCase(Locale.ROOT));
                }
                if (k == 3) {
                    System.out.println("Играет игрок №2".toUpperCase(Locale.ROOT));

                    System.out.println("Четвертый раунд".toUpperCase(Locale.ROOT));

                }
                if (k == 4) {
                    System.out.println("Пятый раунд".toUpperCase(Locale.ROOT));

                }
                if (k == 5) {
                    System.out.println("Шестой раунд".toUpperCase(Locale.ROOT));

                }


                System.out.print("Введите счастливое число: ".toUpperCase(Locale.ROOT));
                int chislo = Integer.parseInt(reader.readLine());
                System.out.println("Вы ввели число: ".toUpperCase(Locale.ROOT) + chislo);

                Thread.sleep(3000);
                System.out.println("Удачи".toUpperCase(Locale.ROOT));
                Thread.sleep(3000);

                for (int i = 5; i >= 0; i--) {
                    System.out.println("Игра начинается через: ".toUpperCase(Locale.ROOT) + i);
                    Thread.sleep(1000);
                }


                for (int i = 0; i < a.length; i++) {
                    a[i] = (int) (Math.random() * 51);
                }

                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                System.out.println();

                for (int i = 0; i < a.length; i++) {
                    if (a[i] == chislo) {
                        System.out.println("Ваше счастливое число есть в списке.".toUpperCase(Locale.ROOT));
                        if (k < 3) {
                            firstPlayer++;
                        } else {
                            secondPlayer++;
                        }
                        System.out.println("Вы заработали балл".toUpperCase(Locale.ROOT));
                        break;
                    } else if (a[i] != chislo) {
                        if (i == 9) {
                            System.out.println("Число не найдено.".toUpperCase(Locale.ROOT));
                            System.out.println("Вы не заработали балл.".toUpperCase(Locale.ROOT));
                            break;
                        }
                    }
                }

                Thread.sleep(1000);
                System.out.println();

                if (k == 5) {
                    if (firstPlayer > secondPlayer) {
                        System.out.println("Игрок №1 выиграл".toUpperCase(Locale.ROOT));
                    } else if (firstPlayer < secondPlayer) {
                        System.out.println("Игрок №2 выиграл".toUpperCase(Locale.ROOT));
                    } else System.out.println("Ничья".toUpperCase(Locale.ROOT));
                    System.out.println("Всего баллов у игрока №1: ".toUpperCase(Locale.ROOT) + firstPlayer);
                    System.out.println("Всего баллов у игрока №2: ".toUpperCase(Locale.ROOT) + secondPlayer);
                }

            }
        }

        //ИГРА "ШАРИКИ"
        if (chooseGame == 2) {
            int countofballsFirst = 10;
            int countofballsSec = 10;
            int round = 1;
            while (countofballsFirst != 0 && countofballsSec != 0) {
                Thread.sleep(3000);

                if (round % 2 != 0) {
                    System.out.println("Раунд № ".toUpperCase(Locale.ROOT) + round);
                    Thread.sleep(3000);
                    System.out.println("В этом раунде игрок №2 отгадывает.".toUpperCase(Locale.ROOT));
                    System.out.println("Игрок №1 делает ставку: ".toUpperCase(Locale.ROOT));
                    int stavkaFirst = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < 20; i++) {
                        System.out.println();
                    }
                    System.out.print("Игрок №2 делает ставку: ".toUpperCase(Locale.ROOT));
                    int stavkaSec = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < 20; i++) {
                        System.out.println();
                    }

                    System.out.print("Игрок №2, введите 1, если четное и 2 если нечетное: ".toUpperCase(Locale.ROOT));
                    int chetNechet = Integer.parseInt(reader.readLine());
                    if (stavkaFirst % 2 == 0 && chetNechet == 1) {
                        countofballsSec += stavkaFirst;
                        countofballsFirst -= stavkaFirst;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaFirst % 2 != 0 && chetNechet == 2) {
                        countofballsSec += stavkaFirst;
                        countofballsFirst -= stavkaFirst;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaFirst % 2 == 0 && chetNechet == 2) {
                        countofballsFirst += stavkaSec;
                        countofballsSec -= stavkaSec;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaFirst % 2 != 0 && chetNechet == 1) {
                        countofballsFirst += stavkaSec;
                        countofballsSec -= stavkaSec;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    }

                    if (countofballsFirst == 0 || countofballsSec == 0) {
                        System.out.println("Игра закончена".toUpperCase(Locale.ROOT));
                        if (countofballsFirst > countofballsSec) {
                            System.out.println("Выиграл игрок №1".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        } else if (countofballsFirst < countofballsSec) {
                            System.out.println("Выиграл игрок №2".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        } else {
                            System.out.println("Ничья".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        }

                    }
                    round++;
                    Thread.sleep(2000);
                    System.out.println();

                }

                if (round % 2 == 0) {
                    System.out.println("Раунд № " + round);
                    System.out.println("В этом раунде игрок №1 отгадывает.".toUpperCase(Locale.ROOT));
                    System.out.print("Игрок №1 делает ставку: ".toUpperCase(Locale.ROOT));
                    int stavkaFirst = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < 20; i++) {
                        System.out.println();
                    }
                    System.out.print("Игрок №2 делает ставку: ".toUpperCase(Locale.ROOT));
                    int stavkaSec = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < 20; i++) {
                        System.out.println();
                    }
                    System.out.print("Игрок №1, введите 1, если четное и 2 если нечетное: ".toUpperCase(Locale.ROOT));
                    int chetNechet = Integer.parseInt(reader.readLine());
                    if (stavkaSec % 2 == 0 && chetNechet == 1) {
                        countofballsFirst += stavkaSec;
                        countofballsSec -= stavkaSec;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaSec % 2 != 0 && chetNechet == 2) {
                        countofballsFirst += stavkaSec;
                        countofballsSec -= stavkaSec;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaSec % 2 == 0 && chetNechet == 2) {
                        countofballsSec += stavkaFirst;
                        countofballsFirst -= stavkaFirst;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    } else if (stavkaSec % 2 != 0 && chetNechet == 1) {
                        countofballsSec += stavkaFirst;
                        countofballsFirst -= stavkaFirst;
                        System.out.println(countofballsFirst + " " + countofballsSec);
                    }


                    if (countofballsFirst == 0 || countofballsSec == 0) {
                        System.out.println("Игра закончена".toUpperCase(Locale.ROOT));
                        if (countofballsFirst > countofballsSec) {
                            System.out.println("Выиграл игрок №1".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        } else if (countofballsFirst < countofballsSec) {
                            System.out.println("Выиграл игрок №2".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        } else {
                            System.out.println("Ничья".toUpperCase(Locale.ROOT));
                            System.out.println("Итоговый счет: ".toUpperCase(Locale.ROOT) + countofballsFirst + " " + countofballsSec);
                            break;
                        }

                    }
                    round++;
                    Thread.sleep(2000);
                    System.out.println();

                }


            }
        }

    }

}


