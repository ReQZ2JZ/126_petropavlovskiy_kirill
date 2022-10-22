public class Task_2 implements Task_2_base {
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int MaxNumber = 0, FinalSquareNumber = 0;
        while (MaxNumber <= num){
            if(MaxNumber*MaxNumber <= num)
                FinalSquareNumber = MaxNumber*MaxNumber;
            else
                break;
            MaxNumber++;
        }
        return FinalSquareNumber;

    }


    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int p1 = 1,p2 = 1, k = 0;
        while (k != num){
            p1 = p2;
            p2 = 2 * p1 + 6;
            k= k + 1;
        }
        return p2;
    }


    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int x = base;
        while (x < num)
            x = x * base;
        return x == num;
    }


    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
        int x = 0;
        while (start > end){
            if (start %2 != 0 || start - end <= 2) {
                start -= 1;
                x++;
            } else {
                start /= 2;
                x++;
            }
        }
        return x;
    }
}
